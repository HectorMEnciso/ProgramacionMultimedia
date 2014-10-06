package com.example.usingintent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ThirdActivity extends Activity {
	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.thirdactivity);
	      //Obtenemos una referencia a los controles de la interfaz
	        TextView txtSaludo = (TextView)findViewById(R.id.TxtSaludo);
	        Button btnVolver = (Button)findViewById(R.id.btnVolver);
	      //Implementamos el evento �click� del bot�n
	        btnVolver.setOnClickListener(new OnClickListener() {
	             @Override
	             public void onClick(View v) {
	                  //Creamos el Intent
	                  Intent intent = new Intent(ThirdActivity.this, MainActivity.class);
	                  startActivity(intent);
	             }
	        });
	        
	        
	    }
}