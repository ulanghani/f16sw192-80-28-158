package com.example.sakhicomputer.mrnetwork;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.sakhicomputer.mrnetwork.BeanClasses.Bean_ufone;

import java.util.ArrayList;

/**
 * Created by SAkhi COmputer on 21/01/2018.
 */

public class MyDatabase extends SQLiteOpenHelper {

    private static String db_name = "muhib";
    private static int version = 1;

    private SQLiteDatabase sqLiteDatabase;

    public MyDatabase(Context context) {
        super(context, db_name, null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        sqLiteDatabase.execSQL("CREATE  TABLE  IF NOT EXISTS main.Allnetwork (id INTEGER PRIMARY KEY  AUTOINCREMENT  NOT NULL , " +
                "bucket_name TEXT NOT NULL , validity TEXT NOT NULL , category TEXT NOT NULL , price TEXT NOT NULL , subscription_code TEXT NOT NULL , network TEXT NOT NULL )");


        ////ufone
        sqLiteDatabase.execSQL("CREATE  TABLE  IF NOT EXISTS main.UfoneSms (id INTEGER PRIMARY KEY  AUTOINCREMENT  NOT NULL , " +
                "bucket_name TEXT NOT NULL , validity TEXT NOT NULL , category TEXT NOT NULL , price TEXT NOT NULL , subscription_code TEXT NOT NULL , network TEXT NOT NULL )");

        sqLiteDatabase.execSQL("CREATE  TABLE  IF NOT EXISTS main.UfoneCall (id INTEGER PRIMARY KEY  AUTOINCREMENT  NOT NULL , " +
                "bucket_name TEXT NOT NULL , validity TEXT NOT NULL , category TEXT NOT NULL , price TEXT NOT NULL , subscription_code TEXT NOT NULL , network TEXT NOT NULL )");

        sqLiteDatabase.execSQL("CREATE  TABLE  IF NOT EXISTS main.UfoneData (id INTEGER PRIMARY KEY  AUTOINCREMENT  NOT NULL , " +
                "bucket_name TEXT NOT NULL , validity TEXT NOT NULL , category TEXT NOT NULL , price TEXT NOT NULL , subscription_code TEXT NOT NULL , network TEXT NOT NULL )");


     ////mobilink
        sqLiteDatabase.execSQL("CREATE  TABLE  IF NOT EXISTS main.MobilinkSms (id INTEGER PRIMARY KEY  AUTOINCREMENT  NOT NULL , " +
                "bucket_name TEXT NOT NULL , validity TEXT NOT NULL , category TEXT NOT NULL , price TEXT NOT NULL , subscription_code TEXT NOT NULL , network TEXT NOT NULL)");

        sqLiteDatabase.execSQL("CREATE  TABLE  IF NOT EXISTS main.MobilinkCall (id INTEGER PRIMARY KEY  AUTOINCREMENT  NOT NULL , " +
                "bucket_name TEXT NOT NULL , validity TEXT NOT NULL , category TEXT NOT NULL , price TEXT NOT NULL , subscription_code TEXT NOT NULL , network TEXT NOT NULL)");

        sqLiteDatabase.execSQL("CREATE  TABLE  IF NOT EXISTS main.MobilinkData (id INTEGER PRIMARY KEY  AUTOINCREMENT  NOT NULL , " +
                "bucket_name TEXT NOT NULL , validity TEXT NOT NULL , category TEXT NOT NULL , price TEXT NOT NULL , subscription_code TEXT NOT NULL , network TEXT NOT NULL)");


     ////telenor
        sqLiteDatabase.execSQL("CREATE  TABLE  IF NOT EXISTS main.TelenorSms (id INTEGER PRIMARY KEY  AUTOINCREMENT  NOT NULL , " +
                "bucket_name TEXT NOT NULL , validity TEXT NOT NULL , category TEXT NOT NULL , price TEXT NOT NULL , subscription_code TEXT NOT NULL , network TEXT NOT NULL)");

        sqLiteDatabase.execSQL("CREATE  TABLE  IF NOT EXISTS main.TelenorCall (id INTEGER PRIMARY KEY  AUTOINCREMENT  NOT NULL , " +
                "bucket_name TEXT NOT NULL , validity TEXT NOT NULL , category TEXT NOT NULL , price TEXT NOT NULL , subscription_code TEXT NOT NULL , network TEXT NOT NULL)");

        sqLiteDatabase.execSQL("CREATE  TABLE  IF NOT EXISTS main.TelenorData (id INTEGER PRIMARY KEY  AUTOINCREMENT  NOT NULL , " +
                "bucket_name TEXT NOT NULL , validity TEXT NOT NULL , category TEXT NOT NULL , price TEXT NOT NULL , subscription_code TEXT NOT NULL , network TEXT NOT NULL)");



     ////zong
        sqLiteDatabase.execSQL("CREATE  TABLE  IF NOT EXISTS main.ZongSms (id INTEGER PRIMARY KEY  AUTOINCREMENT  NOT NULL , " +
                "bucket_name TEXT NOT NULL , validity TEXT NOT NULL , category TEXT NOT NULL , price TEXT NOT NULL , subscription_code TEXT NOT NULL , network TEXT NOT NULL)");

        sqLiteDatabase.execSQL("CREATE  TABLE  IF NOT EXISTS main.ZongCall (id INTEGER PRIMARY KEY  AUTOINCREMENT  NOT NULL , " +
                "bucket_name TEXT NOT NULL , validity TEXT NOT NULL , category TEXT NOT NULL , price TEXT NOT NULL , subscription_code TEXT NOT NULL , network TEXT NOT NULL)");

        sqLiteDatabase.execSQL("CREATE  TABLE  IF NOT EXISTS main.ZongData (id INTEGER PRIMARY KEY  AUTOINCREMENT  NOT NULL , " +
                "bucket_name TEXT NOT NULL , validity TEXT NOT NULL , category TEXT NOT NULL ," +
                " price TEXT NOT NULL , subscription_code TEXT NOT NULL , network TEXT NOT NULL)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }


    //Allnetwork-sms add
    public void add_Allnetwork(String id, String bucket_name, String validity, String category, String price, String subscription_code, String network){
        sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("bucket_name", "" + bucket_name);
        contentValues.put("validity", "" + validity);
        contentValues.put("category", "" + category);
        contentValues.put("price", "" + price);
        contentValues.put("subscription_code", "" + subscription_code);
        contentValues.put("network", "" + network);

        sqLiteDatabase.insert("main.Allnetwork",null,contentValues);
        System.out.println("--record inserted");

        sqLiteDatabase.close();
    }


    ///ggg //Allnetwork get all records
    public ArrayList<Bean_ufone> getallfromAllnetwork() {
        sqLiteDatabase = this.getReadableDatabase();
        ArrayList<Bean_ufone> mybeen2 = new ArrayList<Bean_ufone>();

        String sql = "Select * from main.Allnetwork";
        Cursor cursor = sqLiteDatabase.rawQuery(sql, null);

        if (cursor.moveToFirst()) {
            do {
                String id = cursor.getString(0);
                String bucket_name = cursor.getString(cursor.getColumnIndex("bucket_name"));
                String validity = cursor.getString(cursor.getColumnIndex("validity"));
                String category = cursor.getString(cursor.getColumnIndex("category"));
                String price = cursor.getString(cursor.getColumnIndex("price"));
                String subscription_code = cursor.getString(cursor.getColumnIndex("subscription_code"));
                String network = cursor.getString(cursor.getColumnIndex("network"));

                mybeen2.add(new Bean_ufone(""+id, ""+bucket_name, ""+validity, ""+category,
                        ""+price, ""+subscription_code,""+network));

            } while (cursor.moveToNext());
        }
        return mybeen2;
    }


///******** UFONE*****////
    //Ufone-sms add
    public void add_ufone(String id, String bucket_name, String validity, String category, String price, String subscription_code, String network){
        sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("bucket_name", "" + bucket_name);
        contentValues.put("validity", "" + validity);
        contentValues.put("category", "" + category);
        contentValues.put("price", "" + price);
        contentValues.put("subscription_code", "" + subscription_code);
        contentValues.put("network","" + network);

        sqLiteDatabase.insert("main.UfoneSms",null,contentValues);
        System.out.println("--record inserted");

        sqLiteDatabase.close();
    }


 ///ggg //Ufone-sms get all records
    public ArrayList<Bean_ufone> getallUfone() {
        sqLiteDatabase = this.getReadableDatabase();
        ArrayList<Bean_ufone> mybeen2 = new ArrayList<Bean_ufone>();

        String sql = "Select * from main.UfoneSms";
        Cursor cursor = sqLiteDatabase.rawQuery(sql, null);

        if (cursor.moveToFirst()) {
            do {
                String id = cursor.getString(0);
                String bucket_name = cursor.getString(cursor.getColumnIndex("bucket_name"));
                String validity = cursor.getString(cursor.getColumnIndex("validity"));
                String category = cursor.getString(cursor.getColumnIndex("category"));
                String price = cursor.getString(cursor.getColumnIndex("price"));
                String subscription_code = cursor.getString(cursor.getColumnIndex("subscription_code"));
                String network = cursor.getString(cursor.getColumnIndex("network"));

                mybeen2.add(new Bean_ufone(""+id, ""+bucket_name, ""+validity, ""+category,
                        ""+price, ""+subscription_code,""+network));

            } while (cursor.moveToNext());
        }
        return mybeen2;
    }


    //Ufone-call add
    public void add_ufone_call(String id, String bucket_name, String validity, String category, String price, String subscription_code, String network){
        sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("bucket_name", "" + bucket_name);
        contentValues.put("validity", "" + validity);
        contentValues.put("category", "" + category);
        contentValues.put("price", "" + price);
        contentValues.put("subscription_code", "" + subscription_code);
        contentValues.put("network","" + network);

        sqLiteDatabase.insert("main.UfoneCall",null,contentValues);
        System.out.println("--record inserted");

        sqLiteDatabase.close();
    }


 ////gg  //Ufone-call get all records
    public ArrayList<Bean_ufone> getallUfone_call() {
        sqLiteDatabase = this.getReadableDatabase();
        ArrayList<Bean_ufone> mybeen2 = new ArrayList<Bean_ufone>();

        String sql = "Select * from main.UfoneCall";
        Cursor cursor = sqLiteDatabase.rawQuery(sql, null);

        if (cursor.moveToFirst()) {
            do {
                String id = cursor.getString(0);
                String bucket_name = cursor.getString(cursor.getColumnIndex("bucket_name"));
                String validity = cursor.getString(cursor.getColumnIndex("validity"));
                String category = cursor.getString(cursor.getColumnIndex("category"));
                String price = cursor.getString(cursor.getColumnIndex("price"));
                String subscription_code = cursor.getString(cursor.getColumnIndex("subscription_code"));
                String network = cursor.getString(cursor.getColumnIndex("network"));

                mybeen2.add(new Bean_ufone(""+id, ""+bucket_name, ""+validity, ""+category,
                        ""+price, ""+subscription_code,""+network));

            } while (cursor.moveToNext());
        }
        return mybeen2;
    }

    //Ufone-data add
    public void add_ufone_data(String id, String bucket_name, String validity, String category, String price, String subscription_code, String network){
        sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("bucket_name", "" + bucket_name);
        contentValues.put("validity", "" + validity);
        contentValues.put("category", "" + category);
        contentValues.put("price", "" + price);
        contentValues.put("subscription_code", "" + subscription_code);
        contentValues.put("network","" + network);

        sqLiteDatabase.insert("main.UfoneData",null,contentValues);
        System.out.println("--record inserted");

        sqLiteDatabase.close();
    }


////gg  //Ufone-data get all records
    public ArrayList<Bean_ufone> getallUfone_data() {
        sqLiteDatabase = this.getReadableDatabase();
        ArrayList<Bean_ufone> mybeen2 = new ArrayList<Bean_ufone>();

        String sql = "Select * from main.UfoneData";
        Cursor cursor = sqLiteDatabase.rawQuery(sql, null);

        if (cursor.moveToFirst()) {
            do {
                String id = cursor.getString(0);
                String bucket_name = cursor.getString(cursor.getColumnIndex("bucket_name"));
                String validity = cursor.getString(cursor.getColumnIndex("validity"));
                String category = cursor.getString(cursor.getColumnIndex("category"));
                String price = cursor.getString(cursor.getColumnIndex("price"));
                String subscription_code = cursor.getString(cursor.getColumnIndex("subscription_code"));
                String network = cursor.getString(cursor.getColumnIndex("network"));

                mybeen2.add(new Bean_ufone(""+id, ""+bucket_name, ""+validity, ""+category,
                        ""+price, ""+subscription_code,""+network));

            } while (cursor.moveToNext());
        }
        return mybeen2;
    }

///******** MOBILINK *****////
    //Mobilink-sms add
    public void add_mobilink_sms(String id, String bucket_name, String validity, String category, String price, String subscription_code, String network){
        sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("bucket_name", "" + bucket_name);
        contentValues.put("validity", "" + validity);
        contentValues.put("category", "" + category);
        contentValues.put("price", "" + price);
        contentValues.put("subscription_code", "" + subscription_code);
        contentValues.put("network","" + network);

        sqLiteDatabase.insert("main.MobilinkSms",null,contentValues);
        System.out.println("--record inserted");

        sqLiteDatabase.close();
    }


    ///ggg //Mobilink-sms get all records
    public ArrayList<Bean_ufone> getallMobilink_sms() {
        sqLiteDatabase = this.getReadableDatabase();
        ArrayList<Bean_ufone> mybeen2 = new ArrayList<Bean_ufone>();

        String sql = "Select * from main.MobilinkSms";
        Cursor cursor = sqLiteDatabase.rawQuery(sql, null);

        if (cursor.moveToFirst()) {
            do {
                String id = cursor.getString(0);
                String bucket_name = cursor.getString(cursor.getColumnIndex("bucket_name"));
                String validity = cursor.getString(cursor.getColumnIndex("validity"));
                String category = cursor.getString(cursor.getColumnIndex("category"));
                String price = cursor.getString(cursor.getColumnIndex("price"));
                String subscription_code = cursor.getString(cursor.getColumnIndex("subscription_code"));
                String network = cursor.getString(cursor.getColumnIndex("network"));

                mybeen2.add(new Bean_ufone(""+id, ""+bucket_name, ""+validity, ""+category,
                        ""+price, ""+subscription_code,""+network));

            } while (cursor.moveToNext());
        }
        return mybeen2;
    }


    //Mobilink-call add
    public void add_Mobilink_call(String id, String bucket_name, String validity, String category, String price, String subscription_code, String network){
        sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("bucket_name", "" + bucket_name);
        contentValues.put("validity", "" + validity);
        contentValues.put("category", "" + category);
        contentValues.put("price", "" + price);
        contentValues.put("subscription_code", "" + subscription_code);
        contentValues.put("network","" + network);

        sqLiteDatabase.insert("main.MobilinkCall",null,contentValues);
        System.out.println("--record inserted");

        sqLiteDatabase.close();
    }


    ////gg  //Mobilink-call get all records
    public ArrayList<Bean_ufone> getallMobilink_call() {
        sqLiteDatabase = this.getReadableDatabase();
        ArrayList<Bean_ufone> mybeen2 = new ArrayList<Bean_ufone>();

        String sql = "Select * from main.MobilinkCall";
        Cursor cursor = sqLiteDatabase.rawQuery(sql, null);

        if (cursor.moveToFirst()) {
            do {
                String id = cursor.getString(0);
                String bucket_name = cursor.getString(cursor.getColumnIndex("bucket_name"));
                String validity = cursor.getString(cursor.getColumnIndex("validity"));
                String category = cursor.getString(cursor.getColumnIndex("category"));
                String price = cursor.getString(cursor.getColumnIndex("price"));
                String subscription_code = cursor.getString(cursor.getColumnIndex("subscription_code"));
                String network = cursor.getString(cursor.getColumnIndex("network"));

                mybeen2.add(new Bean_ufone(""+id, ""+bucket_name, ""+validity, ""+category,
                        ""+price, ""+subscription_code,""+network));

            } while (cursor.moveToNext());
        }
        return mybeen2;
    }

    //Mobilink-data add
    public void add_Mobilink_data(String id, String bucket_name, String validity, String category, String price, String subscription_code, String network){
        sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("bucket_name", "" + bucket_name);
        contentValues.put("validity", "" + validity);
        contentValues.put("category", "" + category);
        contentValues.put("price", "" + price);
        contentValues.put("subscription_code", "" + subscription_code);
        contentValues.put("network","" + network);

        sqLiteDatabase.insert("main.MobilinkData",null,contentValues);
        System.out.println("--record inserted");

        sqLiteDatabase.close();
    }


    ////gg  //Mobilink-data get all records
    public ArrayList<Bean_ufone> getallMobilink_data() {
        sqLiteDatabase = this.getReadableDatabase();
        ArrayList<Bean_ufone> mybeen2 = new ArrayList<Bean_ufone>();

        String sql = "Select * from main.MobilinkData";
        Cursor cursor = sqLiteDatabase.rawQuery(sql, null);

        if (cursor.moveToFirst()) {
            do {
                String id = cursor.getString(0);
                String bucket_name = cursor.getString(cursor.getColumnIndex("bucket_name"));
                String validity = cursor.getString(cursor.getColumnIndex("validity"));
                String category = cursor.getString(cursor.getColumnIndex("category"));
                String price = cursor.getString(cursor.getColumnIndex("price"));
                String subscription_code = cursor.getString(cursor.getColumnIndex("subscription_code"));
                String network = cursor.getString(cursor.getColumnIndex("network"));

                mybeen2.add(new Bean_ufone(""+id, ""+bucket_name, ""+validity, ""+category,
                        ""+price, ""+subscription_code,""+network));

            } while (cursor.moveToNext());
        }
        return mybeen2;
    }


///******** Telenor *****////
    //Telenor-sms add
    public void add_Telenor_sms(String id, String bucket_name, String validity, String category, String price, String subscription_code, String network){
        sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("bucket_name", "" + bucket_name);
        contentValues.put("validity", "" + validity);
        contentValues.put("category", "" + category);
        contentValues.put("price", "" + price);
        contentValues.put("subscription_code", "" + subscription_code);
        contentValues.put("network","" + network);

        sqLiteDatabase.insert("main.TelenorSms",null,contentValues);
        System.out.println("--record inserted");

        sqLiteDatabase.close();
    }


    ///ggg //Telenor-sms get all records
    public ArrayList<Bean_ufone> getallTelenor_sms() {
        sqLiteDatabase = this.getReadableDatabase();
        ArrayList<Bean_ufone> mybeen2 = new ArrayList<Bean_ufone>();

        String sql = "Select * from main.TelenorSms";
        Cursor cursor = sqLiteDatabase.rawQuery(sql, null);

        if (cursor.moveToFirst()) {
            do {
                String id = cursor.getString(0);
                String bucket_name = cursor.getString(cursor.getColumnIndex("bucket_name"));
                String validity = cursor.getString(cursor.getColumnIndex("validity"));
                String category = cursor.getString(cursor.getColumnIndex("category"));
                String price = cursor.getString(cursor.getColumnIndex("price"));
                String subscription_code = cursor.getString(cursor.getColumnIndex("subscription_code"));
                String network = cursor.getString(cursor.getColumnIndex("network"));

                mybeen2.add(new Bean_ufone(""+id, ""+bucket_name, ""+validity, ""+category,
                        ""+price, ""+subscription_code,""+network));

            } while (cursor.moveToNext());
        }
        return mybeen2;
    }


    //Telenor-call add
    public void add_Telenor_call(String id, String bucket_name, String validity, String category, String price, String subscription_code, String network){
        sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("bucket_name", "" + bucket_name);
        contentValues.put("validity", "" + validity);
        contentValues.put("category", "" + category);
        contentValues.put("price", "" + price);
        contentValues.put("subscription_code", "" + subscription_code);
        contentValues.put("network","" + network);

        sqLiteDatabase.insert("main.TelenorCall",null,contentValues);
        System.out.println("--record inserted");

        sqLiteDatabase.close();
    }


    ////gg  //Telenor-call get all records
    public ArrayList<Bean_ufone> getallTelenor_call() {
        sqLiteDatabase = this.getReadableDatabase();
        ArrayList<Bean_ufone> mybeen2 = new ArrayList<Bean_ufone>();

        String sql = "Select * from main.TelenorCall";
        Cursor cursor = sqLiteDatabase.rawQuery(sql, null);

        if (cursor.moveToFirst()) {
            do {
                String id = cursor.getString(0);
                String bucket_name = cursor.getString(cursor.getColumnIndex("bucket_name"));
                String validity = cursor.getString(cursor.getColumnIndex("validity"));
                String category = cursor.getString(cursor.getColumnIndex("category"));
                String price = cursor.getString(cursor.getColumnIndex("price"));
                String subscription_code = cursor.getString(cursor.getColumnIndex("subscription_code"));
                String network = cursor.getString(cursor.getColumnIndex("network"));

                mybeen2.add(new Bean_ufone(""+id, ""+bucket_name, ""+validity, ""+category,
                        ""+price, ""+subscription_code,""+network));

            } while (cursor.moveToNext());
        }
        return mybeen2;
    }

    //Telenor-data add
    public void add_Telenor_data(String id, String bucket_name, String validity, String category, String price, String subscription_code, String network){
        sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("bucket_name", "" + bucket_name);
        contentValues.put("validity", "" + validity);
        contentValues.put("category", "" + category);
        contentValues.put("price", "" + price);
        contentValues.put("subscription_code", "" + subscription_code);
        contentValues.put("network","" + network);

        sqLiteDatabase.insert("main.TelenorData",null,contentValues);
        System.out.println("--record inserted");

        sqLiteDatabase.close();
    }


    ////gg  //Telenor-data get all records
    public ArrayList<Bean_ufone> getallTelenor_data() {
        sqLiteDatabase = this.getReadableDatabase();
        ArrayList<Bean_ufone> mybeen2 = new ArrayList<Bean_ufone>();

        String sql = "Select * from main.TelenorData";
        Cursor cursor = sqLiteDatabase.rawQuery(sql, null);

        if (cursor.moveToFirst()) {
            do {
                String id = cursor.getString(0);
                String bucket_name = cursor.getString(cursor.getColumnIndex("bucket_name"));
                String validity = cursor.getString(cursor.getColumnIndex("validity"));
                String category = cursor.getString(cursor.getColumnIndex("category"));
                String price = cursor.getString(cursor.getColumnIndex("price"));
                String subscription_code = cursor.getString(cursor.getColumnIndex("subscription_code"));
                String network = cursor.getString(cursor.getColumnIndex("network"));

                mybeen2.add(new Bean_ufone(""+id, ""+bucket_name, ""+validity, ""+category,
                        ""+price, ""+subscription_code,""+network));

            } while (cursor.moveToNext());
        }
        return mybeen2;
    }


    ///******** Zong *****////
    //Zong-sms add
    public void add_Zong_sms(String id, String bucket_name, String validity, String category, String price, String subscription_code, String network){
        sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("bucket_name", "" + bucket_name);
        contentValues.put("validity", "" + validity);
        contentValues.put("category", "" + category);
        contentValues.put("price", "" + price);
        contentValues.put("subscription_code", "" + subscription_code);
        contentValues.put("network","" + network);

        sqLiteDatabase.insert("main.ZongSms",null,contentValues);
        System.out.println("--record inserted");

        sqLiteDatabase.close();
    }


    ///ggg //Zong-sms get all records
    public ArrayList<Bean_ufone> getallZong_sms() {
        sqLiteDatabase = this.getReadableDatabase();
        ArrayList<Bean_ufone> mybeen2 = new ArrayList<Bean_ufone>();

        String sql = "Select * from main.ZongSms";
        Cursor cursor = sqLiteDatabase.rawQuery(sql, null);

        if (cursor.moveToFirst()) {
            do {
                String id = cursor.getString(0);
                String bucket_name = cursor.getString(cursor.getColumnIndex("bucket_name"));
                String validity = cursor.getString(cursor.getColumnIndex("validity"));
                String category = cursor.getString(cursor.getColumnIndex("category"));
                String price = cursor.getString(cursor.getColumnIndex("price"));
                String subscription_code = cursor.getString(cursor.getColumnIndex("subscription_code"));
                String network = cursor.getString(cursor.getColumnIndex("network"));

                mybeen2.add(new Bean_ufone(""+id, ""+bucket_name, ""+validity, ""+category,
                        ""+price, ""+subscription_code,""+network));

            } while (cursor.moveToNext());
        }
        return mybeen2;
    }


    //Zong-call add
    public void add_Zong_call(String id, String bucket_name, String validity, String category, String price, String subscription_code, String network){
        sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("bucket_name", "" + bucket_name);
        contentValues.put("validity", "" + validity);
        contentValues.put("category", "" + category);
        contentValues.put("price", "" + price);
        contentValues.put("subscription_code", "" + subscription_code);
        contentValues.put("network","" + network);

        sqLiteDatabase.insert("main.ZongCall",null,contentValues);
        System.out.println("--record inserted");

        sqLiteDatabase.close();
    }


    ////gg  //Zong-call get all records
    public ArrayList<Bean_ufone> getallZong_call() {
        sqLiteDatabase = this.getReadableDatabase();
        ArrayList<Bean_ufone> mybeen2 = new ArrayList<Bean_ufone>();

        String sql = "Select * from main.ZongCall";
        Cursor cursor = sqLiteDatabase.rawQuery(sql, null);

        if (cursor.moveToFirst()) {
            do {
                String id = cursor.getString(0);
                String bucket_name = cursor.getString(cursor.getColumnIndex("bucket_name"));
                String validity = cursor.getString(cursor.getColumnIndex("validity"));
                String category = cursor.getString(cursor.getColumnIndex("category"));
                String price = cursor.getString(cursor.getColumnIndex("price"));
                String subscription_code = cursor.getString(cursor.getColumnIndex("subscription_code"));
                String network = cursor.getString(cursor.getColumnIndex("network"));

                mybeen2.add(new Bean_ufone(""+id, ""+bucket_name, ""+validity, ""+category,
                        ""+price, ""+subscription_code,""+network));

            } while (cursor.moveToNext());
        }
        return mybeen2;
    }

    //Zong-data add
    public void add_Zong_data(String id, String bucket_name, String validity, String category, String price, String subscription_code, String network){
        sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("bucket_name", "" + bucket_name);
        contentValues.put("validity", "" + validity);
        contentValues.put("category", "" + category);
        contentValues.put("price", "" + price);
        contentValues.put("subscription_code", "" + subscription_code);
        contentValues.put("network","" + network);

        sqLiteDatabase.insert("main.ZongData",null,contentValues);
        System.out.println("--record inserted");

        sqLiteDatabase.close();
    }


    ////gg  //Zong-data get all records
    public ArrayList<Bean_ufone> getallZong_data() {
        sqLiteDatabase = this.getReadableDatabase();
        ArrayList<Bean_ufone> mybeen2 = new ArrayList<Bean_ufone>();

        String sql = "Select * from main.ZongData";
        Cursor cursor = sqLiteDatabase.rawQuery(sql, null);

        if (cursor.moveToFirst()) {
            do {
                String id = cursor.getString(0);
                String bucket_name = cursor.getString(cursor.getColumnIndex("bucket_name"));
                String validity = cursor.getString(cursor.getColumnIndex("validity"));
                String category = cursor.getString(cursor.getColumnIndex("category"));
                String price = cursor.getString(cursor.getColumnIndex("price"));
                String subscription_code = cursor.getString(cursor.getColumnIndex("subscription_code"));
                String network = cursor.getString(cursor.getColumnIndex("network"));

                mybeen2.add(new Bean_ufone(""+id, ""+bucket_name, ""+validity, ""+category,
                        ""+price, ""+subscription_code,""+network));

            } while (cursor.moveToNext());
        }
        return mybeen2;
    }



}
