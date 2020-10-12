package com.example.arfurniture;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.Image;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CartActivity extends AppCompatActivity {
    private Collection<String> products;
    private ImageButton imageButton0;
    private ImageButton imageButton1;
    private ImageButton imageButton2;
    private ImageButton imageButton3;
    private ImageButton btn_cancel0;
    private ImageButton btn_cancel1;
    private ImageButton btn_cancel2;
    private ImageButton btn_cancel3;
    private TextView textView0,textView1,textView2,textView3,textView4,textView5,textView6,textView7;
    private  SharedPreferences sharedPreferences ;
    private SharedPreferences.Editor editor;

    protected void onCreate(Bundle savedInstanceState) {
        sharedPreferences= getSharedPreferences("data", MODE_PRIVATE);
        editor = sharedPreferences.edit();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        imageButton0 = findViewById(R.id.imageButton0);
        imageButton1 = findViewById(R.id.imageButton1);
        imageButton2 = findViewById(R.id.imageButton2);
        imageButton3 = findViewById(R.id.imageButton3);
        btn_cancel0 = findViewById(R.id.cancel_button);
        btn_cancel1 = findViewById(R.id.cancel_button1);
        btn_cancel2 = findViewById(R.id.cancel_button2);
        btn_cancel3 =  findViewById(R.id.cancel_button3);
        textView0 = (TextView)findViewById(R.id.textView0);
        textView1 = (TextView)findViewById(R.id.textView1);
        textView2 = (TextView)findViewById(R.id.textView2);
        textView3 = (TextView)findViewById(R.id.textView3);
        textView4 = (TextView)findViewById(R.id.textView4);
        textView5 = (TextView)findViewById(R.id.textView5);
        textView6 = (TextView)findViewById(R.id.textView6);
        textView7 = (TextView)findViewById(R.id.textView7);
        imageButton0.setBackground(null);
        imageButton1.setBackground(null);
        imageButton2.setBackground(null);
        imageButton2.setBackground(null);
        btn_cancel0.setBackground(null);
        btn_cancel1.setBackground(null);
        btn_cancel2.setBackground(null);
        btn_cancel3.setBackground(null);
        products = (Collection<String>) sharedPreferences.getAll().values();
        for(String product:products) {
            if (imageButton0.getContentDescription() == null) {
                showProduct(imageButton0, product, btn_cancel0, textView0, textView1);
            } else if (imageButton1.getContentDescription() == null) {
                showProduct(imageButton1, product, btn_cancel1, textView2, textView3);
            } else if (imageButton2.getContentDescription() == null) {
                showProduct(imageButton2, product, btn_cancel2, textView4, textView5);
            } else if (imageButton3.getContentDescription() == null) {
                showProduct(imageButton3, product, btn_cancel3, textView6, textView7);
            }
        }

        findViewById(R.id.cancel_button).setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                imageButton0.setContentDescription("");
                findViewById(R.id.imageButton0).setBackground(null);
                findViewById(R.id.cancel_button).setBackground(null);
                TextView textView = findViewById(R.id.textView0);

                TextView textView1 = findViewById(R.id.textView1);

                products.remove(0);
                if(textView.getText().equals("SILICUS")){
                    editor.remove("SILICUS");
                    editor.commit();
                }else if (textView.getText().equals("TIMBER")){
                    editor.remove("TIMBER");
                    editor.commit();
                }else if(textView.getText().equals("CHANEL")){
                    editor.remove("CHANEL");
                    editor.commit();
                }else if(textView.getText().equals("ENVELO")){
                    editor.remove("ENVELO");
                    editor.commit();
                }
                textView1.setText("");
                textView.setText("");
            }
        });

        findViewById(R.id.cancel_button1).setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                imageButton1.setContentDescription("");
                findViewById(R.id.imageButton1).setBackground(null);
                findViewById(R.id.cancel_button1).setBackground(null);
                TextView textView = findViewById(R.id.textView2);

                TextView textView1 = findViewById(R.id.textView3);

                if(textView.getText().equals("SILICUS")){
                    editor.remove("SILICUS");
                    editor.commit();
                }else if (textView.getText().equals("TIMBER")){
                    editor.remove("TIMBER");
                    editor.commit();
                }else if(textView.getText().equals("CHANEL")){
                    editor.remove("CHANEL");
                    editor.commit();
                }else if(textView.getText().equals("ENVELO")){
                    editor.remove("ENVELO");
                    editor.commit();
                }
                textView1.setText("");
                textView.setText("");
            }
        });
        findViewById(R.id.cancel_button2).setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                imageButton2.setContentDescription("");
                findViewById(R.id.imageButton2).setBackground(null);
                findViewById(R.id.cancel_button2).setBackground(null);
                TextView textView = findViewById(R.id.textView4);
                TextView textView1 = findViewById(R.id.textView5);
                products.remove(2);
                if(textView.getText().equals("SILICUS")){
                    editor.remove("SILICUS");
                    editor.commit();
                }else if (textView.getText().equals("TIMBER")){
                    editor.remove("TIMBER");
                    editor.commit();
                }else if(textView.getText().equals("CHANEL")){
                    editor.remove("CHANEL");
                    editor.commit();
                }else if(textView.getText().equals("ENVELO")){
                    editor.remove("ENVELO");
                    editor.commit();
                }
                textView.setText("");
                textView1.setText("");
            }
        });
        findViewById(R.id.cancel_button3).setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                imageButton3.setContentDescription("");
                findViewById(R.id.imageButton3).setBackground(null);
                findViewById(R.id.cancel_button3).setBackground(null);
                TextView textView = findViewById(R.id.textView6);
                TextView textView1 = findViewById(R.id.textView7);
                products.remove(3);
                if(textView.getText().equals("SILICUS")){
                    editor.remove("SILICUS");
                    editor.commit();
                }else if (textView.getText().equals("TIMBER")){
                    editor.remove("TIMBER");
                    editor.commit();
                }else if(textView.getText().equals("CHANEL")){
                    editor.remove("CHANEL");
                    editor.commit();
                }else if(textView.getText().equals("ENVELO")){
                    editor.remove("ENVELO");
                    editor.commit();
                }
                textView1.setText("");
                textView.setText("");
            }
        });
        findViewById(R.id.imageButton17).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(CartActivity.this,MainActivity1.class);
                startActivity(home);
            }
        });
        findViewById(R.id.btn_checkout).setOnClickListener(new View.OnClickListener() {
            AlertDialog.Builder builder = new AlertDialog.Builder(CartActivity.this);
            @Override
            // 整个onclick 复制
            public void onClick(View view) {

                builder.setTitle("Wanna checkout ?");
                builder.setMessage("Total Price: $" + totalPrice());
                builder.setPositiveButton("check out", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent home = new Intent(CartActivity.this, Payment.class);
                        startActivity(home);
                    }
                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

    }
    public void showProduct(ImageButton imageButton,String product,ImageButton btn_cancel,TextView title,TextView price){

        if (product.equalsIgnoreCase("SILICUS")) {
            imageButton.setBackground(getDrawable(R.drawable.a1601104273));
            title.setText("SILICUS");
            price.setText("Price: $239");
            btn_cancel.setBackground(getDrawable(R.drawable.ic_baseline_close_24));
            imageButton.setContentDescription("added");
        } else if (product.equalsIgnoreCase("CHANEL")) {
            imageButton.setBackground(getDrawable(R.drawable.a1601106616));
            title.setText("CHANEL");
            price.setText("Price: $329");
            btn_cancel.setBackground(getDrawable(R.drawable.ic_baseline_close_24));
            imageButton.setContentDescription("added");
        } else if (product.equalsIgnoreCase("TIMBER")) {
            imageButton.setBackground(getDrawable(R.drawable.a1601106653));
            title.setText("TIMBER");
            price.setText("Price: $1299");
            btn_cancel.setBackground(getDrawable(R.drawable.ic_baseline_close_24));
            imageButton.setContentDescription("added");
        } else if (product.equalsIgnoreCase("ENVELO")) {
            imageButton.setBackground(getDrawable(R.drawable.a1601106758));
            title.setText("ENVELO");
            price.setText("Price: $523");
            btn_cancel.setBackground(getDrawable(R.drawable.ic_baseline_close_24));
            imageButton.setContentDescription("added");
        }
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
                Intent intent = new Intent(CartActivity.this,CartActivity.class);
                startActivity(intent);
            default:
                return super.onOptionsItemSelected(item);
        }

    }
    // 复制 totalPrice() getNumeric() new
    public int totalPrice() {
        int total = 0;
        String price1 = getNumeric(textView1.getText().toString());
        String price2 = getNumeric(textView3.getText().toString());
        String price3 = getNumeric(textView5.getText().toString());
        String price4 = getNumeric(textView7.getText().toString());

        total = Integer.valueOf(price1) + Integer.valueOf(price2) + Integer.valueOf(price3) + Integer.valueOf(price4);
        return total;
    }

    public static String getNumeric(String str) {
        if (!str.isEmpty()) {
            String regEx = "[^0-9]";
            Pattern p = Pattern.compile(regEx);
            Matcher m = p.matcher(str);
            return m.replaceAll("").trim();
        } else {
            return "0";
        }
    }
}
