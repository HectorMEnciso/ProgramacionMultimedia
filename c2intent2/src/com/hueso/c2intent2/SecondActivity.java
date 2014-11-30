package com.hueso.c2intent2;

import com.hueso.c21intent2.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class SecondActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.secondactivity);
	}
	
	public void onClick(View view) {
	       startActivity(new Intent(this,ThirdActivity.class));
	        
	    }
}
