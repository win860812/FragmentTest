package com.example.fragmenttest;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class Fragment2 extends Fragment {
    private View mainView; //取得這個Fragment的View
    private MainActivity mainActivity;

    @Override
    //取得MainActivity，呼叫onAttach
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        mainActivity = (MainActivity)context;
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        mainView = inflater.inflate(R.layout.fragment_2,container,false);
        Button f2btn = mainView.findViewById(R.id.f2btn); //取得F2得BUTTON
        //控制Button的點選
        f2btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            ClickF2();
            }
        });
        return mainView; //回傳給Main
    }

    private void ClickF2(){
        mainActivity.getF1().setMesg("F2toF1Message"); //將值經由MainActivity傳給F1
    }
}