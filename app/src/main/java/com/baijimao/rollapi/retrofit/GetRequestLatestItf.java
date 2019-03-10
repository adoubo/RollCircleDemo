package com.baijimao.rollapi.retrofit;

import com.baijimao.rollapi.bean.WinSsqBean;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * @author: baijimao
 * @date: 2019/3/10
 * Description:
 */
public interface GetRequestLatestItf {
    @GET("lottery/ssq/latest")
    Call<WinSsqBean> getLatestSsq();

}
