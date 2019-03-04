package com.example.ui_demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void choosRadioButton(View radioButton){
        RadioButton button = (RadioButton) radioButton;
        Intent intent = new Intent(this, LayoutDemoActivity.class);
        if(button.getText().toString().equals(getString(R.string.k1_rbutton_1))){
            intent.putExtra("msg","linearLayout");
        }else{
            intent.putExtra("msg","relativLayout");
        }
        startActivity(intent);
    }





}
