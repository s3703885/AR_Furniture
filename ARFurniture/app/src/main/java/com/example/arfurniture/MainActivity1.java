package com.example.arfurniture;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;

import java.util.ArrayList;
import java.util.List;
import android.os.Bundle;

public class MainActivity1 extends AppCompatActivity {

        ImageButton imagebuttom;
        ArrayAdapter<String> arrayAdapter;
        @Override
        protected void onCreate (Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main1);

            imagebuttom = (ImageButton) findViewById(R.id.imageButton1);
            imagebuttom.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity1.this, MainActivity2.class);
                    startActivity(intent);
                }
            });

            imagebuttom = (ImageButton) findViewById(R.id.imageButton2);
            imagebuttom.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity1.this, MainActivity3.class);
                    startActivity(intent);
                }
            });

            imagebuttom = (ImageButton) findViewById(R.id.imageButton3);
            imagebuttom.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity1.this, MainActivity4.class);
                    startActivity(intent);
                }
            });

            imagebuttom = (ImageButton) findViewById(R.id.imageButton4);
            imagebuttom.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity1.this, MainActivity5.class);
                    startActivity(intent);
                }
            });

            imagebuttom = (ImageButton) findViewById(R.id.imageButton5);
            imagebuttom.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity1.this, MainActivity3.class);
                    startActivity(intent);
                }
            });

            imagebuttom = (ImageButton) findViewById(R.id.imageButton6);
            imagebuttom.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity1.this, MainActivity4.class);
                    startActivity(intent);
                }
            });

            imagebuttom = (ImageButton) findViewById(R.id.imageButton7);
            imagebuttom.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity1.this, MainActivity3.class);
                    startActivity(intent);
                }
            });

            imagebuttom = (ImageButton) findViewById(R.id.imageButton8);
            imagebuttom.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity1.this, MainActivity4.class);
                    startActivity(intent);
                }
            });
            Button button;
            button = (Button) findViewById(R.id.button);

            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    EditText key = findViewById(R.id.editTextTextPersonName);
                    String text = key.getText().toString().toLowerCase();
                    Intent intent;
                    if (text.contains("silicus")) {
                        intent = new Intent(MainActivity1.this, MainActivity2.class);
                    } else if (text.contains("timber")) {
                        intent = new Intent(MainActivity1.this, MainActivity3.class);
                    } else if (text.contains("chanel")) {
                        intent = new Intent(MainActivity1.this, MainActivity4.class);
                    } else {
                        intent = new Intent(MainActivity1.this, MainActivity5.class);
                    }
                    startActivity(intent);
                }
            });

            getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);


        }
}