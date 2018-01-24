package com.example.android.miwok;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class User extends AppCompatActivity implements View.OnClickListener{

    private Button buttonRegister;
    private EditText editTextEmail;
    private EditText editTextPassword;
    private TextView textViewSignin;

    private ProgressDialog progressDialog;

    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        firebaseAuth = FirebaseAuth.getInstance();

        //if(firebaseAuth.getCurrentUser() !=null){
           // finish();
            //startActivity(new Intent(getApplicationContext(),MainActivity.class));
        //}

        progressDialog = new ProgressDialog(this);
    buttonRegister = (Button) findViewById(R.id.buttonRegister);
    editTextEmail = (EditText) findViewById(R.id.editTextEmail);
    editTextPassword = (EditText) findViewById(R.id.editTextPassword);
    textViewSignin = (TextView) findViewById(R.id.textViewSignin);

    buttonRegister.setOnClickListener(this);
    textViewSignin.setOnClickListener(this);


    }

    private void registerUser(){

        String email = editTextEmail.getText().toString().trim();
        String password = editTextPassword.getText().toString().trim();

        if(TextUtils.isEmpty(email)){
            //email is empty
            Toast.makeText(this,"Please enter your EMAIL", Toast.LENGTH_SHORT).show();
            //stopping the function executing furhter
            return;
        }
        if(TextUtils.isEmpty(password)){

            //password is empty
            Toast.makeText(this,"Please enter PASSWORD", Toast.LENGTH_SHORT).show();
            //stopping the function executing furhter
            return;
        }
        //if validation correct
        //first we will show progress bar
        progressDialog.setMessage("Registering User...Please Wait");
        progressDialog.show();

        firebaseAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    //user is successfully registered and logged in
                    Toast.makeText(User.this,"Registered Successfully", Toast.LENGTH_SHORT).show();
                    finish();
                    Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(User.this,"Registration Failed", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    public void onClick(View view) {
        if(view == buttonRegister)
        {
            registerUser();
        }
        if(view == textViewSignin)
        {
            //will open login activity
            finish();
            startActivity(new Intent(getApplicationContext(),LoginActivity.class));

        }

    }
}
