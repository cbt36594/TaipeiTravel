package com.nevic.taipeitravel.api;

import com.nevic.taipeitravel.Result;


import io.reactivex.Single;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface CallAPI {

    @GET("api/v1/dataset/36847f3f-deff-4183-a5bb-800737591de5")
    Single<Response<Result>> TaipeiData(@Query("scope") String scope);
}
