 package com.project.explore_maharashtra;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class LoginActivity extends AppCompatActivity {
    TextView btn,forgot;
    Button btnLogin;
    EditText inputEmail,inputPassword;
    private FirebaseAuth mAuth;
    ProgressDialog mLoadingBar;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);



        forgot=findViewById(R.id.forgotPassword);
        forgot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(LoginActivity.this,ForegtPassword.class);
                startActivity(intent);
            }
        });


        btn=findViewById(R.id.textViewSignUp);
        inputEmail=findViewById(R.id.inputEmail);
        inputPassword=findViewById(R.id.inputPassword);
        btnLogin=findViewById(R.id.btnlogin);
        mAuth=FirebaseAuth.getInstance();
        mLoadingBar=new ProgressDialog(LoginActivity.this);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(intent);
            }
        });
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkCredential();
            }
            private void checkCredential() {
                String email=inputEmail.getText().toString();
                String password=inputPassword.getText().toString();

                if (email.isEmpty() || !email.contains("@"))
                {
                    showError(inputEmail,"Email is not valid");
                }
                else  if (password.isEmpty() || password.length()<7)
                {
                    showError(inputPassword,"Password must be 7 character");
                }
                else
                {
                    mLoadingBar.setTitle("Login");
                    mLoadingBar.setMessage("Please wait, while check your credentials");
                    mLoadingBar.setCanceledOnTouchOutside(false);
                    mLoadingBar.show();

                    mAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful())
                            {
                                Toast.makeText(LoginActivity.this,"Login Successful", Toast.LENGTH_SHORT).show();
                                mLoadingBar.dismiss();
                                Intent intent=new Intent(LoginActivity.this,SplashScreen.class);
                                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                                startActivity(intent);


                            }
                            else
                            {
                                Toast.makeText(LoginActivity.this,task.getException().toString(), Toast.LENGTH_SHORT).show();
                            }

                        }
                    });


                }
            }

            private void showError(EditText input, String s) {
                input.setError(s);
                input.requestFocus();
            }
        });


    }
}
