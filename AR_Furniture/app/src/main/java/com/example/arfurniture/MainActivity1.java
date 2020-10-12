package com.example.arfurniture;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity1 extends AppCompatActivity {

        private ImageButton imagebuttom;
        public  boolean dark=false;
        private ArrayList<String> likes = new ArrayList<String>();
        private ArrayList<String> products = new ArrayList<String>();


    @Override
        protected void onCreate (Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main1);
            Switch sw;
            sw = (Switch)findViewById(R.id.switch1);
            sw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if(isChecked){
                        dark=true;
                        findViewById(R.id.ScrollView).setBackground(getDrawable(R.drawable.black));
                        ((Switch) findViewById(R.id.switch1)).setTextColor(Color.rgb(255, 255, 255));
                        findViewById(R.id.textView).setBackground(getDrawable(R.drawable.black));
                        findViewById(R.id.textView2).setBackground(getDrawable(R.drawable.black));
                        findViewById(R.id.textView3).setBackground(getDrawable(R.drawable.black));
                        findViewById(R.id.textView4).setBackground(getDrawable(R.drawable.black));
                        findViewById(R.id.textView5).setBackground(getDrawable(R.drawable.black));
                        findViewById(R.id.textView6).setBackground(getDrawable(R.drawable.black));
                        findViewById(R.id.textView7).setBackground(getDrawable(R.drawable.black));
                        findViewById(R.id.textView8).setBackground(getDrawable(R.drawable.black));
                        findViewById(R.id.textView9).setBackground(getDrawable(R.drawable.black));
                        findViewById(R.id.textView10).setBackground(getDrawable(R.drawable.black));
                        findViewById(R.id.textView11).setBackground(getDrawable(R.drawable.black));
                        findViewById(R.id.textView12).setBackground(getDrawable(R.drawable.black));
                        findViewById(R.id.textView13).setBackground(getDrawable(R.drawable.black));
                        findViewById(R.id.textView14).setBackground(getDrawable(R.drawable.black));
                        findViewById(R.id.textView15).setBackground(getDrawable(R.drawable.black));
                        findViewById(R.id.textView16).setBackground(getDrawable(R.drawable.black));
                    }else{
                        dark=false;
                        findViewById(R.id.ScrollView).setBackgroundColor(Color.rgb(255, 230, 230));
                        ((Switch) findViewById(R.id.switch1)).setTextColor(Color.rgb(0, 0, 0));
                        findViewById(R.id.textView).setBackgroundColor(Color.rgb(0, 0, 0));
                        findViewById(R.id.textView2).setBackgroundColor(Color.rgb(0, 0, 0));
                        findViewById(R.id.textView3).setBackgroundColor(Color.rgb(0, 0, 0));
                        findViewById(R.id.textView4).setBackgroundColor(Color.rgb(0, 0, 0));
                        findViewById(R.id.textView5).setBackgroundColor(Color.rgb(0, 0, 0));
                        findViewById(R.id.textView6).setBackgroundColor(Color.rgb(0, 0, 0));
                        findViewById(R.id.textView7).setBackgroundColor(Color.rgb(0, 0, 0));
                        findViewById(R.id.textView8).setBackgroundColor(Color.rgb(0, 0, 0));
                        findViewById(R.id.textView9).setBackgroundColor(Color.rgb(0, 0, 0));
                        findViewById(R.id.textView10).setBackgroundColor(Color.rgb(0, 0, 0));
                        findViewById(R.id.textView11).setBackgroundColor(Color.rgb(0, 0, 0));
                        findViewById(R.id.textView12).setBackgroundColor(Color.rgb(0, 0, 0));
                        findViewById(R.id.textView13).setBackgroundColor(Color.rgb(0, 0, 0));
                        findViewById(R.id.textView14).setBackgroundColor(Color.rgb(0, 0, 0));
                        findViewById(R.id.textView15).setBackgroundColor(Color.rgb(0, 0, 0));
                        findViewById(R.id.textView16).setBackgroundColor(Color.rgb(0, 0, 0));
                    }
                }
            });

            imagebuttom = (ImageButton) findViewById(R.id.imageButton1);
            imagebuttom.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity1.this, MainActivity2.class);
                    Bundle  bundle = new Bundle();

                    bundle.putBoolean("status",dark);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
            });

            imagebuttom = (ImageButton) findViewById(R.id.imageButton2);
            imagebuttom.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity1.this, MainActivity3.class);
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("status",dark);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
            });

            imagebuttom = (ImageButton) findViewById(R.id.imageButton3);
            imagebuttom.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity1.this, MainActivity4.class);
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("status",dark);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
            });

            imagebuttom = (ImageButton) findViewById(R.id.imageButton4);
            imagebuttom.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity1.this, MainActivity5.class);
                    Bundle bundle = new Bundle();

                    bundle.putBoolean("status",dark);

                    intent.putExtras(bundle);

                    startActivity(intent);
                }
            });

            imagebuttom = (ImageButton) findViewById(R.id.imageButton5);
            imagebuttom.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity1.this, MainActivity3.class);
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("status",dark);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
            });

            imagebuttom = (ImageButton) findViewById(R.id.imageButton6);
            imagebuttom.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity1.this, MainActivity4.class);
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("status",dark);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
            });

            imagebuttom = (ImageButton) findViewById(R.id.imageButton7);
            imagebuttom.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity1.this, MainActivity3.class);
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("status",dark);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
            });

            imagebuttom = (ImageButton) findViewById(R.id.imageButton8);
            imagebuttom.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity1.this, MainActivity4.class);
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("status",dark);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
            });

            final Bundle bundle = new Bundle();
            final Intent intent = new Intent(MainActivity1.this, MainActivity6.class);;
            final ImageButton imagebuttom9 = (ImageButton) findViewById(R.id.imageButton9);

            imagebuttom9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(imagebuttom9.getContentDescription().toString()=="like1"){
                        imagebuttom9.setBackground(getDrawable(R.drawable.unlike));
                        likes.remove(imagebuttom9.getContentDescription().toString());
                        imagebuttom9.setContentDescription("unlike1");
                    }else{
                        imagebuttom9.setBackground(getDrawable(R.drawable.like));
                        imagebuttom9.setContentDescription("like1");
                        likes.add(imagebuttom9.getContentDescription().toString());
                    }

                }
            });
            final ImageButton imagebuttom10 = (ImageButton) findViewById(R.id.imageButton10);
            imagebuttom10.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(imagebuttom10.getContentDescription().toString()=="like2"){
                        imagebuttom10.setBackground(getDrawable(R.drawable.unlike));
                        likes.remove(imagebuttom10.getContentDescription().toString());
                        imagebuttom10.setContentDescription("unlike2");
                    }else{
                        imagebuttom10.setBackground(getDrawable(R.drawable.like));
                        imagebuttom10.setContentDescription("like2");
                        likes.add(imagebuttom10.getContentDescription().toString());
                    }
                }
            });

            final ImageButton imagebuttom11 = (ImageButton) findViewById(R.id.imageButton11);
            imagebuttom11.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(imagebuttom11.getContentDescription().toString()=="like3"){
                        imagebuttom11.setBackground(getDrawable(R.drawable.unlike));
                        likes.remove(imagebuttom11.getContentDescription().toString());
                        imagebuttom11.setContentDescription("unlike3");
                    }else{
                        imagebuttom11.setBackground(getDrawable(R.drawable.like));
                        imagebuttom11.setContentDescription("like3");
                        likes.add(imagebuttom11.getContentDescription().toString());
                    }

                }
            });
            final ImageButton imagebuttom12 = (ImageButton) findViewById(R.id.imageButton12);
            imagebuttom12.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(imagebuttom12.getContentDescription().toString()=="like4"){
                        imagebuttom12.setBackground(getDrawable(R.drawable.unlike));
                        likes.remove(imagebuttom12.getContentDescription().toString());
                        imagebuttom12.setContentDescription("unlike4");
                    }else{
                        imagebuttom12.setBackground(getDrawable(R.drawable.like));
                        imagebuttom12.setContentDescription("like4");
                        likes.add(imagebuttom12.getContentDescription().toString());
                    }

                }
            });
            final ImageButton imagebuttom13 = (ImageButton) findViewById(R.id.imageButton13);
            imagebuttom13.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(imagebuttom13.getContentDescription().toString()=="like1"){
                        imagebuttom13.setBackground(getDrawable(R.drawable.unlike));
                        likes.remove(imagebuttom13.getContentDescription().toString());
                        imagebuttom13.setContentDescription("unlike1");
                    }else{
                        imagebuttom13.setBackground(getDrawable(R.drawable.like));
                        imagebuttom13.setContentDescription("like1");
                        likes.add(imagebuttom13.getContentDescription().toString());
                    }

                }
            });
            final ImageButton imagebuttom14 = (ImageButton) findViewById(R.id.imageButton14);
            imagebuttom14.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(imagebuttom14.getContentDescription().toString()=="like2"){
                        imagebuttom14.setBackground(getDrawable(R.drawable.unlike));
                        likes.remove(imagebuttom14.getContentDescription().toString());
                        imagebuttom14.setContentDescription("unlike2");
                    }else{
                        imagebuttom14.setBackground(getDrawable(R.drawable.like));
                        imagebuttom14.setContentDescription("like2");
                        likes.add(imagebuttom14.getContentDescription().toString());
                    }

                }
            });
            final ImageButton imagebuttom15 = (ImageButton) findViewById(R.id.imageButton15);
            imagebuttom15.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(imagebuttom15.getContentDescription().toString()=="like1"){
                        imagebuttom15.setBackground(getDrawable(R.drawable.unlike));
                        likes.remove(imagebuttom15.getContentDescription().toString());
                        imagebuttom15.setContentDescription("unlike1");
                    }else{
                        imagebuttom15.setBackground(getDrawable(R.drawable.like));
                        imagebuttom15.setContentDescription("like1");
                        likes.add(imagebuttom15.getContentDescription().toString());
                    }

                }
            });
            final ImageButton imagebuttom16 = (ImageButton) findViewById(R.id.imageButton16);
            imagebuttom16.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(imagebuttom16.getContentDescription().toString()=="like2"){
                        imagebuttom16.setBackground(getDrawable(R.drawable.unlike));
                        likes.remove(imagebuttom16.getContentDescription().toString());
                        imagebuttom16.setContentDescription("unlike2");
                    }else{
                        imagebuttom16.setBackground(getDrawable(R.drawable.like));
                        imagebuttom16.setContentDescription("like2");
                        likes.add(imagebuttom16.getContentDescription().toString());
                    }

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
                    } else if (text.contains("envelo")){
                        intent = new Intent(MainActivity1.this, MainActivity5.class);
                    }else if (text.contains("pink")){
                        intent = new Intent(MainActivity1.this, pink.class);
                    }else if (text.contains("black")){
                        intent = new Intent(MainActivity1.this, black.class);
                    }else if (text.contains("brown")){
                        intent = new Intent(MainActivity1.this, brown.class);
                    }else if (text.contains("grey")||text.contains("gray")){
                        intent = new Intent(MainActivity1.this, grey.class);
                    }else if (text.contains("desk")||text.contains("table")){
                        intent = new Intent(MainActivity1.this, pink.class);
                    }else if (text.contains("chair")){
                        intent = new Intent(MainActivity1.this, black.class);
                    }else if (text.contains("media")||text.contains("unit")){
                        intent = new Intent(MainActivity1.this, black.class);
                    }else if (text.contains("sofa")){
                        intent = new Intent(MainActivity1.this, grey.class);
                    }else{
                        intent = new Intent(MainActivity1.this, MainActivity1.class);

                    }
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("status",dark);
                    intent.putExtras(bundle);
                    startActivity(intent);

                }

            });

        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);
            Button button2;
            button2 = (Button) findViewById(R.id.button2);
            button2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity1.this, MainActivity6.class);
                    bundle.clear();
                    bundle.putStringArrayList("likes",likes);
                    Bundle bundle2 = new Bundle();
                    bundle2.putBoolean("status",dark);
                    intent.putExtras(bundle);
                    intent.putExtras(bundle2);
                    startActivity(intent);
                }
            });


        }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.sidebar,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()){
            case R.id.cart:
                Intent intent = new Intent(MainActivity1.this,CartActivity.class);
                startActivity(intent);
            default:
                return super.onOptionsItemSelected(item);
        }

    }
    }
