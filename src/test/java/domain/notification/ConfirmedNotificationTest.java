package domain.notification;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ConfirmedNotificationTest {

	@Test
	void shouldSendConfirmedNotificationTest() {
		NotificationSender sender = Mockito.mock(NotificationSender.class);
		ConfirmedNotification confirmedNotification = new ConfirmedNotification(sender);
		confirmedNotification.sendTo("max@.com.ar");
		Mockito.verify(sender).send("max@.com.ar", NotificationMessage.CONFIRMED.getMessage());
		Mockito.verifyNoMoreInteractions(sender);
	}

}
