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
		Toast.makeText(getBaseContext(), titulo[i], Toast.LENGTH_SHORT).show();
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		try {
			
			InputStream instream = new FileInputStream("/data/canciones.txt");// open the file for reading
			
			if (instream != null) {
				InputStreamReader inputreader = new InputStreamReader(instream);
				BufferedReader buffreader = new BufferedReader(inputreader);

				do {
					titulo[i] = buffreader.readLine();
					Toast.makeText(getBaseContext(), titulo[i], Toast.LENGTH_SHORT).show();
					i++;
				} while (titulo[i] != null);
				
				ArrayAdapter<String> adaptador= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,titulo);
				ListView LstOpciones = (ListView)findViewById(R.id.LstOpciones);
				LstOpciones.setAdapter(adaptador);
			}
		} catch (Exception ex) {
			System.out.println("error: "+ex);
		} 
		
		
	}
}
