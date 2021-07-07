package com.nevic.taipeitravel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.nevic.taipeitravel.api.APIService;
import com.nevic.taipeitravel.api.CallAPI;
import com.nevic.taipeitravel.databinding.ActivityMainBinding;
import com.nevic.taipeitravel.model.TaipeiData;
import com.nevic.taipeitravel.model.Traffic;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.SingleObserver;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;

import io.reactivex.schedulers.Schedulers;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.btnGetText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getData();
            }
        });

    }

    private void getData() {
        CallAPI callAPI = APIService.callAPI(APIService.getHeaders(new ArrayList<String>()));
        callAPI.TrafficControl("resourceAquire")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new SingleObserver<Response<TaipeiData<Traffic>>>() {

                    @Override
                    public void onSubscribe(@NonNull Disposable d) {
                        Log.d("Test: ", d.toString());
                    }

                    @Override
                    public void onSuccess(@NonNull Response<TaipeiData<Traffic>> resultResponse) {
                        Log.d("Test: ", resultResponse.body().toString());
                        List<Traffic> result = resultResponse.body().getResult().getResults();
                        for(int i = 0; i < result.size();i++) {
                            Log.d("Test2: ", result.get(i).getControl());
                        }
                        binding.tvShowText.setText(result.get(0).getControl() + result.get(1).getControl());
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {
                        Log.d("Test: ",e.getMessage());
                    }


                });
    }
}