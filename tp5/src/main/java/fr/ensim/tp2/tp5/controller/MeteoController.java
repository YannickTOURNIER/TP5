package fr.ensim.tp2.tp5.controller;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import fr.ensim.tp2.tp5.model.Adresse;
import fr.ensim.tp2.tp5.model.Feature;
import fr.ensim.tp2.tp5.model.FeatureCollection;
import fr.ensim.tp2.tp5.model.Geometry;
import fr.ensim.tp2.tp5.model.Main;
import fr.ensim.tp2.tp5.model.OpenWeatherMap;
import fr.ensim.tp2.tp5.model.OpenWeatherMapForecast;
import fr.ensim.tp2.tp5.model.Weather;
import fr.ensim.tp2.tp5.model.WeatherList;

@Controller
public class MeteoController {
	@PostMapping("/meteo")
	public String Adresse(/**@RequestParam(name="adresseGET")String adresseGET,**/@RequestBody Adresse adresse,Model model/**,@ModelAttribute("adresse")Adresse adresse**/) {
		model.addAttribute("nomAdresse", adresse.getAdresse());
		//model.addAttribute("nomAdresse", adresseGET);
		RestTemplate restTemplate=new RestTemplate();
		//obtenir la longitude et la latitude de l adresse demande
		//grace a l API adresse.data.gouv.fr
		FeatureCollection featureCollection=restTemplate.getForObject("https://api-adresse.data.gouv.fr/search/?q="+adresse.getAdresse(), FeatureCollection.class);
		Feature feature=featureCollection.getFeature().get(0);
		Geometry geometry=feature.getGeometry();
		float Lon=geometry.getCoordinates().get(0);
		float Lat=geometry.getCoordinates().get(1);
		
		
		RestTemplate restTemplate2=new RestTemplate();
		//obtenir le temps et la temperature de l adresse demande
		//grace a l API openweathermap
		OpenWeatherMap openWeatherMap=restTemplate2.getForObject("http://api.openweathermap.org/data/2.5/weather?lat="+Lat+"&lon="+Lon+"&appid=969c3a2b09973a09dec548157cd9c081", OpenWeatherMap.class);
		Weather weather=openWeatherMap.getWeather().get(0);
		model.addAttribute("weather",weather.getDescription());
		Main main=openWeatherMap.getMain();
		model.addAttribute("temp",main.getTemp());
		
		
		//obtenir les previsions meteo sur 5 jours toute les 3h
		RestTemplate restTemplate3=new RestTemplate();
		OpenWeatherMapForecast openWeatherMapF=restTemplate3.getForObject("http://api.openweathermap.org/data/2.5/forecast?lat="+Lat+"&lon="+Lon+"&appid=969c3a2b09973a09dec548157cd9c081", OpenWeatherMapForecast.class);
		ArrayList<WeatherList> weatherList=openWeatherMapF.getFeatureCollection();
		model.addAttribute("prediction",weatherList);
		return "meteo";
	}


}
