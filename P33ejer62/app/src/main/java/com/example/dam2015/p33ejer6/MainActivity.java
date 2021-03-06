package com.example.dam2015.p33ejer6;

import android.os.Bundle;
import android.app.Activity;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.content.Intent;
import android.widget.Toast;

public class MainActivity extends Activity {
    private TextView lblTitulo;
    private TextView lblAutor;
    private TextView lblDuracion;
    private ListView LstOpciones;
    adaptadorCanciones adaptador;
    private Cancion[] datos = new Cancion[]{
            new Cancion(R.drawable.rihanna,"Título 1", "autor1", "3:20"),
            new Cancion(R.drawable.rihanna,"Título 2", "autor2", "4:30"),
            new Cancion(R.drawable.rihanna,"Título 3", "autor3", "3:45"),
            new Cancion(R.drawable.rihanna,"Título 4", "autor4", "2:59"),
            new Cancion(R.drawable.rihanna,"Título 5", "autor5", "3:50")};

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         adaptador = new adaptadorCanciones(this,datos);

       // lblTitulo = (TextView) findViewById(R.id.lblTitulo);
      //  lblAutor = (TextView) findViewById(R.id.lblAutor);
     //   lblDuracion = (TextView) findViewById(R.id.lblDuracion);
        LstOpciones= (ListView) findViewById(R.id.LstOpciones);
        LstOpciones.setAdapter(adaptador);
        registerForContextMenu(LstOpciones);
    }
    //Generacion del menu a partir del menu_main.xml
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,ContextMenu.ContextMenuInfo menuInfo){
        super.onCreateContextMenu(menu, v, menuInfo);

        MenuInflater inflater = getMenuInflater();


        if(v.getId() == R.id.LstOpciones){
            AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo)menuInfo;

            menu.setHeaderTitle(LstOpciones.getAdapter().getItem(info.position).toString());

            inflater.inflate(R.menu.opciones_elementos, menu);
        }
    }


    @Override
    public boolean onContextItemSelected(MenuItem item) {

        AdapterView.AdapterContextMenuInfo info =(AdapterView.AdapterContextMenuInfo) item.getMenuInfo();

        switch (item.getItemId()) {
            case R.id.EliminarSeleccionada:

                return true;
            default:
                return super.onContextItemSelected(item);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.AnadirCancion:

                return true;
            case R.id.BorrarTodas:

                adaptador.clear();
                LstOpciones.notifyAll();
                adaptador.notifyDataSetChanged();
                return true;
            case R.id.GuardarFichero:

                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    public void onClick(View v){
    Intent i=new Intent(this,AnadirCancion.class);
        startActivityForResult(i,1);
    }


    public void onActivityResult(int requestCode,int resultCode, Intent data){
    if(requestCode==1){
        if(resultCode==RESULT_OK){
            Bundle bundle=data.getExtras();
            Toast.makeText(this,bundle.getString("titulo"), Toast.LENGTH_SHORT).show();
            Toast.makeText(this,bundle.getString("autor"), Toast.LENGTH_SHORT).show();
            Toast.makeText(this,bundle.getString("duracion"), Toast.LENGTH_SHORT).show();
        }
    }
    }
}