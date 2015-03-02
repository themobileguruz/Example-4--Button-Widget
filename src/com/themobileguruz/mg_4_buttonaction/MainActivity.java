package com.themobileguruz.mg_4_buttonaction;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener 
{

	Button btnClick;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		btnClick = (Button) findViewById(R.id.buttonClick);
		
		btnClick.setOnClickListener(this);
	}

	@Override
	public void onClick(View arg0)
	{
		// TODO Auto-generated method stub
		
		switch (arg0.getId()) 
		{
		case R.id.buttonClick:
			
		Toast.makeText(getApplicationContext(), "Button is Clicked", Toast.LENGTH_SHORT).show();	
			break;

		default:
			break;
		}
		
	}

}
