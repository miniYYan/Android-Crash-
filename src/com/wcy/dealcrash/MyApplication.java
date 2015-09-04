package com.wcy.dealcrash;

import android.app.Application;
import android.util.Log;

public class MyApplication extends Application {
	
	private static final String TAG = "TAG";
	private static MyApplication sInstance;  
	  
    @Override  
    public void onCreate() {  
        super.onCreate();  
        sInstance = this;  
        Log.w(TAG, "-------------------------------->");
        //在这里为应用设置异常处理程序，然后我们的程序才能捕获未处理的异常  
        DealCrash crashHandler = DealCrash.getInstance();  
        crashHandler.init(this);  
    }  
  
    public static MyApplication getInstance() {  
        return sInstance;  
    }  

}
