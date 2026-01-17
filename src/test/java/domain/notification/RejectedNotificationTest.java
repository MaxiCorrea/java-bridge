package domain.notification;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class RejectedNotificationTest {

	@Test
	void shouldSendRejectedNotificationTest() {
		NotificationSender sender = Mockito.mock(NotificationSender.class);
		RejectedNotification rejectedNotification = new RejectedNotification(sender);
		rejectedNotification.sendTo("max@.com.ar");
		Mockito.verify(sender).send("max@.com.ar", NotificationMessage.REJECTED.getMessage());
		Mockito.verifyNoMoreInteractions(sender);
	}

}
