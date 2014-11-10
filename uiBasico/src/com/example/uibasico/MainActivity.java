package com.example.uibasico;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends Activity implements OnClickListener {
	EditText CajaTexto;
	Button boton1, boton2, boton3, boton4, boton5, boton6, boton7, boton8,
			boton9, boton0, botonMas, botonIgual, botonBorrar;
	String resultado = "";
	String valor1, valor2;
	int resulFinal;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ejer4_practica31);

		CajaTexto = (EditText) findViewById(R.id.editText);
		CajaTexto.setOnClickListener(this);
		boton1 = (Button) findViewById(R.id.boton1);
		boton1.setOnClickListener(this);
		boton2 = (Button) findViewById(R.id.boton2);
		boton2.setOnClickListener(this);
		boton3 = (Button) findViewById(R.id.boton3);
		boton3.setOnClickListener(this);
		boton4 = (Button) findViewById(R.id.boton4);
		boton4.setOnClickListener(this);
		boton5 = (Button) findViewById(R.id.boton5);
		boton5.setOnClickListener(this);
		boton6 = (Button) findViewById(R.id.boton6);
		boton6.setOnClickListener(this);
		boton7 = (Button) findViewById(R.id.boton7);
		boton7.setOnClickListener(this);
		boton8 = (Button) findViewById(R.id.boton8);
		boton8.setOnClickListener(this);
		boton9 = (Button) findViewById(R.id.boton9);
		boton9.setOnClickListener(this);
		boton0 = (Button) findViewById(R.id.boton0);
		boton0.setOnClickListener(this);
		botonMas = (Button) findViewById(R.id.botonMas);
		botonMas.setOnClickListener(this);
		botonIgual = (Button) findViewById(R.id.botonIgual);
		botonIgual.setOnClickListener(this);
		botonBorrar = (Button) findViewById(R.id.botonBorrar);
		botonBorrar.setOnClickListener(this);
	}

	public void onClick(View v) {
		resultado = CajaTexto.getText().toString();
		switch (v.getId()) {
		case (R.id.boton1):
			resultado = resultado + "1";
			CajaTexto.setText(resultado);
			break;
		case (R.id.boton2):
			resultado = resultado + "2";
			CajaTexto.setText(resultado);
			break;
		case (R.id.boton3):
			resultado = resultado + "3";
			CajaTexto.setText(resultado);
			break;
		case (R.id.boton4):
			resultado = resultado + "4";
			CajaTexto.setText(resultado);
			break;
		case (R.id.boton5):
			resultado = resultado + "5";
			CajaTexto.setText(resultado);
			break;
		case (R.id.boton6):
			resultado = resultado + "6";
			CajaTexto.setText(resultado);
			break;
		case (R.id.boton7):
			resultado = resultado + "7";
			CajaTexto.setText(resultado);
			break;
		case (R.id.boton8):
			resultado = resultado + "8";
			CajaTexto.setText(resultado);
			break;
		case (R.id.boton9):
			resultado = resultado + "9";
			CajaTexto.setText(resultado);
			break;
		case (R.id.boton0):
			resultado = resultado + "0";
			CajaTexto.setText(resultado);
			break;
		case (R.id.botonBorrar):
			CajaTexto.setText("");
			break;
		case (R.id.botonIgual):
			valor2 = resultado;
			resulFinal = Integer.parseInt(valor1) + Integer.parseInt(valor2);
			CajaTexto.setText(Integer.toString(resulFinal));
			break;
		case (R.id.botonMas):
			valor1 = resultado;
			CajaTexto.setText("");
			break;
		}
	}

}
