package com.example.sakhicomputer.mrnetwork;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView im_u, im_m, im_t;
    TextView textview;

    LinearLayout ll_1, ll_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);


        ll_1 = (LinearLayout) findViewById(R.id.ll_1);
        ll_2 = (LinearLayout) findViewById(R.id.ll_2);

        textview = (TextView) findViewById(R.id.textview);

//        im_u = (ImageView) findViewById(R.id.im_u);
//        im_m = (ImageView) findViewById(R.id.im_m);
//        im_t = (ImageView) findViewById(R.id.im_t);

        Animation myanim = AnimationUtils.loadAnimation(this, R.anim.mytransition);
        Animation myanim_uptodown = AnimationUtils.loadAnimation(this, R.anim.uptodown);
        Animation myanim_downtoup = AnimationUtils.loadAnimation(this, R.anim.downtoup);
        Animation myanim_right = AnimationUtils.loadAnimation(this, R.anim.rightanim);
        Animation myanim_left = AnimationUtils.loadAnimation(this, R.anim.leftanim);
        // textView.startAnimation(myanim);

//        im_u.startAnimation(myanim);
//        im_m.startAnimation(myanim);
//        im_t.startAnimation(myanim);

        ll_2.startAnimation(myanim_uptodown);
        textview.startAnimation(myanim);
        ll_1.startAnimation(myanim_downtoup);



        final Intent intent = new Intent(this,Main_Menu.class);

        Thread timer = new Thread(){
            public  void run(){
                try{
                    sleep(3000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
                finally {
                    startActivity(intent);
                    finish();
                }
            }
        };
        timer.start();
    }
}
