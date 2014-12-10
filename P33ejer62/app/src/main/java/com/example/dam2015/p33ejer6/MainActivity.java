package com.example.dam2015.p33ejer6;

import android.os.Bundle;
import android.app.Activity;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends Activity {

    private TextView lblTitulo;
    private TextView lblAutor;
    private TextView lblDuracion;
    private ListView LstOpciones;

    private Cancion[] datos = new Cancion[]{
            new Cancion("Título 1", "autor1", "3:20"),
            new Cancion("Título 2", "autor2", "4:30"),
            new Cancion("Título 3", "autor3", "3:45"),
            new Cancion("Título 4", "autor4", "2:59"),
            new Cancion("Título 5", "autor5", "3:50")};

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adaptadorCanciones adaptador = new adaptadorCanciones(this,datos);

       // lblTitulo = (TextView) findViewById(R.id.lblTitulo);
      //  lblAutor = (TextView) findViewById(R.id.lblAutor);
     //   lblDuracion = (TextView) findViewById(R.id.lblDuracion);
        LstOpciones= (ListView) findViewById(R.id.LstOpciones);
        LstOpciones.setAdapter(adaptador);
    }
}