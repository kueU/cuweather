package com.example.cuweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 汪汪汪 on 2017.05.31.
 */

public class AQI {

    @SerializedName("city")
    public AQICity aqiCity;

    public class AQICity{

        public String aqi;

        public String pm25;
    }
}
