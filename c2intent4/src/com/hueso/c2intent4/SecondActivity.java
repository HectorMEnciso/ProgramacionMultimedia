package com.hueso.c2intent4;


import com.hueso.c21intent4.R;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SecondActivity extends Activity{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondactivity);
        
    //Obtener datos usando getStringExtra
    Toast.makeText(this,getIntent().getStringExtra("str1"),Toast.LENGTH_SHORT).show();
    
    //obtener datos usando getIntExtra
    Toast.makeText(this,Integer.toString(getIntent().getIntExtra("age1",0)), Toast.LENGTH_SHORT).show();

    //Obtener objeto bundle 
    Bundle bundle=getIntent().getExtras();
    
    //obtener datos usando getString
    Toast.makeText(this,bundle.getString("str2"), Toast.LENGTH_SHORT).show();
    //obtener datos usando getInt
    Toast.makeText(this,Integer.toString(bundle.getInt("age2")), Toast.LENGTH_SHORT).show();
    Toast.makeText(this,Float.toString(bundle.getFloat("altura")), Toast.LENGTH_SHORT).show();
    
    }
    
    public void onClick(View view) {
        Intent i = new Intent();

        i.putExtra("age3", 45);
        
        i.setData(Uri.parse("something passed back to main activity"));
        
        setResult(RESULT_OK,i);
        
        //---closes the activity---
        finish();
    }
}
