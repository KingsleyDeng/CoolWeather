package com.shiliangdeng.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by shiliangdeng on 17/1/18.
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
