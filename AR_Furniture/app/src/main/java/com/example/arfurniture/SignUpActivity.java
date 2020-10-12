package com.example.arfurniture;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.util.regex.Pattern;

public class SignUpActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText et_email, et_phone, et_password,et_code;
    private SharedPreferences.Editor editor;
    private SharedPreferences shared;
    private Intent login;
    private AlertDialog.Builder builder;
    private CheckBox ck_accept;

    public SignUpActivity() {
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        findViewById(R.id.btn_return);
        et_email = findViewById(R.id.edit_email);
        et_phone = findViewById(R.id.edit_phone);
        et_password = findViewById(R.id.edit_password);
        et_code = findViewById(R.id.edit_code);
        ck_accept = findViewById(R.id.check_accept);
        shared = getSharedPreferences("share",MODE_PRIVATE);
        login = new Intent(this, MainActivity.class);
        builder = new AlertDialog.Builder(this);
        editor = shared.edit();
    }
    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.btn_return){
            startActivity(login);
        }else if(view.getId() == R.id.btn_send){
            if(!isEmailRegex(et_email.getText().toString())){
                Toast.makeText(this,"Please enter a correct email",Toast.LENGTH_LONG).show();
            }else if(et_phone.getText().toString().isEmpty()){
                Toast.makeText(this,"Please enter a phone number",Toast.LENGTH_LONG).show();
            }else if(shared.getAll().containsValue(et_email.getText().toString())) {
                builder.setTitle("Email Already existed");
                builder.setMessage("Want to login ?");
                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        startActivity(login);
                    }
                });
                builder.setNegativeButton("Try again",null);
                AlertDialog alert = builder.create();
                alert.show();
            }else{
                sendCode();
            }
        } else if(view.getId() == R.id.btn_sign_up){
            if(!isEmailRegex(et_email.getText().toString())){
                Toast.makeText(this,"Please enter a correct email",Toast.LENGTH_LONG).show();
            }else if(et_phone.getText().toString().isEmpty()) {
                Toast.makeText(this, "Please enter a phone number", Toast.LENGTH_LONG).show();
            }else if(et_password.getText().toString().isEmpty()){
                Toast.makeText(this,"Please enter password",Toast.LENGTH_LONG).show();
            }else if(et_code.getText().toString().isEmpty()){
                Toast.makeText(this,"Please enter verification code",Toast.LENGTH_LONG).show();
            }else if(!ck_accept.isChecked()){
                Toast.makeText(this,"Please agree the terms and condition",Toast.LENGTH_SHORT).show();
            }else{
                editor.putString("email",et_email.getText().toString());
                editor.putString("password",et_password.getText().toString());
                editor.commit();
                Toast.makeText(this,"Welcome " + et_email.getText().toString(),Toast.LENGTH_SHORT).show();
                startActivity(login);
            }
        }
    }
    public void sendCode(){
        builder.setTitle("Verification code");
        builder.setMessage("Phone Number " + et_phone.getText().toString() + " Verification code is 6273");
        builder.setPositiveButton("Ok",null);
        AlertDialog alert = builder.create();
        alert.show();
    }
    private boolean isEmailRegex(String email){
        String emailPattern ="[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_-]+)+$";
        return Pattern.matches(emailPattern,email);
    }
}
