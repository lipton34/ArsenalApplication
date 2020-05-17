package com.example.arsenalapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PlayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

    }

    @Override
    protected void onStart() {
        super.onStart();
        setContentView(R.layout.activity_play);
        final Button btn1 = findViewById(R.id.select_btn1);
        final Button btn2 = findViewById(R.id.select_btn2);
        final Button btn3 = findViewById(R.id.select_btn3);
        final Button btn4 = findViewById(R.id.select_btn4);
        final String[] judge = {"正解"};
        String[] bossName = {"George_Graham","Arsène_Wenger","Unai Emery","Mikel Arteta"};
        List list = Arrays.asList(bossName.clone());
        Collections.shuffle(list);


        btn1.setText(list.get(0).toString());
        btn2.setText(list.get(1).toString());
        btn3.setText(list.get(2).toString());
        btn4.setText(list.get(3).toString());

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String answer = btn1.getText().toString();
                if(answer=="Arsène_Wenger"){
                    Intent intent = new Intent(PlayActivity.this,Play2Activity.class);
                    intent.putExtra("Answer1", judge[0]);
                    startActivity(intent);

                }else{
                    judge[0] = "不正解";
                    Intent intent2 = new Intent(PlayActivity.this,Play2Activity.class);
                    intent2.putExtra("Answer1", judge[0]);
                    startActivity(intent2);
                }
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String answer2 = btn2.getText().toString();
                if(answer2=="Arsène_Wenger"){
                    Intent intent = new Intent(PlayActivity.this,Play2Activity.class);
                    intent.putExtra("Answer1", judge[0]);
                    startActivity(intent);
                }else{
                    judge[0] = "不正解";
                    Intent intent2 = new Intent(PlayActivity.this,Play2Activity.class);
                    intent2.putExtra("Answer1", judge[0]);
                    startActivity(intent2);
                }
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String answer3 = btn3.getText().toString();
                if(answer3=="Arsène_Wenger"){
                    Intent intent = new Intent(PlayActivity.this,Play2Activity.class);
                    intent.putExtra("Answer1", judge[0]);
                    startActivity(intent);
                }else{
                    judge[0] = "不正解";
                    Intent intent2 = new Intent(PlayActivity.this,Play2Activity.class);
                    intent2.putExtra("Answer1", judge[0]);
                    startActivity(intent2);
                }
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String answer4 = btn4.getText().toString();
                if(answer4=="Arsène_Wenger"){
                    Intent intent = new Intent(PlayActivity.this,Play2Activity.class);
                    intent.putExtra("Answer1", judge[0]);
                    startActivity(intent);
                }else{
                    judge[0] = "不正解";
                    Intent intent2 = new Intent(PlayActivity.this,Play2Activity.class);
                    intent2.putExtra("Answer1", judge[0]);
                    startActivity(intent2);
                }
            }
        });

    }
}
