package com.example.arsenalapplication;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

@RequiresApi(api = Build.VERSION_CODES.KITKAT)
public class ResultActivity extends AppCompatActivity {
    Cursor cursor = null;
    String k = System.lineSeparator();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    protected void onStart() {
        super.onStart();
        setContentView(R.layout.activity_result);
        final TextView textView = findViewById(R.id.resultText);
        Button resultBtn = findViewById(R.id.resultbutton);

        SQLiteOpenHelper helper = new MyOpenHelper(this);
        SQLiteDatabase database = null;
        Intent intent = getIntent();
        String s = intent.getStringExtra("name");
        try {
            database = helper.getReadableDatabase();
            cursor = database.query("Grade3", null, "name=?", new String[]{s}, null, null, null);
            if (cursor.moveToFirst()) {
                int ColumnIndex = cursor.getColumnIndex("name");
                String a = cursor.getString(ColumnIndex);
                textView.setText(a + "さんのテスト結果");
            }
        } catch (Exception ex) {
            Log.i("aaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaa");
        } finally {
            database.close();
        }

        resultBtn.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                TextView resultText2 = findViewById(R.id.resultText2);
                SQLiteOpenHelper helper1 = new MyOpenHelper(ResultActivity.this);
                SQLiteDatabase database1 = null;
                Intent intent = getIntent();
                String ss = intent.getStringExtra("name");

                try {
                    database1 = helper1.getReadableDatabase();
                    cursor = database1.query("Grade3", null, "name=?", new String[]{ss}, null, null, null);
                    if (cursor.moveToFirst()) {

                        int ColumnArray[] = {
                                cursor.getColumnIndex("judge1"),
                                cursor.getColumnIndex("judge2"),
                                cursor.getColumnIndex("judge3"),
                                cursor.getColumnIndex("judge4"),
                                cursor.getColumnIndex("judge5"),
                                cursor.getColumnIndex("judge6"),
                                cursor.getColumnIndex("judge7"),
                                cursor.getColumnIndex("judge8"),
                                cursor.getColumnIndex("judge9"),
                                cursor.getColumnIndex("judge10")

                        };

                        String j[] = {
                                cursor.getString(ColumnArray[0]),
                                cursor.getString(ColumnArray[1]),
                                cursor.getString(ColumnArray[2]),
                                cursor.getString(ColumnArray[3]),
                                cursor.getString(ColumnArray[4]),
                                cursor.getString(ColumnArray[5]),
                                cursor.getString(ColumnArray[6]),
                                cursor.getString(ColumnArray[7]),
                                cursor.getString(ColumnArray[8]),
                                cursor.getString(ColumnArray[9])
                        };
                        resultText2.setText("Q.1  " +
                                j[0] + k + "Q.2  " +
                                j[1] + k +"Q.3  "+
                                j[2] + k +"Q.4  "+
                                j[3] + k +"Q.5  "+
                                j[4] + k +"Q.6  "+
                                j[5] + k +"Q.7  "+
                                j[6] + k +"Q.8  "+
                                j[7] + k +"Q.9  "+
                                j[8] + k +"Q.10 "+
                                j[9]);
                    }

                } catch (Exception ex) {
                    Log.i("resultBtn", ex.getLocalizedMessage());
                } finally {
                    database1.close();
                }
            }
        });
    }

    @Override
    protected void onStop() {
        super.onStop();
        cursor.close();
    }
}
