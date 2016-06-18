package com.nayragames.nativeapi;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import com.nayragames.androidnative.R;

public class MainActivity extends Activity {

	private static final String TAG=MainActivity.class.getSimpleName();
	private TextView apiName,apiVersion,author;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Log.i(TAG,"Version"+NativeAPI.ApiVersion());
		Log.i(TAG,"API Name"+NativeAPI.ApiName());
		Log.i(TAG,"Author"+NativeAPI.authorName());

		apiName = (TextView) findViewById(R.id.api);
		apiName.setText(apiName.getText()+NativeAPI.ApiName());

		apiVersion=(TextView) findViewById(R.id.version);
		apiVersion.setText(apiVersion.getText()+String.valueOf(NativeAPI.ApiVersion()));

		author = (TextView) findViewById(R.id.author);
		author.setText(author.getText()+NativeAPI.authorName());

		NativeAPI nativeAPI=new NativeAPI();
		nativeAPI.xyz();

	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
