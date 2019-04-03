package ru.startandroid.p0271getintentaction;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Info extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info);

        Intent intent = getIntent();
        String action = intent.getAction();

        String format = "";
        String textInfo = "";

        if (action.equals("ru.startandroid.intent.action.showdate")) {
            format = "dd.MM.yyyy";
            textInfo = "Date: ";
        } else if (action.equals("ru.startandroid.intent.action.showtime")) {
            format = "HH:mm:ss";
            textInfo = "Time: ";
        }

        SimpleDateFormat sdf = new SimpleDateFormat(format);
        String dateTime = sdf.format(new Date(System.currentTimeMillis()));

        TextView tvInfo = findViewById(R.id.tvInfo);
        tvInfo.setText(textInfo + dateTime);
    }
}
