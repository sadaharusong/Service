package com.example.service;

import com.example.service.MyBindService.MyBinder;

import android.app.Activity;
import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends Activity {
	Intent intent ;	
	Intent intent2 ; 
	MyBindService service;
	ServiceConnection conn = new ServiceConnection() {
	
		@Override//������Դ��Serviec���������ⶪʧ��ʱ�������������
		//���統Service�����˻��߱�ǿ��ɱ����
		public void onServiceDisconnected(ComponentName name) {
			// TODO Auto-generated method stub
			
		}
		
		@Override//������Դ��Service�ɹ�����֮�󽫻��Զ������������
		public void onServiceConnected(ComponentName name, IBinder binder) {
			// TODO Auto-generated method stub
			 service =((MyBinder)binder).getService();
		}
	};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	public void doClick(View v)
	{
		switch (v.getId()) {
		case R.id.start:
			intent= new Intent(MainActivity.this , MyStartService.class);
		   startService(intent);
			break;
		case R.id.stop:
			stopService(intent);
			break;
		case R.id.bind:
			intent2 =new Intent(MainActivity.this, MyBindService.class);
			bindService(intent2, conn, Service.BIND_AUTO_CREATE);
			break;
		case R.id.unbind:
			unbindService(conn);
			break;
		case R.id.paly:
			service.Play();
			break;
		case R.id.pause:
			service.Pause();
			break;
		case R.id.pervious:
			service.Pervious();
			break;
		case R.id.next:
			service.next();
			break;
		}
	}
}
