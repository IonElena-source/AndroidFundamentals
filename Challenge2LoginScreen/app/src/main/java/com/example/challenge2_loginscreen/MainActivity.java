package com.example.challenge2_loginscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnSubmit=findViewById(R.id.SubmitButton);
        TextView tv=findViewById(R.id.tvInput);
        CheckBox checkBox=findViewById(R.id.cb);
   
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText etEmail=findViewById(R.id.etEmail);
                EditText etPhone=findViewById(R.id.etPhone);
                String email=etEmail.getText().toString().trim();
                String phone=etPhone.getText().toString();
                String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
                if(etEmail.getText()==null || email.isEmpty())
                {
                    etEmail.setError("Fill the input");
                }
                if(etPhone.getText()==null || phone.isEmpty())
                {
                    etPhone.setError("Fill the input");
                }
                if(!email.matches(emailPattern))
                {
                    etEmail.setError("Fill the input  with a valid email adress");
                }
                Boolean cb;
                if(checkBox.isChecked())
                {
                    cb=true;
                }
                else
                {
                    cb=false;
                }
                
                tv.setText("Input email:"+email+"\nInputPhone: "+phone+"\nInput CheckBox "+cb.toString());
            }
        });
    }
}
