package org.cocos2dx.javascript;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.FrameLayout;

public class LaunchActivity extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Button launchButton = new Button(this);
		launchButton.setText("Launch Cocos Game");
		launchButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent launchIntent = new Intent(LaunchActivity.this, AppActivity.class);
				startActivity(launchIntent);
			}
		});
		
		FrameLayout rootView = new FrameLayout(this);
		rootView.addView(launchButton);
		setContentView(rootView);
	}
	
}
