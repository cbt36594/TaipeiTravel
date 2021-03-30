package com.nevic.taipeitravel.api;

import android.content.Context;

import java.util.HashMap;
import java.util.List;

import retrofit2.Retrofit;

public class APIService {

    public static CallAPI callAPI(HashMap<String, String> map) {

        Retrofit retrofit = APIClient.createJSONRetrofit("https://data.taipei/", map);
        return retrofit.create(CallAPI.class);
    }

    public static HashMap<String, String> getHeaders(List<String> authorizations) {
        HashMap<String, String> headers = new HashMap<>();
        headers.put("Authorization", "");
        headers.put("Accept-Language", "zh-tw");

        return headers;
    }
}
