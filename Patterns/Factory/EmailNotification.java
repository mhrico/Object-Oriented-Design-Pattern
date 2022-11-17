public class EmailNotification implements Notification {

    public void notifyUser(String[] notifications) {
        for(String notification: notifications) {
            System.out.println("Email: " + notification);
        }
    }
}
