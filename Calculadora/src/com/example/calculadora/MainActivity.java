package com.example.calculadora;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {//Se implementa la interfaz OnClickListener y se recogen los eventos en el método onClick()
	/*
	 * Declaramos las referencias de los controles del layout globalmente para poder utlilizarlos en cualquier parte de la clase.
	 * */
	TextView CajaTexto;
	Button boton1, boton2, boton3, boton4, boton5, boton6, boton7, boton8,
			boton9, boton0, botonSumar, botonIgual, botonBorrar, botonRestar,
			botonDividir, botonMultiplicar;
	String resultado = "", tipoOperacion = "";//resultado es donde almacenamos los numeros como string // En tipoOperacion guardamos el tipo de operacion(suma +, resta -, multiplicacion * y division /)
	String valor1, valor2;//Guardamos el primer y el segundo valor como string respectivamente.
	int resulFinal;//Variable que guarda el resultado final de las operaciones.

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);//Con super invocamos al metodo onCreate de la superclase
		setContentView(R.layout.activity_main);//Establece el layout "activity_main"

		CajaTexto = (TextView) findViewById(R.id.textView);//Obtenemos la referencia a CajaTexto
		CajaTexto.setOnClickListener(this);//Definimos el escuchador para CajaTexto
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
		botonIgual = (Button) findViewById(R.id.botonIgual);
		botonIgual.setOnClickListener(this);
		botonBorrar = (Button) findViewById(R.id.botonBorrar);
		botonBorrar.setOnClickListener(this);

		botonSumar = (Button) findViewById(R.id.botonSumar);
		botonSumar.setOnClickListener(this);

		botonRestar = (Button) findViewById(R.id.botonRestar);
		botonRestar.setOnClickListener(this);

		botonDividir = (Button) findViewById(R.id.botonDividir);
		botonDividir.setOnClickListener(this);

		botonMultiplicar = (Button) findViewById(R.id.botonMultiplicar);
		botonMultiplicar.setOnClickListener(this);

	}

	public void onClick(View v) {
		resultado = CajaTexto.getText().toString();//Obtenemos el texto de CajaTexto y lo convertimos a String.
		switch (v.getId()) {//Obtenemos el Id de cada elemento del layout.
		case (R.id.boton1):
			resultado = resultado + "1";//Concatenamos a resultado el valor del Boton 1
			CajaTexto.setText(resultado);//Pasamos resultado a la CajaTexto.
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
			valor2 = resultado;//Guardamos el valor del segundo dato introducido
			switch (tipoOperacion) {//En función del tipo de operación entrará a sumar, restar, multiplicar o dividir.
			case "+":
				resulFinal = Integer.parseInt(valor1)//Guardamos el resultado de la operación.
						+ Integer.parseInt(valor2);
				break;
			case "-":
				resulFinal = Integer.parseInt(valor1)
						- Integer.parseInt(valor2);
				break;
			case "*":
				resulFinal = Integer.parseInt(valor1)
						* Integer.parseInt(valor2);
				break;

			case "/":
				resulFinal = Integer.parseInt(valor1)
						/ Integer.parseInt(valor2);
				break;
			}
			CajaTexto.setText(Integer.toString(resulFinal));//Le pasamos el resultado final a CajaTexto como String
			break;
		case (R.id.botonSumar):
			tipoOperacion = "+";//Definimos el tipo de operación
			valor1 = resultado;//Almacenamos en valor lo que había en CajaTexto
			CajaTexto.setText("");//Borramos el texto de CajaTexto
			break;
		case (R.id.botonRestar):
			tipoOperacion = "-";
			valor1 = resultado;
			CajaTexto.setText("");
			break;
		case (R.id.botonDividir):
			tipoOperacion = "/";
			valor1 = resultado;
			CajaTexto.setText("");
			break;
		case (R.id.botonMultiplicar):
			tipoOperacion = "*";
			valor1 = resultado;
			CajaTexto.setText("");
			break;
		}
	}

}
