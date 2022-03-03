/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package FactoryDesignPattern;

public class App {
    public static void main(String[] args) {
       NotificationFactory notificationFactory = new NotificationFactory();
		Notification notification1 = notificationFactory.createNotification("EMAIL");
		notification1.notifyUser();
                Notification notification2 = notificationFactory.createNotification("SMS");
		notification2.notifyUser();
                Notification notification3 = notificationFactory.createNotification("CALL");
		notification3.notifyUser();
    }
}