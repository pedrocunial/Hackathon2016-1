package br.edu.insper.hackathon2;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;
import java.util.Random;

public class HeartBeatActivity extends AppCompatActivity {

    private int heartbeat;
    private Random r;
    private final int high = 190;
    private final int low = 100;
    private EditText mensagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heart_beat);


        r = new Random();

        heartbeat = r.nextInt(high - low) + low;

        this.mensagem = (EditText) findViewById(R.id.text_heart_beat);

        assert this.mensagem != null;
        this.mensagem.setText(String heartbeat);

        final CountDownTimer espaco = new CountDownTimer(1000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {

            }

            @TargetApi(Build.VERSION_CODES.KITKAT)
            @Override
            public void onFinish() {
                heartbeat = r.nextInt(high - low) + low;
                System.out.println(heartbeat);
                mensagem.setText(heartbeat);

                if(heartbeat > 170) {
                    Toast.makeText(HeartBeatActivity.this, "Morreu!", Toast.LENGTH_SHORT).show();

                }
            }

        }.start();

        espaco.cancel();
        espaco.start();





    }
}
