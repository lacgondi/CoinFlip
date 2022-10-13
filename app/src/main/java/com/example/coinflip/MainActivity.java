package com.example.coinflip;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView coin;
    private Button heads;
    private Button tails;
    private TextView tries;
    private TextView wins;
    private TextView losses;

    private double random;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        heads.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                random = Math.random();
                if(random>=0.5){
                    coin.setImageResource(R.drawable.tails);
                }
            }
        });
    }
    private void init(){
        coin=findViewById(R.id.coin);
        heads=findViewById(R.id.heads);
        tails=findViewById(R.id.tails);
        tries=findViewById(R.id.tries);
        wins=findViewById(R.id.wins);
        losses=findViewById(R.id.losses);

    }
}