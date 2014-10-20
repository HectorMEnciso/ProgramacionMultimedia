package com.example.c2practica2_1ejeralarmacalendariosonido;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.provider.CalendarContract;
import android.provider.CalendarContract.Events;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void onClickAlarma(View view) {
		Intent intent = new Intent(AlarmClock.ACTION_SET_ALARM)
				.putExtra(AlarmClock.EXTRA_MESSAGE, "Alama de prueba")
				.putExtra(AlarmClock.EXTRA_HOUR, 16)
				.putExtra(AlarmClock.EXTRA_MINUTES, 0);
		if (intent.resolveActivity(getPackageManager()) != null) {
			startActivity(intent);
		}
	}

	public void onClickCalendario(View view) {
		Intent intent = new Intent(Intent.ACTION_INSERT)
				.setData(Events.CONTENT_URI).putExtra(Events.TITLE, "Prueba")
				.putExtra(Events.EVENT_LOCATION, "Zaragoza")
				.putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME, 16)
				.putExtra(CalendarContract.EXTRA_EVENT_END_TIME, 17);
		if (intent.resolveActivity(getPackageManager()) != null) {
			startActivity(intent);
		}
	}

	public void onClickSonido(View view) {
		Intent intent = new Intent("android.intent.action.MUSIC_PLAYER");
		MediaPlayer mediaPlayer = MediaPlayer.create(getBaseContext(),R.raw.kalimba);
		Toast toast = Toast.makeText(getBaseContext(), "Reproduciendo sonido...", Toast.LENGTH_LONG);
		toast.show();	
		//mediaPlayer.start(); // no need to call prepare(); create() does that
		if (intent.resolveActivity(getPackageManager()) != null) {
			startActivity(intent);
			mediaPlayer.start(); // no need to call prepare(); create() does that
		}// for you
	}

}
