package com.example.iboard;

import com.example.iboard.R;
import com.example.iboard.R.layout;
import com.example.iboard.R.menu;
import com.example.iboard.AddUserActivity;
import com.example.iboard.EnableUserActivity;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class SettingsActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_settings);
	}
	
public void onClick(View v){}
	
	public void addUser(View v){
		
		Intent adduser;
		adduser=new Intent(this,AddUserActivity.class);
		startActivity(adduser);
	}
	
	public void enableUser(View v){
		
		Intent enableuser;
		enableuser=new Intent(this,EnableUserActivity.class);
		startActivity(enableuser);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_settings, menu);
		return true;
	}

}
