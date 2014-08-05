package com.example.myApp;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

/**
 * Created by nobubele on 2014/07/31.
 */
public class Login extends Activity implements  View.OnClickListener{

    AlertDialog dialog;
    Button btnSave;
    Button btnClear;
    EditText txtUserName;
    EditText txtPassword;


    @Override
    public void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.hello_world);

        txtUserName = (EditText) findViewById(R.id.editText);
        txtPassword = (EditText) findViewById(R.id.editText2);


        btnSave = (Button) findViewById(R.id.button);
        btnSave.setOnClickListener(this);

        btnClear = (Button) findViewById(R.id.button2);
        btnClear.setOnClickListener(this);


    }

    public void onClick(View view)

    {



        EditText txtUserName = (EditText) findViewById(R.id.editText);
        EditText txtPassword = (EditText) findViewById(R.id.editText2);
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_LONG;

        if (view.getId() == R.id.button) {

            if (txtUserName.getText().toString().equalsIgnoreCase("Nobu") || (txtPassword.getText().toString().equalsIgnoreCase("1234"))) {
                Toast.makeText(context, txtUserName.getText().toString() + txtPassword.getText().toString(), duration).show();

                Intent intent = new Intent(this, Menu.class);
                startActivity(intent);

            }
            else if (txtPassword.length() == 0 || txtUserName.length() == 0) {
                Toast.makeText(context, "Sorry !! atleast One Should be Correct", duration).show();
                txtUserName.getText().clear();
                txtPassword.getText().clear();

            }
            else if (!txtUserName.getText().toString().equalsIgnoreCase("Nobu") && (!txtPassword.getText().toString().equalsIgnoreCase("1234"))) {
                Toast.makeText(context, "Only Nobu can use the App", duration).show();
                txtUserName.getText().clear();
                txtPassword.getText().clear();
            }
        } else if (view.getId() == R.id.button2) {
            txtUserName.getText().clear();
            txtPassword.getText().clear();
        }

    }

}