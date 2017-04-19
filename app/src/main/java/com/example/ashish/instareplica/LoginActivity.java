package com.example.ashish.instareplica;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends Activity implements View.OnClickListener {

    Button btnLogin, btnSignUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnLogin = (Button) findViewById(R.id.btn_login);
        btnSignUp = (Button) findViewById(R.id.btn_signup);
        btnLogin.setOnClickListener(this);
        btnSignUp.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.btn_login:
                Toast.makeText(this, "Login", Toast.LENGTH_SHORT).show();
                Intent mainactivity = new Intent(LoginActivity.this,HomeActivity.class);
                mainactivity.putExtra("Username",((EditText)findViewById(R.id.editText)).getText().toString());
                startActivity(mainactivity);
                break;
            case R.id.btn_signup:
                Toast.makeText(this, "SignUp", Toast.LENGTH_SHORT).show();
                break;
            default:
                Toast.makeText(this, "NoView", Toast.LENGTH_SHORT).show();

        }
    }
}
