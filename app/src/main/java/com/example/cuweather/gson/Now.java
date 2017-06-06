package com.example.cuweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 汪汪汪 on 2017.05.31.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{

        @SerializedName("txt")
        public String info;
    }
}
