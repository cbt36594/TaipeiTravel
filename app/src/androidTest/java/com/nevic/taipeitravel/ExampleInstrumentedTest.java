package com.nevic.taipeitravel;

import android.content.Context;
import android.util.Log;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;


import com.nevic.taipeitravel.api.APIService;
import com.nevic.taipeitravel.api.CallAPI;
import com.nevic.taipeitravel.log.Logger;
import com.nevic.taipeitravel.log.UnitTestLogger;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.IOException;
import java.util.ArrayList;

import io.reactivex.SingleObserver;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Response;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {

    private Logger mLogger = new UnitTestLogger();
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertEquals("com.nevic.taipeitravel", appContext.getPackageName());
    }

    @Test
    public void getdata2() throws IOException {
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        CallAPI callAPI = APIService.callAPI(APIService.getHeaders(new ArrayList<String>()));
        callAPI.TaipeiData("resourceAquire","2")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new SingleObserver<Response<TaipeiData>>() {

                    @Override
                    public void onSubscribe(@NonNull Disposable d) {
                        System.out.println("resultResponse");
                    }

                    @Override
                    public void onSuccess(@NonNull Response<TaipeiData> resultResponse) {
                        mLogger.i("Nevic: ", resultResponse.body().toString());
                        System.out.println("Nevic");
                        System.out.println(resultResponse.body().toString());
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {
                        System.out.println("resultResponse");
                    }


                });
    }
}