package com.example.clickedbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textV;
    Button okButton;
    Button cancelButton;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textV = (TextView) findViewById(R.id.textV);
        okButton = (Button) findViewById(R.id.okButton);
        cancelButton = (Button) findViewById(R.id.cancelButton);

        View.OnClickListener onclBtnOk = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textV.setText("clicked ok");

            }
        };
        okButton.setOnClickListener(onclBtnOk);

        View.OnClickListener onclBtnCancel = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Меняем текст в TextView (tvOut)
                textV.setText("clicked Cancel");
            }
        };
        cancelButton.setOnClickListener(onclBtnCancel);


    }
}