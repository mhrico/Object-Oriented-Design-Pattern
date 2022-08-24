public class Main{
    public static void main(String[] args) {
        Singleton object = Singleton.getInstance();
        System.out.println(object.text);
    }
}