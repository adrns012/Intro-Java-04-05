package com.tts.weatherApp.WeatherApp.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/*Data is getters, setters, toString.
 Entity creates an object. Others are the constructors.
 ID declares id and generated value makes one.*/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ZipCode {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @CreationTimestamp
    private Date timeStamp;
    private String ZipCode;
}

