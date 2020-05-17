package com.example.arsenalapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Play3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play3);
    }

    @Override
    protected void onStart() {
        super.onStart();
        EditText text = findViewById(R.id.play3editText);
        final Button btn1 = findViewById(R.id.play3button2);

        final String editText = text.getText().toString();


        btn1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(Play3Activity.this)
                        .setTitle("注意！")
                        .setMessage("このまま解答してもよろしいですか？")
                        .setPositiveButton("OK",new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                switch (which){
                                    case Dialog.BUTTON_POSITIVE:

                                        Intent intent = new Intent(Play3Activity.this,ResultActivity.class);
                                        startActivity(intent);

                                }
                            }
                        })
                        .setNegativeButton("NO",null)
                        .show();

            }
        });
    }
}
