package com.talissonmelo.di.notification;

import com.talissonmelo.di.model.Client;

public class NotificationSMS implements Notification{

	@Override
	public void notification(Client client, String msg) {
		System.out.println("Notificando : " 
								+ client.getName() 
								+ ", atrav�s de SMS: " 
								+ client.getPhone()
								+ ", msg: " 
								+ msg);
	}
}
