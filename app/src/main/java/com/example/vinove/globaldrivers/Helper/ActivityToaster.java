package com.example.vinove.globaldrivers.Helper;

import android.app.Activity;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.widget.Toast;

public class ActivityToaster {


    public static void showToastShortessage (Activity activity, String text) {
        if (text != null) {
            DisplayMetrics displayMetrics = activity.getResources().getDisplayMetrics();
            float density = displayMetrics.density;
            Toast toast = Toast.makeText(activity, text,  Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, (int)(83 * density));
            toast.show();
        }
    }
    public static void showToastLongMessage (Activity activity, String text) {
        DisplayMetrics displayMetrics = activity.getResources().getDisplayMetrics();
        float density = displayMetrics.density;
        Toast toast = Toast.makeText(activity, text, Toast.LENGTH_LONG);
        toast.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, (int)(83 * density));
        toast.show();
    }
}
