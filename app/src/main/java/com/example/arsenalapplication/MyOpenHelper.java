package com.example.arsenalapplication;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class MyOpenHelper extends SQLiteOpenHelper {

    private static final String FILE_NAME = "Grade_table";
    private static final int VERSION = 1;
    private static final String CREATE_TABLE = "CREATE TABLE `Grade3` (" +
            "`_id` INTEGER PRIMARY KEY AUTOINCREMENT," +
            "`name` TEXT,`score` INTEGER,"+
            "`judge1` TEXT ,`judge2` TEXT ,`judge3` TEXT ,`judge4` TEXT ,`judge5` TEXT ,`judge6` TEXT,`judge7` TEXT,`judge8` TEXT,`judge9` TEXT,`judge10` TEXT"+
            ");";

    public MyOpenHelper(Context context) {
        super(context, FILE_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
