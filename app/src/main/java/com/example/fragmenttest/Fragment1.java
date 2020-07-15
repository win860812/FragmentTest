package com.example.fragmenttest;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class Fragment1 extends Fragment {

    private View MainView;
    private TextView mesg;
    private String F2GiveMesg;

    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState){
        MainView = inflater.inflate(R.layout.fragment_1,container,false);
        mesg = MainView.findViewById(R.id.mesg);
        mesg.setText(F2GiveMesg);
        return MainView;
}

    public void setMesg(String F2Mesg){ //讓F2可以呼叫這個方法來對F1的介面做修改
       F2GiveMesg = F2Mesg;
    }


}