public class PushNotification implements Notification {

    public void notifyUser(String[] notifications) {
        for(String notification: notifications) {
            System.out.println("Push: " + notification);
        }
    }
}
