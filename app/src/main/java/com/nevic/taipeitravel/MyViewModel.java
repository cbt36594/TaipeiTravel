package com.nevic.taipeitravel;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.nevic.taipeitravel.api.APIService;
import com.nevic.taipeitravel.api.CallAPI;
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

public class MyViewModel extends ViewModel {

    private final CallAPI callAPI = APIService.callAPI(APIService.getHeaders(new ArrayList<String>()));

    private MutableLiveData<List<Traffic>> _traffic;
    public LiveData<List<Traffic>> traffic() {
        if (_traffic == null) {
            _traffic = new MutableLiveData<List<Traffic>>();

        }
        return _traffic;
    }
    private MutableLiveData<Boolean> _load = new MutableLiveData<Boolean>();
    public LiveData<Boolean> load = _load;

    public void getTrafficData() {
        _load.setValue(true);
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
                        _traffic.postValue(resultResponse.body().getResult().getResults());
                        _load.setValue(false);
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {
                        Log.d("Test: ",e.getMessage());
                        _load.setValue(false);
                    }

                });
    }
}
