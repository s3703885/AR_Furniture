package com.example.arfurniture;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity6 extends AppCompatActivity {

    private ArrayList<String> likes = new ArrayList<String>();
    private boolean a = false;
    private boolean b = false;
    private boolean c = false;
    private boolean d = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        likes = bundle.getStringArrayList("likes");
        boolean status = bundle.getBoolean("status");
        TextView textView;
        TextView textView1;
        findViewById(R.id.imageButton0).setBackground(null);
        findViewById(R.id.imageButton1).setBackground(null);
        findViewById(R.id.imageButton2).setBackground(null);
        findViewById(R.id.imageButton3).setBackground(null);
        if(status){
            findViewById(R.id.ScrollView).setBackground(getDrawable(R.drawable.black));
            textView = findViewById(R.id.textView0);
            textView.setTextColor(Color.rgb(221, 221, 221));
            textView = findViewById(R.id.textView1);
            textView.setTextColor(Color.rgb(221, 221, 221));
            textView = findViewById(R.id.textView2);
            textView.setTextColor(Color.rgb(221, 221, 221));
            textView = findViewById(R.id.textView3);
            textView.setTextColor(Color.rgb(221, 221, 221));
            textView = findViewById(R.id.textView4);
            textView.setTextColor(Color.rgb(221, 221, 221));
            textView = findViewById(R.id.textView5);
            textView.setTextColor(Color.rgb(221, 221, 221));
            textView = findViewById(R.id.textView6);
            textView.setTextColor(Color.rgb(221, 221, 221));
            textView = findViewById(R.id.textView7);
            textView.setTextColor(Color.rgb(221, 221, 221));

        }
        for(int i=0;i<likes.size();i++) {
            switch (likes.get(i)) {
                case "like1":
                    if(d){
                        Toast.makeText(this,"Favorite list is full! Remove before add!",Toast.LENGTH_LONG).show();
                    }else{
                        if(a){
                            if(b){
                                if(c){
                                    findViewById(R.id.imageButton3).setBackground(getDrawable(R.drawable.a1601104273));
                                    textView = findViewById(R.id.textView6);
                                    textView1 = findViewById(R.id.textView7);
                                    textView.setText("SILICUS");
                                    textView1.setText("Silicus Pink Oblong Coffee Table");
                                    d = true;

                                }else{
                                    findViewById(R.id.imageButton2).setBackground(getDrawable(R.drawable.a1601104273));
                                    textView = findViewById(R.id.textView4);
                                    textView1 = findViewById(R.id.textView5);
                                    textView.setText("SILICUS");
                                    textView1.setText("Silicus Pink Oblong Coffee Table");
                                    c = true;
                                }
                            }else{
                                findViewById(R.id.imageButton1).setBackground(getDrawable(R.drawable.a1601104273));
                                textView = findViewById(R.id.textView2);
                                textView.setText("SILICUS");
                                textView1 = findViewById(R.id.textView3);
                                textView1.setText("Silicus Pink Oblong Coffee Table");
                                b = true;
                            }
                        }else{
                            findViewById(R.id.imageButton0).setBackground(getDrawable(R.drawable.a1601104273));
                            textView = findViewById(R.id.textView0);
                            textView.setText("SILICUS");
                            textView1 = findViewById(R.id.textView1);
                            textView1.setText("Silicus Pink Oblong Coffee Table");
                            a = true;
                        }
                    }

                    break;
                case "like2":
                    if(d){
                        Toast.makeText(this,"Favorite list is full! Remove before add!",Toast.LENGTH_LONG).show();
                    }else {
                        if (a) {
                            if (b) {
                                if (c) {
                                    findViewById(R.id.imageButton3).setBackground(getDrawable(R.drawable.a1601106653));
                                    textView = findViewById(R.id.textView6);
                                    textView.setText("TIMBER");
                                    textView1 = findViewById(R.id.textView7);
                                    textView1.setText("Timber Pebble Gray Sofa");
                                    d = true;
                                } else {
                                    findViewById(R.id.imageButton2).setBackground(getDrawable(R.drawable.a1601106653));
                                    textView = findViewById(R.id.textView4);
                                    textView.setText("TIMBER");
                                    textView1 = findViewById(R.id.textView5);
                                    textView1.setText("Timber Pebble Gray Sofa");
                                    c = true;
                                }
                            } else {
                                findViewById(R.id.imageButton1).setBackground(getDrawable(R.drawable.a1601106653));
                                textView = findViewById(R.id.textView2);
                                textView.setText("TIMBER");
                                textView1 = findViewById(R.id.textView3);
                                textView1.setText("Timber Pebble Gray Sofa");
                                b = true;
                            }
                        } else {
                            findViewById(R.id.imageButton0).setBackground(getDrawable(R.drawable.a1601106653));
                            textView = findViewById(R.id.textView0);
                            textView.setText("TIMBER");
                            textView1 = findViewById(R.id.textView1);
                            textView1.setText("Timber Pebble Gray Sofa");
                            a = true;
                        }
                    }
                    break;
                case "like3":
                    if(d){
                        Toast.makeText(this,"Favorite list is full! Remove before add!",Toast.LENGTH_LONG).show();
                    }else {
                        if (a) {
                            if (b) {
                                if (c) {
                                    findViewById(R.id.imageButton3).setBackground(getDrawable(R.drawable.a1601106616));
                                    textView = findViewById(R.id.textView6);
                                    textView.setText("CHANEL");
                                    textView1 = findViewById(R.id.textView7);
                                    textView1.setText("Zola Volcanic Gray Dining Chair");
                                    d = true;
                                } else {
                                    findViewById(R.id.imageButton2).setBackground(getDrawable(R.drawable.a1601106616));
                                    textView = findViewById(R.id.textView4);
                                    textView.setText("CHANEL");
                                    textView1 = findViewById(R.id.textView5);
                                    textView1.setText("Zola Volcanic Gray Dining Chair");
                                    c = true;
                                }
                            } else {
                                findViewById(R.id.imageButton1).setBackground(getDrawable(R.drawable.a1601106616));
                                textView = findViewById(R.id.textView2);
                                textView.setText("CHANEL");
                                textView1 = findViewById(R.id.textView3);
                                textView1.setText("Zola Volcanic Gray Dining Chair");
                                b = true;
                            }
                        } else {
                            findViewById(R.id.imageButton0).setBackground(getDrawable(R.drawable.a1601106616));
                            textView = findViewById(R.id.textView0);
                            textView.setText("CHANEL");
                            textView1 = findViewById(R.id.textView1);
                            textView1.setText("Zola Volcanic Gray Dining Chair");
                            a = true;
                        }
                    }
                    break;
                case "like4":
                    if(d){
                        Toast.makeText(this,"Favorite list is full! Remove before add!",Toast.LENGTH_LONG).show();
                    }else {
                        if (a) {
                            if (b) {
                                if (c) {
                                    findViewById(R.id.imageButton3).setBackground(getDrawable(R.drawable.a1601106758));
                                    textView = findViewById(R.id.textView6);
                                    textView.setText("ENVELO");
                                    textView1 = findViewById(R.id.textView7);
                                    textView1.setText("Envelo 48\" Media Unit");
                                    d = true;
                                } else {
                                    findViewById(R.id.imageButton2).setBackground(getDrawable(R.drawable.a1601106758));
                                    textView = findViewById(R.id.textView4);
                                    textView.setText("ENVELO");
                                    textView1 = findViewById(R.id.textView5);
                                    textView1.setText("Envelo 48\" Media Unit");
                                    c = true;
                                }
                            } else {
                                findViewById(R.id.imageButton1).setBackground(getDrawable(R.drawable.a1601106758));
                                textView = findViewById(R.id.textView2);
                                textView.setText("ENVELO");
                                textView1 = findViewById(R.id.textView3);
                                textView1.setText("Envelo 48\" Media Unit");
                                b = true;
                            }
                        } else {
                            findViewById(R.id.imageButton0).setBackground(getDrawable(R.drawable.a1601106758));
                            textView = findViewById(R.id.textView0);
                            textView.setText("ENVELO");
                            textView1 = findViewById(R.id.textView1);
                            textView1.setText("Envelo 48\" Media Unit");
                            a = true;
                        }
                    }
                    break;
            }
        }
    }
}