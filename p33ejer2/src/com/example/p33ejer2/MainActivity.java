package com.example.p33ejer2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity{
	ListView listView;
	Button boton;

	List <String> canciones=new ArrayList<String>();
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        	// Get ListView object from xml
        	boton=(Button) findViewById(R.id.boton);
     		listView = (ListView) findViewById(R.id.LstOpciones);
     		listView.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
     	
     		getSongs();
     		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_checked, canciones);
     		
     		listView.setOnItemClickListener(new OnItemClickListener() {
     			
    			public void onItemClick(AdapterView<?> parent, View view,int position, long id) {

    				Toast.makeText(getApplicationContext(),((TextView) view).getText(), Toast.LENGTH_SHORT).show();
    			}
    		});
     		
     		
     		// Assign adapter to ListView
    		listView.setAdapter(adapter);
    		
    		listView.setTextFilterEnabled(true);
    		
    		
    }
 
    public void getSongs(){
  	  String line;
        try {
        
        	InputStream instream = new FileInputStream("/data/canciones.txt");

		        	if (instream != null) {
		        
		        		InputStreamReader inputreader = new InputStreamReader(instream);
		        		BufferedReader buffreader = new BufferedReader(inputreader);
		
		        	  
		        	    while(( line = buffreader.readLine())!=null){
		        	     canciones.add(line);
		        	     Log.d("MainActivity","Insertando linea");
		        	    }
		        	}
        	} catch (Exception ex) {
        	 
        	} finally { //siempre que hay try catch(codigo que se ejecuta si o si, salte o no la excepcion)
        	// close the file.
        	//instream.close();
        	}
     
    }
    public void onClick (View view) {
	    	String itemsSelected = "Canciones seleccionadas:\n";
	    	for (int i=0; i<listView.getCount(); i++) {
	    		if (listView.isItemChecked(i)) {
	    			itemsSelected += listView.getItemAtPosition(i) + "\n";
	    		}
	    	}
	    	Toast.makeText(this, itemsSelected, Toast.LENGTH_LONG).show();
	    }
}