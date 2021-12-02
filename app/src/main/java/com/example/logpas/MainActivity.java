package com.example.logpas;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.logpas.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    public static final String USER = "BadHard";
    public static final String PASS = "Qwerty123";

    private ActivityMainBinding bind;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        bind = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(bind.getRoot());

        bind.ButtonEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((bind.EnterLogin.getText().toString().equals(USER))&&(bind.EnterPas.getText().toString().equals(PASS))){
                    bind.ResText.setText(R.string.CorrectText);
                    bind.ResText.setTextColor(Color.GREEN);
                }
                else {
                    bind.ResText.setText(R.string.WrongText);
                    bind.ResText.setTextColor(Color.RED);
                    bind.EnterLogin.setText("");
                    bind.EnterPas.setText("");
                }
            }
        });
    }
}