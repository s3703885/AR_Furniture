package com.example.arfurniture;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.text.style.DrawableMarginSpan;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    private ImageButton imagebuttom;
    private ArrayList<String> product;
    private SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        SharedPreferences sharedPreferences = getSharedPreferences("data", MODE_PRIVATE);
        editor = sharedPreferences.edit();

        Intent intent = getIntent();
        product = new ArrayList<>();
        final Bundle bundle = intent.getExtras();
        boolean status = bundle.getBoolean("status");
        product = bundle.getStringArrayList("name");

        if(status){
            findViewById(R.id.ScrollView).setBackground(getDrawable(R.drawable.black));
            TextView description = findViewById(R.id.description);
            description.setTextColor(Color.rgb(221, 221, 221));
            TextView name = findViewById(R.id.name);
            name.setTextColor(Color.rgb(221, 221, 221));
            TextView textView2 = findViewById(R.id.textView2);
            textView2.setTextColor(Color.rgb(221, 221, 221));
            TextView textView24 = findViewById(R.id.textView24);
            textView24.setTextColor(Color.rgb(221, 221, 221));
        }

        imagebuttom = (ImageButton)findViewById(R.id.imageButton1);
        imagebuttom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        Button button  = findViewById(R.id.imageButton13);
        button.setOnClickListener(new View.OnClickListener() {
           Intent home = new Intent(MainActivity2.this,MainActivity1.class);
           Intent cart = new Intent(MainActivity2.this, CartActivity.class);
           AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity2.this);
            @Override
            public void onClick(View view) {
                editor.putString("SILICUS", "SILICUS");
                editor.commit();
                    builder.setTitle("Successful");
                    builder.setMessage("Item has been added to your cart successfully");
                    builder.setPositiveButton("Keep Shopping", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            startActivity(home);
                        }
                    });
                    builder.setNegativeButton("Go To cart", new DialogInterface.OnClickListener(){

                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            startActivity(cart);
                        }
                    });
                    AlertDialog alert = builder.create();
                    alert.show();

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
                Intent intent = new Intent(MainActivity2.this,CartActivity.class);
                startActivity(intent);
            default:
                return super.onOptionsItemSelected(item);
        }

    }
}