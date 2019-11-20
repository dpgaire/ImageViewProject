package com.mr.imageviewproject;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    RadioGroup rdogroup;
    RadioButton rdalbie,bren,amir;
    ImageView imgcri;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rdogroup=findViewById(R.id.rdogroup);
        rdalbie=findViewById(R.id.rdalbie);
        bren=findViewById(R.id.bren);
        amir=findViewById(R.id.amir);
        imgcri=findViewById(R.id.imgcri);

        rdalbie.setOnClickListener(this);
        amir.setOnClickListener(this);
        bren.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.amir:
                imgcri.setImageResource(R.drawable.momoh);
                break;


            case R.id.bren:
                imgcri.setImageResource(R.drawable.b);
                break;

            case R.id.rdalbie:
                imgcri.setImageResource(R.drawable.albie);
                break;
        }
    }
}
