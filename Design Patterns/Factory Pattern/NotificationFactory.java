public class NotificationFactory {
    public Notification createNotification(String notificationType){
        if(notificationType.equalsIgnoreCase("sms")){
            return new SMSNotification();
        }
        else if(notificationType.equalsIgnoreCase("email")){
            return new PushNotification();
        }
        else if(notificationType.equalsIgnoreCase("push")){
            return new PushNotification();
        }
        else return null;
    }
    
}
