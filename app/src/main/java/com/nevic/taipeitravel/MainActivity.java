package com.nevic.taipeitravel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.nevic.taipeitravel.api.APIService;
import com.nevic.taipeitravel.api.CallAPI;

import java.util.ArrayList;

import io.reactivex.SingleObserver;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;

import io.reactivex.schedulers.Schedulers;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CallAPI callAPI = APIService.callAPI(APIService.getHeaders(new ArrayList<String>()));
        callAPI.TaipeiData("resourceAquire","2")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new SingleObserver<Response<TaipeiData>>() {

                    @Override
                    public void onSubscribe(@NonNull Disposable d) {
                        System.out.println(d.toString());
                    }

                    @Override
                    public void onSuccess(@NonNull Response<TaipeiData> resultResponse) {
                        Log.d("Test: ", resultResponse.body().toString());
                        System.out.println(resultResponse);
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {

                    }


                });
    }
}