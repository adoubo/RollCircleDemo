package com.baijimao.rollapi.retrofit;

import com.baijimao.rollapi.bean.WinSsqBean;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * @author: baijimao
 * @date: 2019/3/10
 * Description:
 */
public interface GetRequestExpectItf {

    @GET("lottery/ssq/aim_lottery")
    Call<WinSsqBean> getWinSsq(@Query("expect") int expectId);

}
