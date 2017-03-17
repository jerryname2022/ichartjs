package com.ichartjs.test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class IchartjstestActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);//去掉标题栏 
        setContentView(R.layout.main);
    }
    public void btnclick(View view){
    	Button btn = (Button)view;
    	Intent in;
    	switch (btn.getId()) {
		case R.id.a1:
			in = new Intent(this,A1Activity.class);
	    	startActivity(in);
			break;
		case R.id.a2:
			in = new Intent(this,A2Activity.class);
	    	startActivity(in);
			break;
		default:
			break;
		}
    	
    }
}