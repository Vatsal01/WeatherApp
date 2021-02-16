package com.example.weatherAPI.controller;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.springframework.data.repository.query.parser.Part.Type;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.weatherAPI.model.DataFromAPI;
import com.example.weatherAPI.model.WeatherData;

@Controller
public class WeatherController {

	Service service = new Service();

	// Mapping for endpoints

	@RequestMapping(value = "/weather", method = RequestMethod.GET)
	public String register() {
		return "home";
	}

	@RequestMapping(value = "/subDetails", method = RequestMethod.GET)
	public ModelAndView weatherPage(WeatherData wt) throws IOException, ParseException, java.text.ParseException {

		// Service class method getAPI is called with parameters City.
		// Based on which the API for specific city will be called

		DataFromAPI dataFromApi = service.getAPI(wt.getCity(), wt.getUnit()); // For API call and getting the data for
																				// specific city.

		// To assign specific unit based on the value of radio button(1:Celsius &
		// 2:Fahrenheit)

		String unt = "°C";
		if (wt.getUnit() == 2)
			unt = "°F";

		// Defining Model map to store the data in key-value pair
		// with the help of getters, fetching data from DataFromAPI class

		ModelMap model = new ModelMap();

		model.addAttribute("city", wt.getCity());

		model.addAttribute("unit", unt);

		model.addAttribute("temp", dataFromApi.getTemp());

		model.addAttribute("feelLike", dataFromApi.getFlike());

		model.addAttribute("max", dataFromApi.getTmax());

		model.addAttribute("min", dataFromApi.getTmin());

		model.addAttribute("press", dataFromApi.getPressure());

		model.addAttribute("hum", dataFromApi.getHumidity());

		model.addAttribute("desc", dataFromApi.getCweather());

		/*
		 * To generate URL for icon of different weather Type. The icon Id i fetched
		 * from JSON.
		 */

		String id = dataFromApi.getIconID();

		String iconUrl = "http://openweathermap.org/img/wn/" + id + "@4x.png";

		model.addAttribute("icon", iconUrl);

		ModelAndView mv = new ModelAndView("results");
		mv.addObject("data", model);

		return mv;
	}

}
