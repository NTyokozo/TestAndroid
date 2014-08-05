package com.example.myApp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by nobubele on 2014/08/01.
 */
public class Special extends Activity implements View.OnClickListener{
    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.special);

        Button btnBack;

        btnBack = (Button)findViewById(R.id.back);

        btnBack.setOnClickListener(this) ;



    }
    public void onClick(View view) {

        if (view.getId()==R.id.back) {

            Intent intent = new Intent(view.getContext(), Login.class);
            startActivity(intent);
        }
    }

}
