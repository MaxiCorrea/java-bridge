package domain.notification;

public abstract class Notification {

	private final NotificationSender sender;
	
	public Notification(
			final NotificationSender sender) {
		this.sender = sender;
	}
	
	NotificationSender getSender() {
		return sender;
	}
	
	public abstract void sendTo(String recipient);
	
}
