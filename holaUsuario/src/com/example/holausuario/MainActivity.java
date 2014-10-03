package com.example.holausuario;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends ActionBarActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        //Obtenemos una referencia a los controles de la interfaz
        final EditText txtNombre = (EditText)findViewById(R.id.TxtNombre);
        final Button btnHola = (Button)findViewById(R.id.BtnHola);
      
        //Implementamos el evento “click” del botón
        btnHola.setOnClickListener(new OnClickListener() {
             @Override
             public void onClick(View v) {
                  //Creamos el Intent
                  Intent intent = new Intent(MainActivity.this, FrmSaludo.class);
 
                  //Creamos la información a pasar entre actividades
                  Bundle b = new Bundle();
                  b.putString("NOMBRE", txtNombre.getText().toString());
 
                  //Añadimos la información al intent
                  intent.putExtras(b);
 
                  if(!txtNombre.getText().toString().equals("")){

                  //Iniciamos la nueva actividad
                  startActivity(intent);
                 
                  }
                  else{
                	   Toast t = Toast.makeText(MainActivity.this, "Introduce tu nombre", Toast.LENGTH_SHORT);
                	   t.show();
                  }
             }
        });
 }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
