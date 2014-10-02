package com.example.ejerciciousingintent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {
	int request_Code = 1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);// se muestra tal y como esta en
												// activity_main
	}

	/*
	 * public void onClick(View view) {//evento on click cuando clicamos sobre
	 * un boton. startActivity(new
	 * Intent("com.example.ejerciciousingintent.SecondActivity"));//requiere
	 * nombre paquete. //el intent llama a la clase SecondActivity
	 * //startActivity invoca otras actividades }
	 */
	public void onClick(View view) {
		// startActivity(new Intent(“net.learn2develop.SecondActivity"));
		// or
		// startActivity(new Intent(this, SecondActivity.class));
	startActivityForResult(new Intent("com.example.ejerciciousingintent.SecondActivity"),request_Code);
	}

	public void onActivityResult(int requestCode, int resultCode, Intent data) {
		if (requestCode == request_Code) {
			if (resultCode == RESULT_OK) {
				Toast.makeText(this, data.getData().toString(),Toast.LENGTH_SHORT).show();
			}
		}
	}
}
