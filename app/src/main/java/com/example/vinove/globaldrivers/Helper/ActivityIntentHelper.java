package com.example.vinove.globaldrivers.Helper;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.example.vinove.globaldrivers.Activities.ChooseUserTypeActivity;

public class ActivityIntentHelper {


    private static Intent getNewStandardIntent(Context packageContext, Class<?> cls) {
        Intent intent = new Intent(packageContext, cls);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        return intent;
    }

    public static Bundle getBundle(Activity activity) {
        Intent intent = activity.getIntent();
        Bundle bundle = intent.getExtras();
        return bundle;
    }

    public static Intent getChooseUserTypeActivity(Context context){

        return getNewStandardIntent(context, ChooseUserTypeActivity.class);
    }
}
