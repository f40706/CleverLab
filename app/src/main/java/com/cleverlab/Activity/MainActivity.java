package com.cleverlab.Activity;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.cleverlab.Interface.MainView;
import com.cleverlab.Presenter.MainPresenter;
import com.cleverlab.R;

public class MainActivity extends AppCompatActivity implements MainView, View.OnClickListener {
    private String TAG="MainActivity";
    private LinearLayout PageViewLL;
    private MainPresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUI();
        setView();
        build();
        btnRegister();
    }
    private void setUI(){
        PageViewLL=findViewById(R.id.PageLL);
    }
    private void setView(){
        presenter = new MainPresenter(this,PageViewLL);
        presenter.setView(this);
    }
    private void build(){
        presenter.getPagebtn(4);
    }
    private void btnRegister(){
        presenter.setBtnClick(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.page_btn1:
                Log.i(TAG,"page_btn1");
                break;
            case R.id.page_btn2:
                Log.i(TAG,"page_btn2");
                break;
            case R.id.page_btn3:
                Log.i(TAG,"page_btn3");
                break;
            case R.id.page_btn4:
                Log.i(TAG,"page_btn4");
                break;
            default:
                break;

        }
    }
}
