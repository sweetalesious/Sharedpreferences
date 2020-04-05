package com.example.sharedpreferences;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class from_details extends AppCompatActivity {
    private static final String MyPREFERENCES = "Myprefs";
    SharedPreferences sharedPreferences;

    TextView Name;
    TextView Value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_from_details);

        sharedPreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);

        Name = findViewById(R.id.textview_name);
        Value = findViewById(R.id.textview_value);

        if(sharedPreferences.contains("Name") &&
                sharedPreferences.contains("Value")){

            String name = sharedPreferences.getString("Name","");
            String value = sharedPreferences.getString("Value","");

            Name.setText(name);
            Value.setText(value);
        }
    }
}
