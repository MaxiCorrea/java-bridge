package application.usecase;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import domain.notification.Notification;

class SendNotificationUseCaseTest {

	@Test
	void shouldSendNotification() {
		SendNotificationUseCase usecase = new SendNotificationUseCase();
		Notification notification = Mockito.mock(Notification.class);
		usecase.execute(notification, "max@com.ar");
		Mockito.verify(notification).sendTo("max@com.ar");
		Mockito.verifyNoMoreInteractions(notification);
	}

}
