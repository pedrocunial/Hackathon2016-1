package br.edu.insper.hackathon2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import java.util.Random;

public class HeartBeatActivity extends AppCompatActivity {

    Random r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heart_beat);

        int high = 190;
        int low = 100;

        r = new Random();
        int heartbeat;



        while(true) {

            heartbeat = r.nextInt(high - low) + low;

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if(heartbeat > 170) {
                Toast.makeText(HeartBeatActivity.this, "Morreu!", Toast.LENGTH_SHORT).show();


            }

        }



    }
}
