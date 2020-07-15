package com.example.fragmenttest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    //宣告所有Fragment
    private FragmentManager fmgr; //宣告處理Fragment的管理者
    private Fragment1 f1;
    private Fragment2 f2;
    private Fragment3 f3;
    private Fragment4 f4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fmgr = getSupportFragmentManager();
        f1 = new Fragment1();
        f2 = new Fragment2();
        f3 = new Fragment3();
        f4 = new Fragment4();
        //載入初始Fragment，就是F1
        FragmentTransaction transaction = fmgr.beginTransaction(); //開始一個換畫面的交易
        transaction.add(R.id.container,f1); //將Frent加入交易
        transaction.commit();  //執行
    }

    public void setF1(View view) {
        FragmentTransaction transaction = fmgr.beginTransaction(); //開始一個換畫面的交易
        transaction.replace(R.id.container,f1); //將Fragment加入交易
        transaction.commit();  //執行

    }
    public Fragment1 getF1(){return f1;} //取得F1的物件，為了給F2呼叫用

    public void setF2(View view) {
        FragmentTransaction transaction = fmgr.beginTransaction(); //開始一個換畫面的交易
        transaction.replace(R.id.container,f2); //將Fragment加入交易
        transaction.commit();  //執行
    }

    public void setF3(View view) {
        FragmentTransaction transaction = fmgr.beginTransaction(); //開始一個換畫面的交易
        transaction.replace(R.id.container,f3); //將Fragment加入交易
        transaction.commit();  //執行
    }

    public void setF4(View view) {
        FragmentTransaction transaction = fmgr.beginTransaction(); //開始一個換畫面的交易
        transaction.replace(R.id.container,f4); //將Fragment加入交易
        transaction.commit();  //執行
    }


}