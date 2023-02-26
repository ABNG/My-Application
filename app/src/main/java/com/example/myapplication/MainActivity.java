package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import net.crystalapps.crystalkeyboard.services.CrystalKeyboard;

public class MainActivity extends AppCompatActivity {
TextView tv;
EditText et;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.textView);
        et=findViewById(R.id.editText);

    }

    public void clickit(View view) {
            tv.setText(et.getText().toString());

    }
    public void start(){
        Intent i=new Intent(android.provider.Settings.ACTION_INPUT_METHOD_SETTINGS);
        startActivityForResult(i,1);
    }

    public void change(View view) {
        start();
    }
}
