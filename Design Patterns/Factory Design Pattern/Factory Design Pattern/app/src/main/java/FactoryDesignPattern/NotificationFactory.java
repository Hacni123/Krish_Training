/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryDesignPattern;

/**
 *
 * @author Dell
 */
public class NotificationFactory {
	public Notification createNotification(String channel)
	{
		if (channel == null || channel.isEmpty())
			return null;
		if ("SMS".equals(channel)) {
			return new SMSNotification();
		}
		else if ("EMAIL".equals(channel)) {
			return new EmailNotification();
		}
		else if ("CALL".equals(channel)) {
			return new CallNortification();
		}
		return null;
	}
}
