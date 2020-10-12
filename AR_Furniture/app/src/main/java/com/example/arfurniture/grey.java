package com.example.arfurniture;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class grey extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grey);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        boolean status = bundle.getBoolean("status");
        if(status){
            findViewById(R.id.ScrollView).setBackground(getDrawable(R.drawable.black));
        }

        ImageButton imagebuttom = (ImageButton)findViewById(R.id.imageButton);
        imagebuttom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}