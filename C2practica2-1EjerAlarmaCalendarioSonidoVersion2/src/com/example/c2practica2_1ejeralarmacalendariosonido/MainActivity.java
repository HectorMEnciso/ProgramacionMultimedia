package com.example.c2practica2_1ejeralarmacalendariosonido;

import java.util.Random;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.provider.CalendarContract;
import android.provider.CalendarContract.Events;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
	private EditText datos1;
	private EditText datos2;
	private EditText NombreAlarma;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		datos1 = (EditText) findViewById(R.id.Horas);
		datos2 = (EditText) findViewById(R.id.Minutos);
		NombreAlarma = (EditText) findViewById(R.id.NombreAlarma);
	}

	public void onClickAlarma(View view) {
		Intent intent = new Intent(AlarmClock.ACTION_SET_ALARM)
				.putExtra(AlarmClock.EXTRA_MESSAGE,
						NombreAlarma.getText().toString())
				.putExtra(AlarmClock.EXTRA_HOUR,
						Integer.parseInt(datos1.getText().toString()))
				.putExtra(AlarmClock.EXTRA_MINUTES,
						Integer.parseInt(datos2.getText().toString()));
		if (intent.resolveActivity(getPackageManager()) != null) {
			startActivity(intent);
		}
	}

	public void onClickCalendario(View view) {
		Intent intent = new Intent(Intent.ACTION_INSERT)
				.setData(Events.CONTENT_URI)
				.putExtra(Events.TITLE, "Prueba")
				.putExtra(Events.EVENT_LOCATION, "Zaragoza")
				.putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME, 16)
				.putExtra(CalendarContract.EXTRA_EVENT_END_TIME, 17);
		if (intent.resolveActivity(getPackageManager()) != null) {
			startActivity(intent);
		}
	}

	public void onClickSonido(View view) {

		MediaPlayer mediaPlayer = MediaPlayer.create(getBaseContext(),R.raw.applause);
		Toast toast = Toast.makeText(getBaseContext(),
				"Reproduciendo sonido...", Toast.LENGTH_LONG);

		toast.show();
		mediaPlayer.start();
	}

	public void onClickSonidoDos(View view) {
		Intent i = new Intent("andriod.intent.action.MUSIC_PLAYER")
				.putExtra(
						Intent.EXTRA_STREAM,
						Uri.parse("android.resource://com.my.android.sharesound/"
								+ R.raw.applause));
		startActivity(i);
	}
	public void onClickRandom(View view) {
		 Random rnd = new Random();
		
		int canciones[]=new int[]{R.raw.babybabble,R.raw.comeon,R.raw.footsteps,R.raw.clearingthroat};
		int sonidoAlAzar = canciones[rnd.nextInt(canciones.length)];
		MediaPlayer mediaPlayer = MediaPlayer.create(getBaseContext(),sonidoAlAzar);
		Toast toast = Toast.makeText(getBaseContext(),
				"Reproduciendo sonido...", Toast.LENGTH_LONG);

		toast.show();
		mediaPlayer.start();
	}

}
