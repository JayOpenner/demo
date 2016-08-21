package com.panggu.www.demo;

import android.app.Application;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * Created by 建文 on 2016/8/18.
 */
public class MyApplication extends Application {

    public static RequestQueue queues;
    @Override
    public void onCreate() {
        super.onCreate();
        queues= Volley.newRequestQueue(getApplicationContext());

    }
    public static RequestQueue getHttpQueues(){
        return  queues;
    }
}
