package com.nevic.taipeitravel.api;

import io.reactivex.rxjava3.core.Single;
import retrofit2.Response;
import retrofit2.http.GET;

public interface CallAPI {

    @GET("checkIn/mUseLocationType")
    Single<Response<String>> TaipeiData();
}
