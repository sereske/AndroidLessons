package ru.startandroid.p0261intentfilter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {

    Button btnDate, btnTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDate = findViewById(R.id.btnDate);
        btnTime = findViewById(R.id.btnTime);

        btnDate.setOnClickListener(this);
        btnTime.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent;

        switch (view.getId()) {
            case R.id.btnTime:
                intent = new Intent("ru.startandroid.intent.action.showtime");
                startActivity(intent);
                break;
            case R.id.btnDate:
                intent = new Intent("ru.startandroid.intent.action.showdate");
                startActivity(intent);
                break;
        }
    }

    /*
    @Override
    public void onClick2(View view) {
        Intent intent;

        switch (view.getId()) {
            case R.id.btnTime:
                intent = new Intent("ru.startandroid.intent.action.showtime");
                startActivity(intent);
                break;
            case R.id.btnDate:
                intent = new Intent("ru.startandroid.intent.action.showdate");
                startActivity(intent);
                break;
        }
    }*/
}
