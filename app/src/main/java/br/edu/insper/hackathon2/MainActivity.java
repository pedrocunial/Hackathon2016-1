package br.edu.insper.hackathon2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonHeart = (Button) findViewById(R.id.btn_heartbeat);
        Button buttonTemp = (Button) findViewById(R.id.btn_temp);
        Button buttonMove = (Button) findViewById(R.id.btn_move);
        Button buttonOxigen = (Button) findViewById(R.id.btn_oxigen);






    }
}
