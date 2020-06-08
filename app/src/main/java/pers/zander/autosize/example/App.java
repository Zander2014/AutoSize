package pers.zander.autosize.example;

import android.app.Application;

import pers.zander.autosize.AutoSize;

/**
 * Created by Zander on 2020-06-08.
 * Author:Zander
 * Mail:zander.zhang2018@gmail.com
 * Depiction:
 */
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        AutoSize.applyAdapt(getResources(), 375f, AutoSize.WIDTH_DP);
    }
}
