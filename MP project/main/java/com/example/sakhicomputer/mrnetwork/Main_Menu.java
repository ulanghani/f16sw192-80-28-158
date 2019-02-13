package com.example.sakhicomputer.mrnetwork;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.sakhicomputer.mrnetwork.Mobilink.Mobilink_main;
import com.example.sakhicomputer.mrnetwork.Telenor.Telenor_main;
import com.example.sakhicomputer.mrnetwork.Zong.Zong_main;

public class Main_Menu extends AppCompatActivity {

    ImageView ufone, mobilink, zong, telenor;
    Button btn_comparison;
    public MyDatabase mydatabase;
    Button addAct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__menu);

//        mydatabase = new MyDatabase(this);
//
//        mydatabase.add_ufone("","Daily Light","1 day","Sms package","Rs. 10","*2256#");
//
//        System.out.println("---ufone = "+mydatabase.getallUfone());

        ufone = (ImageView) findViewById(R.id.btn_1);
        mobilink = (ImageView) findViewById(R.id.btn_2);
        zong = (ImageView) findViewById(R.id.btn_5);
        telenor = (ImageView) findViewById(R.id.btn_4);

       btn_comparison = (Button) findViewById(R.id.btn_comparison);
        addAct = (Button) findViewById(R.id.addAct);

        addAct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main_Menu.this, Main2Activity.class);
                startActivity(intent);
            }
        });

        btn_comparison.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main_Menu.this, Comparison.class);
                startActivity(intent);
            }
        });

        ufone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main_Menu.this, PageTwo.class);
                startActivity(intent);
            }
        });


        mobilink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main_Menu.this, Mobilink_main.class);
                startActivity(intent);

            }
        });


        zong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main_Menu.this, Zong_main.class);
                startActivity(intent);
            }
        });


        telenor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main_Menu.this, Telenor_main.class);
                startActivity(intent);
            }
        });


    }
}
