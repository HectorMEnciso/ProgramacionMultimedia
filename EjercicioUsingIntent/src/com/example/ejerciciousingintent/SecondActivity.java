package com.example.ejerciciousingintent;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SecondActivity extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.secondactivity);
	}
	
	public void onClick(View view) {
		Intent data = new Intent();
		//---get the EditText view---
		EditText txt_username =(EditText) findViewById(R.id.txt_username);//coje el nombre metido
		//---set the data to pass back---
		data.setData(Uri.parse(txt_username.getText().toString()));//pasa nombre
		setResult(RESULT_OK, data);
		//---closes the activity---
		finish();
	}
}
