package com.example.c2calendardata;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.provider.CalendarContract.Events;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent i = getIntent();
		Bundle b = i.getExtras();

		Toast.makeText(this, i.getStringExtra(Events.TITLE),
				Toast.LENGTH_LONG).show();
		Toast.makeText(this,
				Integer.toString(i.getIntExtra((Events.EVENT_LOCATION), 0)),
				Toast.LENGTH_LONG).show();
		Toast.makeText(this,
				Integer.toString(i.getIntExtra((CalendarContract.EXTRA_EVENT_BEGIN_TIME), 0)),
				Toast.LENGTH_LONG).show();
		Toast.makeText(this,
				Integer.toString(i.getIntExtra((CalendarContract.EXTRA_EVENT_END_TIME), 0)),
				Toast.LENGTH_LONG).show();
    }
}
