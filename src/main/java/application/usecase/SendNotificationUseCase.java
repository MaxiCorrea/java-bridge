package application.usecase;

import domain.notification.Notification;

public class SendNotificationUseCase {

	public void execute(
			final Notification notification,
			final String recipient) {
		notification.sendTo(recipient);
	}
	
}
