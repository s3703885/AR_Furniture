package com.example.arfurniture;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText et_account;
    private EditText et_password;
    private CheckBox ck_term;
    private String account;
    private SharedPreferences shared;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       findViewById(R.id.sign_up);
        findViewById(R.id.btn_exit);
        et_account = findViewById(R.id.edit_account);
        et_password = findViewById(R.id.edit_password);
        ck_term = findViewById(R.id.term_checkBox);
        findViewById(R.id.btn_login);
        shared = getSharedPreferences("share",MODE_PRIVATE);
        account = shared.getString("name","");
    }
    @Override
    public void onClick(View view) {
//        if(view.getId() == R.id.btn_login){
//            if(!ck_term.isChecked()){
//                Toast.makeText(this,"Please agree the terms and condition",Toast.LENGTH_SHORT).show();
//            }else if(ck_term.isChecked()){
//                if(shared.getAll().containsValue(et_account.getText().toString()) && shared.getAll().containsValue(et_password.getText().toString())){
//                    Toast.makeText(this,"login Successful",Toast.LENGTH_SHORT).show();
                    Intent homepage = new Intent(this,MainActivity1.class);
                    startActivity(homepage);
//                }else{
//
//                    Toast.makeText(this,"Invalid Password/Email",Toast.LENGTH_SHORT).show();
//                }
//            }
//        }
//        if(view.getId() == R.id.sign_up){
//            Intent sign_up_intent = new Intent(this,SignUpActivity.class);
//            startActivity(sign_up_intent);
//        }else if(view.getId() == R.id.btn_exit){
//            Intent exit = new Intent(this,SignUpActivity.class);
//            startActivity(exit);
//        }
    }


}