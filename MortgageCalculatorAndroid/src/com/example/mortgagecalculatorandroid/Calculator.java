package com.example.mortgagecalculatorandroid;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

public class Calculator extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_calculator);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.calculator, menu);
		return true;
	    final EditText grossInc = (EditText)findViewById(R.id.grossInc);
	    final EditText monDebt = (EditText)findViewById(R.id.monDebt);	    
	    final EditText intRate = (EditText)findViewById(R.id.intRate);
	    final EditText dPmt = (EditText)findViewById(R.id.dPmt);
	    final EditText ttlAfrdblMrg = (EditText)findViewById(R.id.ttlAfrdblMrg);
	    // Register the onClick listener with the implementation above
	    trmSpin.setOnClickListener(new OnClickListener(){

			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
	    	public void onClick(Spinner trmSpin){
	    		int grinc = Log.v("EditText", grossInc.getText().toString());
	    		double monthDebt = Log.v("EditText", monDebt.getText().toString());
	    		double r = Log.v("EditText", intRate.getText().toString());
	    		double down = Log.v("EditText", dPmt.getText().toString());
	    		double eighteenpercent = Calc.HousingPayment(grinc);
	    		Integer term = (Integer)trmSpin.getSelectedItem();
	    		double thirtysix = Calc.debtPayments(grinc, monthDebt);
	    		double pmtAllowed = Calc.canSpend(eighteenpercent, thirtysix);
		        String mortgage = (String)Calc.mortgageAllowed(pmtAllowed, down,r,term);
	    		String allowed = String.format("%.2f", mortgage);
	    		ttlAfrdblMrg.setText(allowed);
	    	}
	    }
	    );
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