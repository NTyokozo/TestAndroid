package com.example.myApp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by nobubele on 2014/08/01.
 */
public class About_Me extends Activity implements View.OnClickListener {
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_me);

        Button btnBack;

        btnBack = (Button) findViewById(R.id.back1);
        btnBack.setOnClickListener(this);

    }

    public void onClick(View view)
    {
        if(view.getId()==R.id.back1)
        {
            Intent intent = new Intent(view.getContext(), Menu.class);
            startActivity(intent);
        }
    }

}