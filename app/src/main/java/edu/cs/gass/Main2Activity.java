package edu.cs.gass;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {
    ImageView img;
    TextView tv1, tv2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setTitle("BEAUTY STORE APP");


        img = (ImageView) findViewById(R.id.desc_img);
        tv1 = (TextView) findViewById(R.id.desc_header);
        tv2 = (TextView) findViewById(R.id.desc_desc);

        img.setImageResource(getIntent().getIntExtra("imagename", 0));
        tv1.setText(getIntent().getStringExtra("header"));
        tv2.setText(getIntent().getStringExtra("desc"));

    }

}