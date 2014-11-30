/*
Pasar datos con intents
Ejercicio pagina 92 libro android 4
*/
package com.hueso.c2intent4;

import com.hueso.c21intent4.R;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class PassingDataActivity extends Activity {
    int request_Code = 1;
    
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    
    public void onClick(View view) {
        
       Intent i = new Intent("com.hueso.c21intent4.PassingDataSecondActivity");
	    //startActivity(intent);
       i.putExtra("str1", "this is a string");
       i.putExtra("age1", 25);
       
       //usar bundle
       Bundle extras=new Bundle();
       
       
       extras.putString("str2","this is another string");
       extras.putInt("age2", 35);
       extras.putFloat("altura", (float) 180.0);
       i.putExtras(extras);
       
       startActivityForResult(i,request_Code);
    }
    public void onActivityResult(int requestCode,int resultCode, Intent data){
        if (requestCode == request_Code) {
            Toast.makeText(this,Integer.toString(data.getIntExtra("age3",0)),Toast.LENGTH_SHORT).show();
            if (resultCode == RESULT_OK) {
            Toast.makeText(this,data.getData().toString(),Toast.LENGTH_SHORT).show();
            }
        }

    }
}