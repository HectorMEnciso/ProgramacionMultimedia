package com.example.dam2015.p33ejer6;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
public class adaptadorCanciones extends ArrayAdapter<Cancion> {
    Activity context;
    Cancion[] ca;
    adaptadorCanciones(Activity context,Cancion[] c){
        super(context, R.layout.activity_main,c);
        this.context=context;
        this.ca=c;
    }


    public View getView(int position, View convertView, ViewGroup parent)
    {
        LayoutInflater inflater = context.getLayoutInflater();
        View item = inflater.inflate(R.layout.activity_main, null);

       // ImageView imagen = (ImageView)item.findViewById(R.id.foto);
       // imagen.setImageResource(ca[position].getIdentificador());

        TextView titulo = (TextView)item.findViewById(R.id.lblTitulo);
        titulo.setText(ca[position].getTitulo());
        TextView autor =(TextView)item.findViewById(R.id.lblAutor);
        autor.setText(ca[position].getAutor());
        TextView duracion =(TextView)item.findViewById(R.id.lblDuracion);
        duracion.setText(ca[position].getDuracion());
        return(item);
    }
}