public class Main {
    public static void main(String[] args) {
        User rico = new User("Rico");
        User suvo = new User("Suvo");
        User jelane = new User("Jelane");

        rico.sendMessage("Hello");
        suvo.sendMessage("Hi");
        jelane.sendMessage("Byebye");
    }
}
