package com.example.arsenalapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Play2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play2);
        Intent intent = getIntent();
        String s = intent.getStringExtra("Answer1");
        Intent intent1 = new Intent(Play2Activity.this, Play3Activity.class);
    }

    @Override
    protected void onStart() {
        super.onStart();
        String[] judge;
        String[] playerName = {"Dennis Bergkamp", "Robin van Persie", "Mesut Özil", "Jack Wilshere", "Thierry Henry"};
        List list = Arrays.asList(playerName.clone());
        Collections.shuffle(list);
        final Button btn1 = findViewById(R.id.play2button2);
        final Button btn2 = findViewById(R.id.play2button3);
        Button btn3 = findViewById(R.id.play2button4);
        Button btn4 = findViewById(R.id.play2button5);
        Button btn5 = findViewById(R.id.play2button6);

        btn1.setText(list.get(0).toString());
        btn2.setText(list.get(1).toString());
        btn3.setText(list.get(2).toString());
        btn4.setText(list.get(3).toString());
        btn5.setText(list.get(4).toString());

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String answer = btn1.getText().toString();
                if (answer == "Thierry Henry") {
                    Intent intent = new Intent(Play2Activity.this, Play3Activity.class);
                    startActivity(intent);

                } else {
                    Intent intent2 = new Intent(Play2Activity.this, Play3Activity.class);
                    startActivity(intent2);
                }
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String answer = btn2.getText().toString();
                if (answer == "Thierry Henry") {
                    Intent intent = new Intent(Play2Activity.this, Play3Activity.class);
                    startActivity(intent);

                } else {
                    Intent intent2 = new Intent(Play2Activity.this, Play3Activity.class);
                    startActivity(intent2);
                }
            }
        });
    }
}
