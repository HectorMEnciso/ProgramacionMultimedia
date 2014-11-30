/*
Vincular actividades con intents
Ejercicio pagina 81 libro android 4
*/
package com.hueso.c2intent1;

import com.hueso.c21intent1.R;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class UsingIntentActivity extends Activity {
    
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    
    public void onClick(View view) {
      //  startActivity(new Intent(this, SecondActivity.class));
        Intent intent=new Intent(this,SecondActivity.class);
        startActivity(intent);
    }
    

}