package com.example.arfurniture;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class Payment extends AppCompatActivity implements View.OnClickListener {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);


    }



    @Override
    public void onClick(View view) {
        EditText ed_1 = findViewById(R.id.edit_email2);
        EditText ed_2 = findViewById(R.id.edit_email5);
        EditText ed_3 = findViewById(R.id.edit_email6);
        EditText ed_4 = findViewById(R.id.edit_email4);
        if(view.getId() == R.id.button5){
            if(ed_1.getText().toString().isEmpty()){
                Toast.makeText(this,"Please enter a email",Toast.LENGTH_LONG).show();

            }else if(ed_2.getText().toString().isEmpty()){
                Toast.makeText(this,"Please enter a postcode",Toast.LENGTH_LONG).show();

            }else if(ed_3.getText().toString().isEmpty()){
                Toast.makeText(this,"Please enter a address",Toast.LENGTH_LONG).show();

            }else if(ed_4.getText().toString().isEmpty()){
                Toast.makeText(this,"Please enter a phone number",Toast.LENGTH_LONG).show();

            }else{
                AlertDialog.Builder builder = new AlertDialog.Builder(Payment.this);
                builder.setTitle("Successful");
                builder.setMessage("Thank you for purchasing ");
                builder.setPositiveButton("Keep Shopping", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent home = new Intent(Payment.this, MainActivity1.class);
                        startActivity(home);
                    }
                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        }else if(view.getId() == R.id.imageButton18){
            Intent home = new Intent(Payment.this, CartActivity.class);
            startActivity(home);
        }
    }
}
