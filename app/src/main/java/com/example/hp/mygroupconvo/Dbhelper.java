package com.example.hp.mygroupconvo;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Dbhelper extends SQLiteOpenHelper{
    private static final String DB_NAME = "users";
    private static final int DB_VER = 1 ;
    private static final String DB_TABLE = "convo";
    private static  String Name = "Unknown";
    private static  String msg = "Test";


    public Dbhelper(Context context , String Name ,String msg ){
        super(context ,DB_NAME , null ,DB_VER);
this.Name = Name ;
        this.msg = msg;
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query  = String.format("CREATE TABLE %s (ID INTEGER PRIMARY KEY AUTOINCREMENT, %s TEXT NOT NULL , %s TEXT NOT NULL);",DB_TABLE , Name ,msg);
        db.execSQL(query);
    }
}
