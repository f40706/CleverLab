package com.cleverlab.Presenter;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.cleverlab.Base.BasePresenter;
import com.cleverlab.Base.DensityConvert;
import com.cleverlab.Interface.MainView;
import com.cleverlab.R;

/**
 * Created by f4070 on 2018/3/11.
 */

public class MainPresenter extends BasePresenter {
    private MainView View;
    private LinearLayout PageViewLL;
    private DensityConvert densityConvert;
    private LinearLayout.LayoutParams ll_Parameter;
    private Button b1[];
    private int btn_cnt=0;
    public MainPresenter(Activity activity, LinearLayout PageViewLL) {
        super(activity);
        this.PageViewLL=PageViewLL;
        densityConvert =new DensityConvert(activity);
    }
    public void setView(MainView View){
        this.View=View;
    }
    public void getPagebtn(int count){
        b1=new Button[count];
        for(int i=0;i<count;i++){
            switch (i){
                case 0:
                    b1[0]=new Button(activity);
                    b1[0].setId(R.id.page_btn1);
                    b1[0].setText(R.string.Lab1_Page1);
                    ll_Parameter=getLayoutParams();
                    ll_Parameter.setMargins((int) densityConvert.convertDpToPx((float) 6.0),0,(int) densityConvert.convertDpToPx((float) 6.0),0);
                    b1[0].setBackground(activity.getDrawable(R.mipmap.frame));
                    PageViewLL.addView(b1[0],ll_Parameter);
                    break;
                case 1:
                    b1[1]=new Button(activity);
                    b1[1].setId(R.id.page_btn2);
                    b1[1].setText(R.string.Lab1_Page2);
                    ll_Parameter=getLayoutParams();
                    ll_Parameter.setMargins((int) densityConvert.convertDpToPx((float) 6.0),0,(int) densityConvert.convertDpToPx((float) 6.0),0);
                    b1[1].setBackground(activity.getDrawable(R.mipmap.frame));
                    PageViewLL.addView(b1[1],ll_Parameter);
                    break;
                case 2:
                    b1[2]=new Button(activity);
                    b1[2].setId(R.id.page_btn3);
                    b1[2].setText(R.string.Lab1_Page3);
                    ll_Parameter=getLayoutParams();
                    ll_Parameter.setMargins((int) densityConvert.convertDpToPx((float) 6.0),0,(int) densityConvert.convertDpToPx((float) 6.0),0);
                    b1[2].setBackground(activity.getDrawable(R.mipmap.frame));
                    PageViewLL.addView(b1[2],ll_Parameter);
                    break;
                case 3:
                    b1[3]=new Button(activity);
                    b1[3].setId(R.id.page_btn4);
                    b1[3].setText(R.string.Lab1_Page4);
                    ll_Parameter=getLayoutParams();
                    ll_Parameter.setMargins((int) densityConvert.convertDpToPx((float) 6.0),0,(int) densityConvert.convertDpToPx((float) 6.0),0);
                    b1[3].setBackground(activity.getDrawable(R.mipmap.frame));
                    PageViewLL.addView(b1[3],ll_Parameter);
                    btn_cnt=4;
                    break;
                default:
                    break;
            }
        }
    }
    public LinearLayout.LayoutParams getLayoutParams(){
        LinearLayout.LayoutParams ll=new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT);
        return ll;
    }
    public void setBtnClick(android.view.View.OnClickListener click){
        for(int i=0;i<btn_cnt;i++){
            b1[i].setOnClickListener(click);
        }
    }
}
