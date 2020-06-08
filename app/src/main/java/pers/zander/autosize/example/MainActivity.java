package pers.zander.autosize.example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import pers.zander.autosize.AutoSize;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AutoSize.applyAdapt(getResources(), 375f, AutoSize.WIDTH_DP);
    }
}
