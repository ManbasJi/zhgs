package com.manbas.zhg.utils;

import com.manbas.zhg.config.AppConfig;

/**
 * Created by Administrator on 2016/11/4.
 * 日志打印类
 */

public class LogUtil {
    public static final boolean hasLog= AppConfig.DEBUG;
    public static final String TAG = "zhg";

    public static void Log(String tag,String paramString){
        if(hasLog)
            android.util.Log.i(tag,paramString);
    }

    public static void Log(String paramString){
        Log(TAG,paramString);
    }

    public static void ErrorLog( Exception e) {
        ErrorLog(TAG, e);
    }

    public static void ErrorLog(String tag, Exception e) {
        if (hasLog)
            android.util.Log.e(tag, "", e);
    }

    public static void e(String paramString){
        if (hasLog)
            android.util.Log.e(TAG,paramString);
    }


}
