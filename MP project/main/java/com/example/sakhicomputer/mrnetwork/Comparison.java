package com.example.sakhicomputer.mrnetwork;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import com.example.sakhicomputer.mrnetwork.Adapters.Adapter_u;
import com.example.sakhicomputer.mrnetwork.BeanClasses.Bean_ufone;

import java.util.ArrayList;

public class Comparison extends AppCompatActivity {

    private Spinner spinner;
    ListView listofcategory;
    public MyDatabase mydatabase;
    ArrayList<String> spin_array_category = new ArrayList<>();
    ArrayList<Bean_ufone> TempPackage = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comparison);

        spinner = (Spinner) findViewById(R.id.spinner);
        listofcategory = (ListView) findViewById(R.id.listt1234);


        spin_array_category.add("Sms");
        spin_array_category.add("Call");
        spin_array_category.add("Data");

        mydatabase = new MyDatabase(this);

//        for (int k = 0; k < mydatabase.getallfromAllnetwork().size(); k++) {
//            String category = mydatabase.getallfromAllnetwork().get(k).getCategory();
//            spin_array_category.add(category);
//        }

        ArrayAdapter arrayAdapterRec = new ArrayAdapter(Comparison.this, R.layout.support_simple_spinner_dropdown_item,
                spin_array_category);
        spinner.setAdapter(arrayAdapterRec);

        final ArrayList<Bean_ufone> list = mydatabase.getallfromAllnetwork();

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String selected_category = spin_array_category.get(i);

                System.out.println("--selected categoey "+selected_category);
                TempPackage.clear();

                for (int k=0; k<list.size(); k++){
                    if (list.get(k).getCategory().equalsIgnoreCase(selected_category)){

                        TempPackage.add(list.get(k));
                    }
                }

                Adapter_u adapter_main = new Adapter_u(Comparison.this, TempPackage);
                listofcategory.setAdapter(adapter_main);

                adapter_main.notifyDataSetChanged();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }
}
