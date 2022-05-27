package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    CheckBox b1,b2,b3,b4;
    Button b5;
    TextView b6;

    List<String> hobbylist = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hobbylist.clear();

                if (b1.isChecked()){
                    hobbylist.add("dancing");
                }
                if (b2.isChecked()){
                    hobbylist.add("coding");
                }
                if (b3.isChecked()){
                    hobbylist.add("reading");
                }
                if (b4.isChecked()){
                    hobbylist.add("writing");
                }

                String hobby = "";

                for (int i=0; i< hobbylist.size(); i++) {
                    hobby +=hobbylist.get(i).toString()+"\n";
                }
                b6.setText(hobby);
            }
        });
    }
}