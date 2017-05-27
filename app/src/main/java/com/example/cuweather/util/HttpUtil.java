package com.example.cuweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by 汪汪汪 on 2017.05.25.
 */

public class HttpUtil {

    public static void sendOkHttpRequest(String address, okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
