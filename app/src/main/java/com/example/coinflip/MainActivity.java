package com.example.coinflip;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView coin;
    private Button heads;
    private Button tails;
    private TextView tries;
    private TextView wins;
    private TextView losses;

    private double random;
    private int triesCount;
    private int winCount;
    private int lossCount;

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
                    Toast.makeText(MainActivity.this, "Írás", Toast.LENGTH_SHORT).show();
                    lossCount++;
                    losses.setText("Vereség: "+lossCount);

                }else{
                    coin.setImageResource(R.drawable.heads);
                    Toast.makeText(MainActivity.this, "Fej", Toast.LENGTH_SHORT).show();
                    winCount++;
                    wins.setText("Győzelem: "+winCount);
                }
                triesCount++;
            }
        });
        tails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                random = Math.random();
                if(random>=0.5){
                    coin.setImageResource(R.drawable.tails);
                    Toast.makeText(MainActivity.this, "Írás", Toast.LENGTH_SHORT).show();
                    winCount++;
                    wins.setText("Győzelem: "+winCount);

                }else{
                    coin.setImageResource(R.drawable.heads);
                    Toast.makeText(MainActivity.this, "Fej", Toast.LENGTH_SHORT).show();
                    lossCount++;
                    losses.setText("Vereség: "+lossCount);
                }
                triesCount++;
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
        triesCount=0;
        winCount=0;
        lossCount=0;
    }
}