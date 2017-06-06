package com.example.cuweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 汪汪汪 on 2017.05.31.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{

        @SerializedName("loc")
        public String updateName;

    }
}
