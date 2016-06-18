package com.nayragames.nativeapi;

import com.example.androidnative.R;

import android.app.Activity;
import android.view.View.OnClickListener;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class NDKActivity extends Activity {

	Button buttonCalc;
	TextView result;
	EditText value1,value2;
	NativeAPI nativeApi;
	
/** Called when the activity is first created. */

	MainActivity nativeLib;
	public void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.ndkact);
			
			System.out.println("Author "+NativeAPI.authorName());
			
			//nativeLib = new MainActivity();
			//String helloText = nativeLib.hello();

		String helloText = "";
			
			result = (TextView) findViewById(R.id.result);
			value1 = (EditText) findViewById(R.id.value1);
			value2 = (EditText) findViewById(R.id.value2);

			//Update the UI
			TextView outText = (TextView) findViewById(R.id.textOut);
			outText.setText(helloText);

			// Setup the UI
			buttonCalc = (Button)this.findViewById(R.id.buttonCalc);

			buttonCalc.setOnClickListener(new OnClickListener() {

					public void onClick(View v) {
							int v1, v2, res = -1;
							v1 = Integer.parseInt(value1.getText().toString().trim());
							v2 = Integer.parseInt(value2.getText().toString().trim());

							//res=nativeLib.add(v1, v2);
							//res =5; 
							result.setText(new Integer(res).toString());
					}
			});
		}
   }
