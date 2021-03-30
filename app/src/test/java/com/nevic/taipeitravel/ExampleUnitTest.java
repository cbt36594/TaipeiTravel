package com.nevic.taipeitravel;

import android.content.Context;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.nevic.taipeitravel.api.APIService;
import com.nevic.taipeitravel.api.CallAPI;

import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.net.URL;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import io.reactivex.SingleObserver;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Response;

import static org.junit.Assert.*;
import androidx.test.platform.app.InstrumentationRegistry;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

//    Context context = InstrumentationRegistry.getInstrumentation().getContext();

    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void getdata() throws IOException {
        Gson gson = new GsonBuilder().create();
        MyData t = new MyData();
        String file = readJsonFile("test");
        System.out.println(file);
        MyData test = gson.fromJson(file, MyData.class);
        System.out.println(test.getData().getResult().getLimit());
    }
    @Test
    public void getdata2() throws IOException {
        Gson gson = new GsonBuilder().create();
        CallAPI callAPI = APIService.callAPI(APIService.getHeaders(new ArrayList<String>()));
        callAPI.TaipeiData("resourceAquire")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new SingleObserver<Response<TaipeiData>>() {

                    @Override
                    public void onSubscribe(@NonNull Disposable d) {

                    }

                    @Override
                    public void onSuccess(@NonNull Response<TaipeiData> resultResponse) {
                        System.out.println(resultResponse);
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {

                    }


                });
    }
    private static File getFileFromPath(Object obj, String fileName) {
        ClassLoader classLoader = obj.getClass().getClassLoader();
        URL resource = classLoader.getResource(fileName);
        return new File(resource.getPath());
    }

    private static String readJsonFile(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("../app/src/main/assets/"+fileName)));
        StringBuilder sb = new StringBuilder();
        String line = br.readLine();
        while (line != null) {
            sb.append(line);
            line = br.readLine();
        }
        return sb.toString();
    }
}