package com.example.straycat.weather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by stray cat on 2017/6/8.
 */

public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
