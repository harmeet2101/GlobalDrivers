package com.example.vinove.globaldrivers.Activities;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;

import com.example.vinove.globaldrivers.Helper.ActivityIntentHelper;
import com.example.vinove.globaldrivers.R;

public class SplashActivity extends Activity {

    private static final long time_delay=3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Activity activity=SplashActivity.this;
                startActivity(ActivityIntentHelper.getChooseUserTypeActivity(activity));
                finish();
            }
        }, time_delay);
    }
}
