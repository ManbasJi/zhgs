package com.manbas.zhg.utils;

import android.content.Context;
import android.content.SharedPreferences;

import com.manbas.zhg.config.AppConfig;

/**
 * Created by Administrator on 2016/11/4.
 */

public class SharedPreferencesUtils {
    public static String SHARED_PATH;
    private static SharedPreferences sharedPreferences;

    public SharedPreferencesUtils() {
    }

    public static SharedPreferences getDefaultSharedPreferences(Context context) {
        if(sharedPreferences == null) {
            sharedPreferences = context.getSharedPreferences(SHARED_PATH, 0);
        }

        return sharedPreferences;
    }

    public static void putInt(Context context, String key, int value) {
        SharedPreferences sharedPreferences = getDefaultSharedPreferences(context);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putInt(key, value);
        edit.commit();
    }

    public static int getInt(Context context, String key, int defValue) {
        SharedPreferences sharedPreferences = getDefaultSharedPreferences(context);
        return sharedPreferences.getInt(key, defValue);
    }

    public static void putString(Context context, String key, String value) {
        SharedPreferences sharedPreferences = getDefaultSharedPreferences(context);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString(key, value);
        edit.commit();
    }

    public static String getString(Context context, String key, String defValue) {
        SharedPreferences sharedPreferences = getDefaultSharedPreferences(context);
        return sharedPreferences.getString(key, defValue);
    }

    public static void putBoolean(Context context, String key, boolean value) {
        SharedPreferences sharedPreferences = getDefaultSharedPreferences(context);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean(key, value);
        edit.commit();
    }

    public static boolean getBoolean(Context context, String key, boolean defValue) {
        SharedPreferences sharedPreferences = getDefaultSharedPreferences(context);
        return sharedPreferences.getBoolean(key, defValue);
    }

    public static void remove(Context context, String key) {
        SharedPreferences sharedPreferences = getDefaultSharedPreferences(context);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.remove(key);
        edit.commit();
    }

    static {
        SHARED_PATH = AppConfig.SHARED_PREFERENCE_NAME;
    }
}
