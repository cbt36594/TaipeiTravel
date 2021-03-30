package com.nevic.taipeitravel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

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

        CallAPI callAPI = APIService.callAPI(this, APIService.getHeaders(new ArrayList<String>()));
        callAPI.TaipeiData("resourceAquire")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new SingleObserver<Response<Result>>() {

                    @Override
                    public void onSubscribe(@NonNull Disposable d) {

                    }

                    @Override
                    public void onSuccess(@NonNull Response<Result> resultResponse) {
                        System.out.println(resultResponse);
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {

                    }


                });
    }
}