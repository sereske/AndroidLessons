package ru.startandroid.p0081viewbyid;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView myTextView = findViewById(R.id.myText);
        myTextView.setText("New Text int TextView");

        Button myBtn = findViewById(R.id.button);
        myBtn.setText("My Button");
        myBtn.setEnabled(false);

        CheckBox myChb = findViewById(R.id.checkBox);
        myChb.setChecked(true);
    }
}
