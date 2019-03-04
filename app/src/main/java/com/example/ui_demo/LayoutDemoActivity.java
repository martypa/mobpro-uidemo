package com.example.ui_demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class LayoutDemoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        String msg = intent.getExtras().getString("msg");
        if(msg.equals("linearLayout")){
            setContentView(R.layout.layoutdemo_linearlayout);
        }else{
            setContentView(R.layout.layoutdemo_contstraintlayout);
        }


    }
}
