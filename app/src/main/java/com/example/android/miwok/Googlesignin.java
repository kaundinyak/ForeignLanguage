package com.example.android.miwok;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;

import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.SignInButton;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.GoogleAuthProvider;

public class Googlesignin extends AppCompatActivity {

    SignInButton button;
    FirebaseAuth mAuth;
    private static final int RC_SIGN_IN = 2;
    GoogleApiClient mGoogleApiClient;
    FirebaseAuth.AuthStateListener mAuthListener;

    private static final int REQUEST_ACCESS_FINE_LOCATION = 2;

    @Override
    protected void onStart() {
        super.onStart();

        mAuth.addAuthStateListener(mAuthListener);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);


        setContentView(R.layout.activity_googlesignin);
        getSupportActionBar().hide();

        button = (SignInButton) findViewById(R.id.googleBtn);
        mAuth = FirebaseAuth.getInstance();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signIn();
            }
        });

        mAuthListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                if (firebaseAuth.getCurrentUser() != null) {
                    startActivity(new Intent(Googlesignin.this, NavigationDrawer.class));
                }
            }
        };

        boolean hasPermissionLocation = (ContextCompat.checkSelfPermission(getApplicationContext(),

                android.Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED);

        if (!hasPermissionLocation) {

            ActivityCompat.requestPermissions(Googlesignin.this,

                    new String[]{android.Manifest.permission.WRITE_EXTERNAL_STORAGE},

                    REQUEST_ACCESS_FINE_LOCATION);

        }


        // Configure sign-in to request the user's ID, email address, and basic
        // profile. ID and basic profile are included in DEFAULT_SIGN_IN.
        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestIdToken(getString(R.string.default_web_client_id))
                .requestEmail()
                .build();

        mGoogleApiClient = new GoogleApiClient.Builder(this)
                .enableAutoManage(this, new GoogleApiClient.OnConnectionFailedListener() {
                    @Override
                    public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
                        Toast.makeText(Googlesignin.this, "Something went Wrong", Toast.LENGTH_SHORT).show();
                    }
                })
                .addApi(Auth.GOOGLE_SIGN_IN_API, gso)
                .build();
    }


    @Override

    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {

        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        switch (requestCode)

        {


            case REQUEST_ACCESS_FINE_LOCATION:

            {

                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED)

                {

                    Toast.makeText(Googlesignin.this, "Permission granted.", Toast.LENGTH_SHORT).show();


                    //reload my activity with permission granted

                    finish();

                    startActivity(getIntent());


                } else

                {

                    Toast.makeText(Googlesignin.this, "The app was not allowed to get your location. Hence, it cannot function properly. Please consider granting it this permission", Toast.LENGTH_LONG).show();

                }

            }

            //GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
            // .requestIdToken(getString(R.string.default_web_client_id))
            // .requestEmail()
            //  .build();
        }
    }
            private void signIn () {
                Intent signInIntent = Auth.GoogleSignInApi.getSignInIntent(mGoogleApiClient);
                startActivityForResult(signInIntent, RC_SIGN_IN);
            }


            @Override
            public void onActivityResult ( int requestCode, int resultCode, Intent data){
                super.onActivityResult(requestCode, resultCode, data);

                // Result returned from launching the Intent from GoogleSignInApi.getSignInIntent(...);
                if (requestCode == RC_SIGN_IN) {
                    GoogleSignInResult result = Auth.GoogleSignInApi.getSignInResultFromIntent(data);
                    if (result.isSuccess()) {
                        GoogleSignInAccount account = result.getSignInAccount();
                        firebaseAuthWithGoogle(account);
                    } else {
                        //Google sign in Failed... Update UI appropriately
                        //...
                        Toast.makeText(Googlesignin.this, "Authentication Failed", Toast.LENGTH_SHORT).show();

                    }
                }
            }

            private void firebaseAuthWithGoogle (GoogleSignInAccount account){
                AuthCredential credential = GoogleAuthProvider.getCredential(account.getIdToken(), null);
                mAuth.signInWithCredential(credential)
                        .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {
                                    // Sign in success, update UI with the signed-in user's information
                                    Log.d("TAG", "signInWithCredential:success");
                                    FirebaseUser user = mAuth.getCurrentUser();
                                    //updateUI(user);
                                } else {
                                    // If sign in fails, display a message to the user.
                                    Log.w("TAG", "signInWithCredential:failure", task.getException());
                                    Toast.makeText(Googlesignin.this, "Authentication Failed.", Toast.LENGTH_SHORT).show();
                                    //Snackbar.make(findViewById(R.id.Googlesignin.this), "Authentication Failed.", Snackbar.LENGTH_SHORT).show();
                                    //updateUI(null);
                                }

                                // ...
                            }
                        });


            }


        }
