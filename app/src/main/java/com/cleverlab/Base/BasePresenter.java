package com.cleverlab.Base;

import android.app.Activity;

/**
 * Created by f4070 on 2018/3/11.
 */

public class BasePresenter {
    protected Activity activity;
    public BasePresenter(Activity activity){
        this.activity=activity;
    }
}
