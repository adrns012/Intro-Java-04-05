package com.tts.weatherApp.WeatherApp.repo;

import com.tts.weatherApp.WeatherApp.Model.ZipCode;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZipCodeRepo extends CrudRepository<ZipCode, Long> {
}
