/*
Invocar aplicaciones usando intents
Ejercicio pagina 92 libro android 4
*/
package com.hueso.c2intent5;

import com.hueso.c21intent5.R;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.provider.AlarmClock;

public class IntentsActivity extends Activity {

	int request_Code = 1;
		
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	}

	public void onClickWebBrowser(View view) {
		Intent i = new Intent(android.content.Intent.ACTION_VIEW,Uri.parse("http://www.amazon.com"));
		startActivity(i);
	}

	public void onClickMakeCalls(View view) {        
		Intent i = new Intent(android.content.Intent.ACTION_DIAL,Uri.parse("tel:+646667159"));
		startActivity(i);			
	}

	public void onClickShowMap(View view) {
		Intent i = new Intent(android.content.Intent.ACTION_VIEW,Uri.parse("geo:41.6570474,-0.919764,17"));
		startActivity(i);
	}
	
	public void onClickLaunchMyBrowser(View view) {
		Intent i = new Intent("com.hueso.c21intent6.MyBrowser");
		i.setData(Uri.parse("http://www.amazon.com"));
		startActivity(i);
	}
}