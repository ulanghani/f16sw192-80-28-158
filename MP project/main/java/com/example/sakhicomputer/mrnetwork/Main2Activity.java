package com.example.sakhicomputer.mrnetwork;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    private Spinner spinner, spinner_validity, spinner_category;
    ArrayList<String> spin_array = new ArrayList<>();
    ArrayList<String> spin_array_validity = new ArrayList<>();
    ArrayList<String> spin_array_category = new ArrayList<>();
    Button btn_addtoDatabase;
    public MyDatabase mydatabase;
    private EditText bucket_name, validity, category, price, subscription_code;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        spinner = (Spinner) findViewById(R.id.spinner_add);
        btn_addtoDatabase = (Button) findViewById(R.id.btn_addtoDatabase);
        bucket_name = (EditText) findViewById(R.id.bucket_name);
//        validity = (EditText) findViewById(R.id.validity);
        spinner_validity = (Spinner) findViewById(R.id.spinner_validity);
        spinner_category = (Spinner) findViewById(R.id.spinner_category);
        price = (EditText) findViewById(R.id.price);
        subscription_code = (EditText) findViewById(R.id.subscription_code);

        mydatabase = new MyDatabase(this);

        spin_array.add("ufone sms");
        spin_array.add("ufone call");
        spin_array.add("ufone data");

        spin_array.add("mobilink sms");
        spin_array.add("mobilink call");
        spin_array.add("mobilink data");

        spin_array.add("telenor sms");
        spin_array.add("telenor call");
        spin_array.add("telenor data");

        spin_array.add("zong sms");
        spin_array.add("zong call");
        spin_array.add("zong data");

        spin_array_validity.add("1 day");
        spin_array_validity.add("1 week");
        spin_array_validity.add("1 month");

        spin_array_category.add("Sms");
        spin_array_category.add("Call");
        spin_array_category.add("Data");



        ArrayAdapter arrayAdapterRec = new ArrayAdapter(Main2Activity.this, R.layout.support_simple_spinner_dropdown_item,
                spin_array);
        spinner.setAdapter(arrayAdapterRec);

        ArrayAdapter arrayAdapterValidity = new ArrayAdapter(Main2Activity.this, R.layout.support_simple_spinner_dropdown_item,
                spin_array_validity);
        spinner_validity.setAdapter(arrayAdapterValidity);

        ArrayAdapter arrayAdapterCategory = new ArrayAdapter(Main2Activity.this, R.layout.support_simple_spinner_dropdown_item,
                spin_array_category);
        spinner_category.setAdapter(arrayAdapterCategory);

        btn_addtoDatabase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String btn_bck_name = bucket_name.getText().toString().trim();
                String btn_validity = (String) spinner_validity.getSelectedItem();
                String btn_category = (String) spinner_category.getSelectedItem();
                String btn_price = "Rs. "+price.getText().toString().trim();
                String btn_subs_code = subscription_code.getText().toString().trim();

                if (btn_bck_name.isEmpty()){
                    bucket_name.setError("Enter bucket name");
                    bucket_name.requestFocus();
                    return;
                }


                if (btn_price.isEmpty()){
                    price.setError("Enter price");
                    price.requestFocus();
                    return;
                }

                if (btn_subs_code.isEmpty()){
                    subscription_code.setError("Enter code");
                    subscription_code.requestFocus();
                    return;
                }

                if (spinner.getSelectedItem()=="ufone sms"){
                    Toast.makeText(Main2Activity.this, "ufone sms", Toast.LENGTH_SHORT).show();

                    mydatabase.add_ufone("",""+btn_bck_name,""+btn_validity,""+btn_category,
                            ""+btn_price,""+btn_subs_code, "Ufone");

                    mydatabase.add_Allnetwork("",""+btn_bck_name,""+btn_validity,""+btn_category,
                            ""+btn_price,""+btn_subs_code, "Ufone");

                    System.out.println("---ufone = "+mydatabase.getallUfone());
                }

                if (spinner.getSelectedItem()=="ufone call"){
                    Toast.makeText(Main2Activity.this, "ufone call", Toast.LENGTH_SHORT).show();

                    mydatabase.add_ufone_call("",""+btn_bck_name,""+btn_validity,""+btn_category,
                            ""+btn_price,""+btn_subs_code, "Ufone");

                    mydatabase.add_Allnetwork("",""+btn_bck_name,""+btn_validity,""+btn_category,
                            ""+btn_price,""+btn_subs_code, "Ufone");


                    System.out.println("---ufone = "+mydatabase.getallUfone_call());
                }

                if (spinner.getSelectedItem()=="ufone data"){
                    Toast.makeText(Main2Activity.this, "ufone data", Toast.LENGTH_SHORT).show();

                    mydatabase.add_ufone_data("",""+btn_bck_name,""+btn_validity,""+btn_category,
                            ""+btn_price,""+btn_subs_code, "Ufone");

                    mydatabase.add_Allnetwork("",""+btn_bck_name,""+btn_validity,""+btn_category,
                            ""+btn_price,""+btn_subs_code, "Ufone");


                    System.out.println("---ufone = "+mydatabase.getallUfone_data());
                }

          //////////////////////

                if (spinner.getSelectedItem()=="mobilink sms"){
                    Toast.makeText(Main2Activity.this, "mobilink sms", Toast.LENGTH_SHORT).show();
                    mydatabase.add_mobilink_sms("",""+btn_bck_name,""+btn_validity,""+btn_category,
                            ""+btn_price,""+btn_subs_code,"Mobilink");

                    mydatabase.add_Allnetwork("",""+btn_bck_name,""+btn_validity,""+btn_category,
                            ""+btn_price,""+btn_subs_code,"Mobilink");


                    System.out.println("---ufone = "+mydatabase.getallMobilink_sms());
                }

                if (spinner.getSelectedItem()=="mobilink call"){
                    Toast.makeText(Main2Activity.this, "mobilink call", Toast.LENGTH_SHORT).show();
                    mydatabase.add_Mobilink_call("",""+btn_bck_name,""+btn_validity,""+btn_category,
                            ""+btn_price,""+btn_subs_code,"Mobilink");

                    mydatabase.add_Allnetwork("",""+btn_bck_name,""+btn_validity,""+btn_category,
                            ""+btn_price,""+btn_subs_code,"Mobilink");


                    System.out.println("---ufone = "+mydatabase.getallMobilink_call());
                }

                if (spinner.getSelectedItem()=="mobilink data"){
                    Toast.makeText(Main2Activity.this, "mobilink data", Toast.LENGTH_SHORT).show();
                    mydatabase.add_Mobilink_data("",""+btn_bck_name,""+btn_validity,""+btn_category,
                            ""+btn_price,""+btn_subs_code,"Mobilink");

                    mydatabase.add_Allnetwork("",""+btn_bck_name,""+btn_validity,""+btn_category,
                            ""+btn_price,""+btn_subs_code,"Mobilink");


                    System.out.println("---ufone = "+mydatabase.getallMobilink_data());
                }


         //////////////////////

                if (spinner.getSelectedItem()=="telenor sms"){
                    Toast.makeText(Main2Activity.this, "telenor sms", Toast.LENGTH_SHORT).show();
                    mydatabase.add_Telenor_sms("",""+btn_bck_name,""+btn_validity,""+btn_category,
                            ""+btn_price,""+btn_subs_code,"Telenor");

                    mydatabase.add_Allnetwork("",""+btn_bck_name,""+btn_validity,""+btn_category,
                            ""+btn_price,""+btn_subs_code,"Telenor");


                    System.out.println("---ufone = "+mydatabase.getallTelenor_sms());
                }

                if (spinner.getSelectedItem()=="telenor call"){
                    Toast.makeText(Main2Activity.this, "telenor call", Toast.LENGTH_SHORT).show();
                    mydatabase.add_Telenor_call("",""+btn_bck_name,""+btn_validity,""+btn_category,
                            ""+btn_price,""+btn_subs_code,"Telenor");

                    mydatabase.add_Allnetwork("",""+btn_bck_name,""+btn_validity,""+btn_category,
                            ""+btn_price,""+btn_subs_code,"Telenor");


                    System.out.println("---ufone = "+mydatabase.getallTelenor_call());
                }

                if (spinner.getSelectedItem()=="telenor data"){
                    Toast.makeText(Main2Activity.this, "telenor data", Toast.LENGTH_SHORT).show();
                    mydatabase.add_Telenor_data("",""+btn_bck_name,""+btn_validity,""+btn_category,
                            ""+btn_price,""+btn_subs_code,"Telenor");

                    mydatabase.add_Allnetwork("",""+btn_bck_name,""+btn_validity,""+btn_category,
                            ""+btn_price,""+btn_subs_code,"Telenor");


                    System.out.println("---ufone = "+mydatabase.getallTelenor_data());
                }


         ///////////////////

                if (spinner.getSelectedItem()=="zong sms"){
                    Toast.makeText(Main2Activity.this, "zong sms", Toast.LENGTH_SHORT).show();
                    mydatabase.add_Zong_sms("",""+btn_bck_name,""+btn_validity,""+btn_category,
                            ""+btn_price,""+btn_subs_code,"Zong");

                    mydatabase.add_Allnetwork("",""+btn_bck_name,""+btn_validity,""+btn_category,
                            ""+btn_price,""+btn_subs_code,"Zong");


                    System.out.println("---ufone = "+mydatabase.getallZong_sms());
                }

                if (spinner.getSelectedItem()=="zong call"){
                    Toast.makeText(Main2Activity.this, "zong call", Toast.LENGTH_SHORT).show();
                    mydatabase.add_Zong_call("",""+btn_bck_name,""+btn_validity,""+btn_category,
                            ""+btn_price,""+btn_subs_code,"Zong");

                    mydatabase.add_Allnetwork("",""+btn_bck_name,""+btn_validity,""+btn_category,
                            ""+btn_price,""+btn_subs_code,"Zong");


                    System.out.println("---ufone = "+mydatabase.getallZong_call());
                }

                if (spinner.getSelectedItem()=="zong data"){
                    Toast.makeText(Main2Activity.this, "zong data", Toast.LENGTH_SHORT).show();
                    mydatabase.add_Zong_data("",""+btn_bck_name,""+btn_validity,""+btn_category,
                            ""+btn_price,""+btn_subs_code,"Zong");

                    mydatabase.add_Allnetwork("",""+btn_bck_name,""+btn_validity,""+btn_category,
                            ""+btn_price,""+btn_subs_code,"Zong");


                    System.out.println("---ufone = "+mydatabase.getallZong_data());
                }


                bucket_name.setText("");
                price.setText("");
                subscription_code.setText("");

                Toast.makeText(Main2Activity.this, "DATA ADDED", Toast.LENGTH_SHORT).show();

            }
        });



    }
}
