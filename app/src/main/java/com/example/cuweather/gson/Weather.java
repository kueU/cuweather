package com.example.cuweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by 汪汪汪 on 2017.05.31.
 */

public class Weather {

    public String status;

    public AQI aqi;

    public Basic basic;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;

    public Now now;

    public Suggestion suggestion;
}
