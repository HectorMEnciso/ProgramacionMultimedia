package com.example.p33_2;

import java.io.BufferedReader;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {
	String[] titulo = new String[10];
	String linea;
	int i = 0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		try {
			BufferedReader fileIn = new BufferedReader(new FileReader("/data/canciones.txt"));
			while ((linea = fileIn.readLine()) != null) {
				titulo[i] = fileIn.readLine();
				ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, titulo);// Creamos adaptador
				ListView lstOpciones = (ListView) findViewById(R.id.LstOpciones);
				lstOpciones.setAdapter(adaptador);// Asignamos al control LstOpciones
				i++;
				linea = fileIn.readLine();
			}
			fileIn.close();
		} catch (FileNotFoundException e) {
			Toast.makeText(getBaseContext(), "Fichero no encontrado",Toast.LENGTH_LONG).show();
		} catch (IOException e) {
			Toast.makeText(getBaseContext(), "Error E/S", Toast.LENGTH_LONG).show();
		}
	}

}
