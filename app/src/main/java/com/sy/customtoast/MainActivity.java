package com.sy.customtoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.valdesekamdem.library.mdtoast.MDToast;

public class MainActivity extends AppCompatActivity {

    Button info,success,error,warn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        info = findViewById(R.id.information);
        success = findViewById(R.id.success);
        warn = findViewById(R.id.warning);
        error = findViewById(R.id.error);

        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MDToast.makeText(getApplicationContext(),"INFORMATION",MDToast.LENGTH_SHORT,MDToast.TYPE_INFO).show();
            }
        });
        success.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MDToast.makeText(getApplicationContext(),"SUCCESS",MDToast.LENGTH_SHORT,MDToast.TYPE_SUCCESS).show();

            }
        });
        warn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MDToast.makeText(getApplicationContext(),"WARNING",MDToast.LENGTH_SHORT,MDToast.TYPE_WARNING).show();

            }
        });
        error.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MDToast.makeText(getApplicationContext(),"ERROR MASSAGE",MDToast.LENGTH_SHORT,MDToast.TYPE_ERROR).show();

            }
        });
    }
}