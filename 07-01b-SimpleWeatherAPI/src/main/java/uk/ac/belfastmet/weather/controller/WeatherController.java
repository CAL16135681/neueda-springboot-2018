package uk.ac.belfastmet.weather.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import uk.ac.belfastmet.weather.domain.TodaysWeather;

@Controller
@RequestMapping
public class WeatherController {
	
	@GetMapping("")
	public String home () {
		
		return "home";
	}
	
	@GetMapping("/weather/{location}")
	public String belfast(@PathVariable("location") String location, Model model) {
		
		//build for the 3 cities
		String belfastWeatherUrl="http://www.codingfury.net/training/weathersample/weather.php?location=" + location;
		RestTemplate restTemplate1 = new RestTemplate();
		TodaysWeather todaysWeather = restTemplate1.getForObject(belfastWeatherUrl, TodaysWeather.class);
		
		
		
		//slf4j-----morado y el rojo, q sea el slf4j (mirar arriba)
		Logger logger = LoggerFactory.getLogger(TodaysWeather.class);
		logger.info(todaysWeather.toString());
		
		
					model.addAttribute("todaysWeather", todaysWeather);
		return "weather";
		
	}

}
