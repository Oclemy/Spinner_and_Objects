package com.tutorials.hp.spinnerandobjects;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<String> people=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //SPINNER
        Spinner sp= (Spinner) findViewById(R.id.sp);

        //FILL LIST
        fillPeople();

        //ADAPTER
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,people);
        sp.setAdapter(adapter);

        //item selected
        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, people.get(i), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    private void fillPeople()
    {
        people.clear();

        Person p=new Person();
        p.setName("Mike");
        people.add(p.getName());

        p=new Person();
        p.setName("John");
        people.add(p.getName());

        p=new Person();
        p.setName("Lucy");
        people.add(p.getName());

        p=new Person();
        p.setName("Rebecca");
        people.add(p.getName());

        p=new Person();
        p.setName("Kris");
        people.add(p.getName());

        p=new Person();
        p.setName("Kurt");
        people.add(p.getName());

        p=new Person();
        p.setName("Vin");
        people.add(p.getName());
    }

}
