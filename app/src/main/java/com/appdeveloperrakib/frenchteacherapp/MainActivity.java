package com.appdeveloperrakib.frenchteacherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_black, btn_green, btn_purple,btn_red, btn_yellow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_black = findViewById(R.id.btn_black);
        btn_green = findViewById(R.id.btn_green);
        btn_purple = findViewById(R.id.btn_purple);
        btn_red = findViewById(R.id.btn_red);
        btn_yellow = findViewById(R.id.btn_yellow);


        btn_black.setOnClickListener(this);
        btn_green.setOnClickListener(this);
        btn_purple.setOnClickListener(this);
        btn_red.setOnClickListener(this);
        btn_yellow.setOnClickListener(this);




    }

    //----------OnCreate End ----------------------

    @Override
    public void onClick(View view) {

        //Find the button by ID and play the correct sound

        int clickedBtnId = view.getId();

        if (clickedBtnId == R.id.btn_black) {
            PlaySounds(R.raw.black);
        }else if (clickedBtnId == R.id.btn_green) {
            PlaySounds(R.raw.green);
        }else if (clickedBtnId == R.id.btn_purple){
            PlaySounds(R.raw.purple);
        }else if (clickedBtnId == R.id.btn_red){
            PlaySounds(R.raw.red);
        }else if (clickedBtnId == R.id.btn_yellow){
            PlaySounds(R.raw.yellow);
        }
    }

    public void PlaySounds (int ID){
         MediaPlayer mediaPlayer = MediaPlayer.create(
                 MainActivity.this,
                 ID
         );
         mediaPlayer.start();

    }

}