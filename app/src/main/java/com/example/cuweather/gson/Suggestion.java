package com.example.cuweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 汪汪汪 on 2017.05.31.
 */

public class Suggestion {

    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public Carwash carwash;

    public Sport sport;

    public class Comfort{

        @SerializedName("txt")
        public String info;
    }
    public class Carwash{

        @SerializedName("txt")
        public String info;
    }
    public class Sport{

        @SerializedName("txt")
        public String info;
    }
}
