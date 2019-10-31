package com.rustli.androidmultimodule;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.rustli.liba.ModuleServiceA;
import com.rustli.libb.ModuleServiceB;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ModuleServiceA.init();
        String a = ModuleServiceB.methodB();
        Log.d(TAG, "onCreate: a = " + a);
    }
}
