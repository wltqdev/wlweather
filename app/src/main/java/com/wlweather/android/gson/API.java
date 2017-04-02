package com.wlweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Frederic on 2017/4/1.
 */

public class API {
    public APICity city;
    public class APICity{
        public String api;
        public String pm25;
    }
}
