package domain.notification;

public class ConfirmedNotification extends Notification {

	public ConfirmedNotification(
			final NotificationSender sender) {
		super(sender);
	}

	@Override
	public void sendTo(String recipient) {
		getSender().send(recipient, NotificationMessage.CONFIRMED.getMessage());
	}

}
