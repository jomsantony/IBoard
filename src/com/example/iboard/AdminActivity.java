package com.example.iboard;

import com.example.iboard.R;
import com.example.iboard.SettingsActivity;
import com.example.iboard.R.layout;
import com.example.iboard.R.menu;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class AdminActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_admin);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_admin, menu);
		return true;
	}
	
	
public void onClick(View v){}
	
	public void visitorInbox(View v){
		/*Intent mailClient = new Intent(Intent.ACTION_VIEW);
		mailClient.setClassName("com.google.android.gm", "com.google.android.gm.ConversationListActivity");
		startActivity(mailClient);*/
		Intent intent = getPackageManager().getLaunchIntentForPackage("com.android.email");
		startActivity(intent);
		finish();
				
	}
	public void adminSettings(View v){
		
		Intent admin=new Intent(this,SettingsActivity.class);
		startActivity(admin);
			
		
	}
	
	
	
	
	
	
	
	
	

}