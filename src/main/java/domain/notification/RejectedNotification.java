package domain.notification;

public class RejectedNotification extends Notification {

	public RejectedNotification(
			final NotificationSender sender) {
		super(sender);
	}

	@Override
	public void sendTo(
			final String recipient) {
		getSender().send(recipient, NotificationMessage.REJECTED.getMessage());
	}

}
