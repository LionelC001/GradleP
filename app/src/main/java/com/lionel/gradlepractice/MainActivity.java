package com.lionel.gradlepractice;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.lionel.gradlepractice.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ViewDataBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        ((ActivityMainBinding)binding).setGradleText(BuildConfig.build_Type);

    }
}
