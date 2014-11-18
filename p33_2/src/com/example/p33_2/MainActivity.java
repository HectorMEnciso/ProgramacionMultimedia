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
	String[] titulo=new String[10];
	
	int i=0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		//Toast.makeText(getBaseContext(), "llego aqui", Toast.LENGTH_SHORT);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		try {
			// open the file for reading
			InputStream instream = new FileInputStream("/data/canciones.txt");
			
			// if file the available for reading
			if (instream != null) {// prepare the file for reading
				InputStreamReader inputreader = new InputStreamReader(instream);
				BufferedReader buffreader = new BufferedReader(inputreader);

				do {
					titulo[i] = buffreader.readLine();
					ArrayAdapter<String> adaptador= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,titulo[i]);
					ListView LstOpciones = (ListView)findViewById(R.id.LstOpciones);
					LstOpciones.setAdapter(adaptador);
					Toast.makeText(getBaseContext(), titulo[i], Toast.LENGTH_SHORT);
					i++;
					// do something with the line
				} while (titulo != null);
				
			}
		} catch (Exception ex) {// print stack trace.
			System.out.println("error: "+ex);
		} 
		
		
	}
}
