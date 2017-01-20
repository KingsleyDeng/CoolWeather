package com.shiliangdeng.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by shiliangdeng on 17/1/18.
 */

public class Basic {


    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateName;

    }

}
