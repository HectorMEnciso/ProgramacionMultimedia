package com.example.e315;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class MainActivity extends ListActivity {
	String[] itemname = { "Safari", "Camera", "Global", "FireFox",
			"UC Browser", "Android Folder", "VLC Player", "Cold War" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		this.setListAdapter(new ArrayAdapter<String>(this, R.layout.mylist,
				R.id.Itemname, itemname));
	}
}