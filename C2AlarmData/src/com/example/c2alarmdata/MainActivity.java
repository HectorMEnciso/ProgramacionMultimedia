package com.example.c2alarmdata;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Intent i = getIntent();
		Bundle b = i.getExtras();

		Toast.makeText(this, i.getStringExtra(AlarmClock.EXTRA_MESSAGE),
				Toast.LENGTH_LONG).show();
		Toast.makeText(this,
				Integer.toString(i.getIntExtra((AlarmClock.EXTRA_HOUR), 0)),
				Toast.LENGTH_LONG).show();
		Toast.makeText(this,
				Integer.toString(i.getIntExtra((AlarmClock.EXTRA_MINUTES), 0)),
				Toast.LENGTH_LONG).show();
	}
}
