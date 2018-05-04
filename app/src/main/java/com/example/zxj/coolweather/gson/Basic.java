package com.example.zxj.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by zxj on 2018/5/3.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;

    }
}
