public class SMSNotification implements Notification {

    public void notifyUser(String[] notifications) {
        for(String notification: notifications) {
            System.out.println("SMS: " + notification);
        }
    }
}
