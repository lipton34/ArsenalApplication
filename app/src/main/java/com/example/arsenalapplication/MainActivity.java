package com.example.arsenalapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    ContentValues cv = new ContentValues();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Button btn1 = findViewById(R.id.button);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SQLiteOpenHelper openHelper = new MyOpenHelper(MainActivity.this);
                SQLiteDatabase database = openHelper.getWritableDatabase();
                EditText mainEditText = findViewById(R.id.mainEditText);
                Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                String d = "解答なし";
                try {
                    String PlayerName = mainEditText.getText().toString();
                    cv.put("name", PlayerName);
                    cv.put("judge1",d);
                    cv.put("judge2",d);
                    cv.put("judge3",d);
                    cv.put("judge4",d);
                    cv.put("judge5",d);
                    cv.put("judge6",d);
                    cv.put("judge7",d);
                    cv.put("judge8",d);
                    cv.put("judge9",d);
                    cv.put("judge10",d);
                    database.insert("Grade3",null, cv);
                    intent.putExtra("name", PlayerName);
                    startActivity(intent);
                } catch (Exception ex) {
                    Log.i("iiiiiiiiiiiii", "iiiiiiiiiiiiiii");
                } finally {
                    database.close();
                }

            }
        });

    }
}
