package com.cleverlab.Base;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;

/**
 * Created by f4070 on 2018/3/11.
 */

public class DensityConvert {
    private float px;
    private float dp;
    private Activity activity;
    public DensityConvert(Activity activity){
        this.activity=activity;
    }
    public float convertDpToPx(float dp){
        px=dp*getDensity(activity);
        return px;
    }
    public float convertPxToDp(float px){
        dp=px/getDensity(activity);
        return dp;
    }
    public static float getDensity(Context context){
        DisplayMetrics metrics=context.getResources().getDisplayMetrics();
        return metrics.density;
    }
}
