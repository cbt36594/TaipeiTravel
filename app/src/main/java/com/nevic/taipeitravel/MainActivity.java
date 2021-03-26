package com.nevic.taipeitravel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.nevic.taipeitravel.api.APIService;
import com.nevic.taipeitravel.api.CallAPI;

import java.util.ArrayList;
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.operators.observable.ObservableSingleMaybe;
import io.reactivex.rxjava3.observers.DisposableSingleObserver;
import io.reactivex.rxjava3.schedulers.Schedulers;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CallAPI callAPI = APIService.callAPI(this, APIService.getHeaders(new ArrayList<String>()));
        callAPI.TaipeiData()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .doOnSubscribe(new Consumer() {

                    @Override
                    public void accept(Object o) throws Throwable {

                    }

                });
    }
}