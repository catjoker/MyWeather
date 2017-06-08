package com.example.straycat.weather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by stray cat on 2017/6/8.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
