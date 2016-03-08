package com.example.service;

import android.app.Service;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;

public class MyBindService extends Service{

	
	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		Log.i("tag", "BindService--onCreat()");
		super.onCreate();
	}
	
	
	public class MyBinder extends Binder
	{
		public MyBindService getService()
		{
			return MyBindService.this;
		}
	}
	@Override
	public IBinder onBind(Intent intent) {
		Log.i("tag", "BindService--onBind()");
		// TODO Auto-generated method stub
		return new MyBinder();
	}

	@Override
	public void unbindService(ServiceConnection conn) {
		Log.i("tag", "BindService--unbindService()");
		// TODO Auto-generated method stub
		super.unbindService(conn);
	}
	@Override
	public void onDestroy() {
		// TODO Auto-generated method stub
		Log.i("tag", "BindService--onDestroy()");
		super.onDestroy();
	}
	
	public void Play()
	{
		Log.i("tag", "播放");
	}
	
	public void Pause()
	{
		Log.i("tag", "暂停");
	}
	public void Pervious()
	{
		Log.i("tag", "上一首");
	}
	public void next()
	{
		Log.i("tag", "下一首");
	}
}
