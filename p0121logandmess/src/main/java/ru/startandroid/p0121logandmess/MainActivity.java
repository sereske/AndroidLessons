package ru.startandroid.p0121logandmess;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener {

    private static final String TAG = "myLogs";

    TextView tvOut;
    Button btnOk;
    Button btnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // V - verbose
        // D - debug
        // I -
        // W - warning
        // E - error
        Log.d(TAG, "найдем View элементы");
        tvOut = findViewById(R.id.tvOut);
        btnOk = findViewById(R.id.btnOk);
        btnCancel = findViewById(R.id.btnCancel);

        Log.d(TAG, "присваиваем обработчик кнопкам");
        btnOk.setOnClickListener(this);
        btnCancel.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Log.d(TAG, "по id определяем кнопку, вызвавшую этот обработчик");
        switch (view.getId()) {
            case R.id.btnOk:
                Log.d(TAG, "кнопка OK");
                tvOut.setText("Нажата кнопка OK");
                Toast.makeText(this, "Нажата кнопка OK", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnCancel:
                Log.d(TAG, "кнопка Cancel");
                tvOut.setText("Нажата кнопка Cancel");
                Toast.makeText(this, "Нажата кнопка Cancel", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
