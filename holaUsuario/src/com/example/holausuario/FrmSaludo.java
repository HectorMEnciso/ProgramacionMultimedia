package com.example.holausuario;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
 
public class FrmSaludo extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saludo);
 
        //Localizar los controles
             TextView txtSaludo = (TextView)findViewById(R.id.TxtSaludo);
             Button BtnVolver = (Button)findViewById(R.id.BtnVolver);
             //Recuperamos la información pasada en el intent
             Bundle bundle = this.getIntent().getExtras();
 
             //Construimos el mensaje a mostrar
             txtSaludo.setText("Hola " + bundle.getString("NOMBRE"));
             

           //Implementamos el evento “click” del botón
             BtnVolver.setOnClickListener(new OnClickListener() {
                  @Override
                  public void onClick(View v) {
                       //Creamos el Intent
                       Intent intent = new Intent(FrmSaludo.this, MainActivity.class);
      
                       //Iniciamos la nueva actividad
                       startActivity(intent);
                  }
             });
             
             
             
             
             
             
             
             
             
             
             
    }
}