package com.example.zxj.coolweather.gson;

/**
 * Created by zxj on 2018/5/3.
 */

public class AQI {

    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }

}
