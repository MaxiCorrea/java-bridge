package domain.notification;

public class NotificationMessage {

	public static final NotificationMessage CONFIRMED = new NotificationMessage("Confirmed");
	public static final NotificationMessage REJECTED= new NotificationMessage("Rejected");
	
	private final String message;
	
	private NotificationMessage(
			final String message){
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
	
}
