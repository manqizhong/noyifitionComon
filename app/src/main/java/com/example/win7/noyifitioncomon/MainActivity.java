package com.example.win7.noyifitioncomon;

import android.app.Notification;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.main_textView).setOnClickListener(this);

        Notification notification = new Notification();
    }

    @Override
    public void onClick(View view) {

    }
}
