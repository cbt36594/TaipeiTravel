package com.nevic.taipeitravel.api;


import com.nevic.taipeitravel.model.SightseeingSpot;
import com.nevic.taipeitravel.model.TaipeiData;
import com.nevic.taipeitravel.model.Traffic;
import io.reactivex.Single;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface CallAPI {

    @GET("api/v1/dataset/36847f3f-deff-4183-a5bb-800737591de5")
    Single<Response<TaipeiData<SightseeingSpot>>> TaipeiData(@Query("scope") String scope, @Query("limit") String limit);

    @GET("api/v1/dataset/cb51a09c-a75a-462d-8383-d921bc37dbb3")
    Single<Response<TaipeiData<Traffic>>> TrafficControl(@Query("scope") String scope);
}
