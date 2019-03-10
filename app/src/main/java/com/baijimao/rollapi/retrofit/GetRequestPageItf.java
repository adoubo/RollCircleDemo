package com.baijimao.rollapi.retrofit;

import com.baijimao.rollapi.bean.PageSsqBean;
import com.baijimao.rollapi.bean.WinSsqBean;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * @author: baijimao
 * @date: 2019/3/10
 * Description:
 */
public interface GetRequestPageItf {

    @GET("lottery/ssq/lottery_list")
    Call<PageSsqBean> getPage(@Query("page") int page);

}
