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

public class RegisterActivity extends AppCompatActivity {
    TextView btn;
    private EditText inputUsername,inputPassword,inputEmail,inputConformPaasword;
    Button btnRegister;
    private FirebaseAuth mAuth;
    private ProgressDialog mLoadingBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        btn=findViewById(R.id.alreadyHaveAccount);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(RegisterActivity.this,LoginActivity.class);
                startActivity(intent);
            }
        });
        inputUsername=findViewById(R.id.inputUsername);
        inputEmail=findViewById(R.id.inputEmail);
        inputPassword=findViewById(R.id.inputPassword);
        inputConformPaasword=findViewById(R.id.inputConformPassword);
        mAuth=FirebaseAuth.getInstance();
        mLoadingBar=new ProgressDialog(RegisterActivity.this);

        btnRegister=findViewById(R.id.btnRegister);
        btnRegister.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                checkCredentials();
            }

            private void checkCredentials() {
                String username = inputUsername.getText().toString();
                String email = inputEmail.getText().toString();
                String password = inputPassword.getText().toString();
                String conformPassword = inputConformPaasword.getText().toString();

                if (username.isEmpty() || username.length() < 7) {
                    showError(inputUsername, "Your Username is not valid!");
                }
                else if(email.isEmpty() || !email.contains("@"))
                {
                    showError(inputEmail,"Email is not valid");
                }
                else if (password.isEmpty() || password.length()<7)
                {
                    showError(inputPassword,"Password must be 7 character");
                }
                else if ((conformPassword.isEmpty() || !conformPassword.equals(password)))
                {
                    showError(inputConformPaasword,"Password not match!");
                }
                else
                {
                    mLoadingBar.setTitle("Registration");
                    mLoadingBar.setMessage("Please wait, while check your credentials");
                    mLoadingBar.setCanceledOnTouchOutside(false);
                    mLoadingBar.show();

                    mAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful())
                            {
                                Toast.makeText(RegisterActivity.this,"Successful Registration", Toast.LENGTH_SHORT).show();
                                Intent intent=new Intent(RegisterActivity.this,LoginActivity.class);
                              intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                              startActivity(intent);

                            }
                            else
                            {
                                Toast.makeText(RegisterActivity.this,task.getException().toString(), Toast.LENGTH_SHORT).show();
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
