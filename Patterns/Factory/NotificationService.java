public class NotificationService {
    public static void main(String[] args) {
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification pushNotification = notificationFactory.createNotification("push");
        Notification smsNotification = notificationFactory.createNotification("sms");
        Notification emailNotification = notificationFactory.createNotification("email");

        String[] notifications = {"Notification 1", "Notification 2"};

        pushNotification.notifyUser(notifications);
        smsNotification.notifyUser(notifications);
        emailNotification.notifyUser(notifications);
    }
}
