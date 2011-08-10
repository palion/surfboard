package net.tidal.surfboard;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		findViewById(R.id.register).setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				startGame(v);
			}
		});
	}


	private void startGame(View v) {
		TextView view = (TextView)findViewById(R.id.intro1);
		view.setText("Please wait, starting game...");

	}
}