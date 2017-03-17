package com.ichartjs.test;

import java.util.Random;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.webkit.WebView;

public class A2Activity extends Activity {
	
	WebView wv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);//去掉标题栏 
		setContentView(R.layout.a1);
		wv = (WebView) findViewById(R.id.wv);
		wv.getSettings().setJavaScriptEnabled(true);  
		wv.getSettings().setUseWideViewPort(true);
		wv.getSettings().setSupportZoom(true);
		// 设置是否可缩放
		wv.getSettings().setBuiltInZoomControls(true);
		wv.getSettings().setLoadWithOverviewMode(true);
		wv.requestFocus();
		wv.loadUrl("file:///android_asset/zhuzhuang_chart.html");
	}
	public void backBtn(View view){
		this.finish();
	}
	

	//模拟获取远程数据 这里可以是联网到服务端获取数据
	private String getRemoteData(){
		 try {  
			 	Random random = new Random();
	            JSONObject object1 = new JSONObject();  
	            object1.put("name", "Renren");  
	            object1.put("color", "#b5bcc5");  
	            object1.put("value", random.nextInt(40));  
	            JSONObject object2 = new JSONObject();  
	            object2.put("name", "Facebook");  
	            object2.put("color", "#b5bcc5");  
	            object2.put("value", random.nextInt(40));  
	            JSONObject object3 = new JSONObject();  
	            object3.put("name", "StumbleUpon");  
	            object3.put("color", "#b5bcc5");  
	            object3.put("value", random.nextInt(40));  
	            JSONObject object4 = new JSONObject();  
	            object4.put("name", "reddit");  
	            object4.put("color", "#b5bcc5");  
	            object4.put("value", random.nextInt(40));  
	            JSONObject object5 = new JSONObject();  
	            object5.put("name", "Hi5");  
	            object5.put("color", "#b5bcc5");  
	            object5.put("value", random.nextInt(40));  
	            JSONObject object6 = new JSONObject();  
	            object6.put("name", "LinkedIn");  
	            object6.put("color", "#b5bcc5");  
	            object6.put("value", random.nextInt(40));  
	            JSONObject object7 = new JSONObject();  
	            object7.put("name", "Twitter");  
	            object7.put("color", "#b5bcc5");  
	            object7.put("value", random.nextInt(40));  
	            JSONObject object8 = new JSONObject();  
	            object8.put("name", "Other");  
	            object8.put("color", "#b5bcc5");  
	            object8.put("value", random.nextInt(40));  
	            
	            
	            
	            
	            JSONArray jsonArray = new JSONArray();  
	            jsonArray.put(object1);  
	            jsonArray.put(object2);  
	            jsonArray.put(object3);  
	            jsonArray.put(object4);  
	            jsonArray.put(object5);  
	            jsonArray.put(object6);  
	            jsonArray.put(object7);  
	            jsonArray.put(object8);  
	            return jsonArray.toString();  
	        } catch (JSONException e) {  
	            e.printStackTrace();  
	        }  
	        return null;  
	}
	
	public void updateBtn(View view){
		wv.loadUrl("javascript:setContentInfo('"+getRemoteData()+"')");  
	}
	
	
}
