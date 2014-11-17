package com.example.p33_2;

import java.io.BufferedReader;

import java.io.FileInputStream;

import java.io.InputStream;
import java.io.InputStreamReader;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends Activity {
	String[] titulo;
	int i=0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Toast.makeText(getBaseContext(), "llego aqui", Toast.LENGTH_SHORT);
		/*try {
			// open the file for reading
			InputStream instream = new FileInputStream("/data/canciones.txt");
			
			// if file the available for reading
			if (instream != null) {// prepare the file for reading
				InputStreamReader inputreader = new InputStreamReader(instream);
				BufferedReader buffreader = new BufferedReader(inputreader);

				do {
					titulo[i] = buffreader.readLine();
					Toast.makeText(getBaseContext(), titulo[i], Toast.LENGTH_SHORT);
					i++;
					// do something with the line
				} while (titulo != null);

			}
		} catch (Exception ex) {// print stack trace.
			System.out.println("error: "+ex);
		} 
		*/
	//	ArrayAdapter<String> adaptador= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,titulo);
	//	ListView LstOpciones = (ListView)findViewById(R.id.LstOpciones);
	//	LstOpciones.setAdapter(adaptador);
	}
}
