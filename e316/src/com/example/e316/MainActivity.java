package com.example.e316;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ListActivity {
	String[] itemname = { "Safari", "Camera", "Global", "FireFox",
			"UC Browser", "Android Folder", "VLC Player", "Cold War" };
	Integer[] imgid = { R.drawable.pic1, R.drawable.pic2, R.drawable.pic3,
			R.drawable.pic4, R.drawable.pic5, R.drawable.pic6, R.drawable.pic7,
			R.drawable.pic8, };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		CustomListAdapter adapter = new CustomListAdapter(this, itemname, imgid);
		setListAdapter(adapter);
	}

	public void onListItemClick(ListView lv, View view, int position, int imgid) {
		String Slecteditem = (String) getListAdapter().getItem(position);
		Toast.makeText(this, Slecteditem, Toast.LENGTH_SHORT).show();
	}
}