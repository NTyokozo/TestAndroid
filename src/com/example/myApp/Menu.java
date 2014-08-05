package com.example.myApp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.*;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Toast;
import android.app.ActionBar;

/**
 * Created by nobubele on 2014/08/01.
 */
public class Menu extends Activity implements View.OnClickListener{

    Button btnAbout ;
    Button btnSpecial;
    Button btnLogOut;
    int duration = Toast.LENGTH_LONG;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        btnAbout = (Button)findViewById(R.id.about);
        btnSpecial = (Button)findViewById(R.id.back);


        btnAbout.setOnClickListener(this);

        ActionCallBack callBack;
        btnSpecial.setOnClickListener(this);



    }

    @Override
    public void onClick (View view) { //Toast.makeText(getApplicationContext(),"HERE",Toast.LENGTH_LONG).show();
        if (view.getId() == R.id.about) {

            Intent intent = new Intent(getApplicationContext(), About_Me.class);
            startActivity(intent);
        } else if (view.getId() == R.id.back) {
            Intent intent = new Intent(this, Special.class);
            startActivity(intent);
        } else if (view.getId() == R.id.logout)
        {
            Intent intent = new Intent(this, Menu.class);
            startActivity(intent);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(android.view.Menu menu)
    {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.action_bar_activity, menu);
        return super.onCreateOptionsMenu((android.view.Menu) menu);
    }

    @Override
    public  boolean onOptionsItemSelected(MenuItem item)
    {
        AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
        switch (item.getItemId()) {
            case R.id.action_search:

                Intent intent = new Intent(getApplicationContext(), About_Me.class);
                startActivity(intent);
                return true;

            case R.id.action_login :
                Intent intent1 = new Intent(this, Special.class);
                startActivity(intent1);
                return true ;
            default:
                return  super.onOptionsItemSelected(item);


        }
       // return true;
    }

    public void onCreateContextMenu(ContextMenu menu , View v , ContextMenu.ContextMenuInfo menuInfo)
    {
        super.onCreateContextMenu( menu , v , menuInfo);
        MenuInflater inflater= getMenuInflater();
        inflater.inflate(R.menu.action_bar_activity , menu);

    }

 }
