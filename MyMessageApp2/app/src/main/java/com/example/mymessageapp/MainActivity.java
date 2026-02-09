package com.example.mymessageapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView textViewOutput;
    private Button buttonAction1;
    private Button buttonAction2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewOutput = findViewById(R.id.textViewOutput);
        buttonAction1 = findViewById(R.id.buttonAction1);
        buttonAction2 = findViewById(R.id.buttonAction2);

        buttonAction1.setOnClickListener(this);
        buttonAction2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();

        if (id == R.id.buttonAction1) {
            textViewOutput.setText("Ваш ответ: ДА. Поздравляем с решением!");
            Toast.makeText(this, "Ваш ответ: ДА. Поздравляем с решением!", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.buttonAction2) {
            textViewOutput.setText("Вы ответили НЕТ. Может, передумаете?");
            Toast.makeText(this, "Вы ответили НЕТ. Может, передумаете?", Toast.LENGTH_SHORT).show();
        }
    }
}