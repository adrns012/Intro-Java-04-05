package com.tts.weatherApp.WeatherApp.service;

import com.tts.weatherApp.WeatherApp.Model.Response;
import com.tts.weatherApp.WeatherApp.repo.ZipCodeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {
    @Value("${api_key}")
    private String apiKey;

    @Autowired
//    Injects Dependencies
    public ZipCodeRepo zipCodeRepo;


    public Response getForecast(String zipCode){
        String url = "http://api.openweathermap.org/data/2.5/weather?zip="+
                zipCode + "&units=imperial&appid=" + apiKey;
        RestTemplate restTemplate = new RestTemplate();
        try{
            return restTemplate.getForObject(url, Response.class);
        }catch(HttpClientErrorException ex) {
            Response response = new Response();
            response.setName("error");
            return response;
        }
    }

}

