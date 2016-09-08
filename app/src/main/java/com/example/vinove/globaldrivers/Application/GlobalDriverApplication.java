package com.example.vinove.globaldrivers.Application;

import android.app.Application;
import android.content.res.Configuration;

public class GlobalDriverApplication extends Application {


    private static GlobalDriverApplication instance;

    public void onCreate(){

        super.onCreate();
    }




    public void onLowMemory(){
        super.onLowMemory();
    }


    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }

}
