package domain.notification;

public interface NotificationSender {
	
	void send(String recipient, String message);

}
