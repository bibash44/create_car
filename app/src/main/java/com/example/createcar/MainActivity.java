package com.example.createcar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText txt_carname, txt_year, txt_color, txt_price, txt_engine_size;
    TextView res_carname, res_year, res_color, res_price, res_engine_size;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*input fields*/
        txt_carname=findViewById(R.id.txt_carname);
        txt_year=findViewById(R.id.txt_year);
        txt_color=findViewById(R.id.txt_color);
        txt_price=findViewById(R.id.txt_price);
        txt_engine_size= findViewById(R.id.txt_engine_size);

        /*textview to display values in scroll views */

        res_carname=findViewById(R.id.res_car_name);
        res_year= findViewById(R.id.res_year);
        res_color=findViewById(R.id.res_color);
        res_price=findViewById(R.id.res_price);
        res_engine_size=findViewById(R.id.txt_engine_size);



    }
}
