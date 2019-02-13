package com.example.sakhicomputer.mrnetwork.Adapters;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sakhicomputer.mrnetwork.BeanClasses.Bean_ufone;
import com.example.sakhicomputer.mrnetwork.R;


import java.util.ArrayList;



/**
 * Created by SAkhi COmputer on 31/10/2017.
 */

public class Adapter_u extends BaseAdapter {

    Bean_ufone bean_ufone;
    private Activity activity;
    public static ArrayList<Bean_ufone> mybeanArrayList;

    public Adapter_u(Activity activity, ArrayList<Bean_ufone> mybeanArrayList) {
        this.activity = activity;
        this.mybeanArrayList = mybeanArrayList;
    }

    @Override
    public int getCount() {
        return mybeanArrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return mybeanArrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        View v = view;
        if (v==null){
            LayoutInflater inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inflater.inflate(R.layout.item_ufone,null);
        }

        TextView bucket_name = v.findViewById(R.id.bucket_name);
        TextView validity = v.findViewById(R.id.validity);
        TextView category = v.findViewById(R.id.category);
        TextView price = v.findViewById(R.id.price);
        TextView network_name = v.findViewById(R.id.network_name);
        final TextView subscription_code = v.findViewById(R.id.subscription_code);
        Button sub_btn = v.findViewById(R.id.sub_btn);

        bucket_name.setText(""+mybeanArrayList.get(i).getBucket_name());
        validity.setText(""+mybeanArrayList.get(i).getValidity());
        category.setText(""+mybeanArrayList.get(i).getCategory());
        price.setText(""+mybeanArrayList.get(i).getPrice());
        subscription_code.setText(""+mybeanArrayList.get(i).getSubscription_code());
        network_name.setText(""+mybeanArrayList.get(i).getNetwork());

        sub_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(activity, "Package subscription done! "+subscription_code.getText(), Toast.LENGTH_SHORT).show();

                Intent i = new Intent(Intent.ACTION_DIAL);
                i.setData(Uri.parse("tel:"+subscription_code.getText()+"#"));

                activity.startActivity(i);

            }
        });

        return v;
    }

}
