package com.mobisoft.pos;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mainscreen);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void onViewClicked(View view) {
		switch (view.getId()) {
		case R.id.ll_sales:
			// show customers list
			startActivity(new Intent(MainActivity.this, CustomerList.class));
			break;
		case R.id.ll_stock:
			// show product stock
			startActivity(new Intent(MainActivity.this, StockList.class));
			break;
		default:
			Toast.makeText(MainActivity.this, "Feature Under Construction",
					Toast.LENGTH_LONG).show();
			break;
		}
	}

}
