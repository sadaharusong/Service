package com.example.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class MyStartService extends Service{

	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		Log.i("tag", "Service--onCreat()");
		super.onCreate();
	}
	@Override
	public int onStartCommand(Intent intent, int flags, int startId) {
		// TODO Auto-generated method stub
		Log.i("tag", "Service--onStartCommand()");
		return super.onStartCommand(intent, flags, startId);
	}
	@Override
	public IBinder onBind(Intent intent) {
		// TODO Auto-generated method stub
		Log.i("tag", "Service--onBind()");
		return null;
	}
	@Override
	public void onDestroy() {
		// TODO Auto-generated method stub
		Log.i("tag", "Service--onDestroy()");
		super.onDestroy();
	}
}
