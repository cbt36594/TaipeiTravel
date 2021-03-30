package com.nevic.taipeitravel.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {

    public final static String DATABASE_NAME = "taipei.db";
    private final static int DATABASE_VERSION = 25;
    private static final String TAG = "DatabaseHelper";
    private static DatabaseHelper mInstance;
    private static Context mApplicationContext;
    private static String hashKey;

    public DatabaseHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, factory, DATABASE_VERSION);
    }


    public static DatabaseHelper getInstance(Context context) {
        if (mInstance == null) {
            synchronized (TAG) {
                if (mInstance == null) {
                    mApplicationContext = context.getApplicationContext();
                    if (DatabaseHelper.hashKey == null) {
                        DatabaseHelper.hashKey = "";
                    }
                    mInstance = new DatabaseHelper(mApplicationContext, DATABASE_NAME, null, DATABASE_VERSION);
                }
            }
        }
        return mInstance;
    }
    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    @Override
    public synchronized void close() {
        super.close();
        mInstance = null;
    }
}