package com.example.rahadianirvan.prakmobro2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int[] gambar = {
            R.drawable.a,
            R.drawable.b,
            R.drawable.c,
            R.drawable.d,
            R.drawable.e,
            R.drawable.f,
            R.drawable.g,
            R.drawable.h
        };

    ListView list;

    String[] judul = {
            "Froyo",
            "Ginggerbread",
            "Ice Cream Sandwich",
            "Jelly Bean",
            "Kitkat",
            "Lollipop",
            "Marshmallow",
            "Nougat"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inisialisasi CustomAdapter dengan array
        CustomAdapter adapter = new CustomAdapter(this, gambar, judul);

        // Inisialisasi ListView
        list = (ListView) findViewById(R.id.list1);


        //set Adapter ke dalam ListView
        list.setAdapter(adapter);

        // action ketika ListView di klik
        list.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id){
                // TODO Auto-Generated method stub

                //String untuk mengambil judul pada ListView
                String Slecteditem = judul[position];

                //Menampilkan judul dengan Toast
                Toast.makeText(getApplicationContext(), Slecteditem,
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
