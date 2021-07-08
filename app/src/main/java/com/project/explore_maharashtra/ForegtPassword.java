package com.project.explore_maharashtra;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

import org.jetbrains.annotations.NotNull;

import java.util.regex.Pattern;

public class ForegtPassword extends AppCompatActivity {
    private EditText emailEditText;
    private Button resetPasswordButton;
    FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foregt_password);

        emailEditText=(EditText) findViewById(R.id.email);
        resetPasswordButton=(Button)findViewById(R.id.resetpassword);
        auth=FirebaseAuth.getInstance();


        resetPasswordButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetPassword();
            }
        });
    }
    private  void resetPassword(){
        String email= emailEditText.getText().toString().trim();
        if (email.isEmpty()){
            emailEditText.setError("Email is required!");
            emailEditText.requestFocus();
            return;
        }
        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            emailEditText.setError("Please provide Valid Email!");
            emailEditText.requestFocus();
            return;
        }
        auth.sendPasswordResetEmail(email).addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull @NotNull Task<Void> task) {
                if (task.isSuccessful()){
                    Toast.makeText(ForegtPassword.this,"Check email to reset your password!",Toast.LENGTH_LONG).show();

                }else
                {
                    Toast.makeText(ForegtPassword.this,"Try again ! Something went wrong",Toast.LENGTH_LONG).show();
                }
            }
        });
    }

}