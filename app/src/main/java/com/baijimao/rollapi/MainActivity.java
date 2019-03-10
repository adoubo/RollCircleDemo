package com.baijimao.rollapi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.baijimao.rollapi.bean.PageSsqBean;
import com.baijimao.rollapi.bean.WinSsqBean;
import com.baijimao.rollapi.retrofit.GetRequestExpectItf;
import com.baijimao.rollapi.retrofit.GetRequestLatestItf;
import com.baijimao.rollapi.retrofit.GetRequestPageItf;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private TextView responseTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        responseTxt = findViewById(R.id.response_txt);
        requestPage();
    }

    private void requestExpect() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://www.mxnzp.com/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        GetRequestExpectItf requestExpect = retrofit.create(GetRequestExpectItf.class);
        Call<WinSsqBean> call = requestExpect.getWinSsq(2018135);
        call.enqueue(new Callback<WinSsqBean>() {
            @Override
            public void onResponse(Call<WinSsqBean> call, final Response<WinSsqBean> response) {
                Log.i("cwx", "WinSsqBean: " + response.body());
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        responseTxt.setText(response.body().getData().toString());
                    }
                });
            }

            @Override
            public void onFailure(Call<WinSsqBean> call, Throwable t) {
                Log.i("cwx", "Failed: " + t.toString());
            }
        });

    }

    private void requestLatest() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://www.mxnzp.com/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        GetRequestLatestItf requestLatest = retrofit.create(GetRequestLatestItf.class);
        Call<WinSsqBean> call = requestLatest.getLatestSsq();
        call.enqueue(new Callback<WinSsqBean>() {
            @Override
            public void onResponse(Call<WinSsqBean> call, Response<WinSsqBean> response) {
                Log.i("cwx", "WinSsqBean: " + response.body());
            }

            @Override
            public void onFailure(Call<WinSsqBean> call, Throwable t) {
                Log.i("cwx", "Failed: " + t.toString());
            }
        });
    }

    private void requestPage() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://www.mxnzp.com/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        GetRequestPageItf requestPage = retrofit.create(GetRequestPageItf.class);
        Call<PageSsqBean> call = requestPage.getPage(1);
        call.enqueue(new Callback<PageSsqBean>() {
            @Override
            public void onResponse(Call<PageSsqBean> call, Response<PageSsqBean> response) {
                Log.i("cwx", "WinSsqBean: " + response.body());
            }

            @Override
            public void onFailure(Call<PageSsqBean> call, Throwable t) {
                Log.i("cwx", "Failed: " + t.toString());
            }
        });
    }


}
