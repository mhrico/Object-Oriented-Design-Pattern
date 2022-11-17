public class Main{
    public static void main(String[] args) {

        Singleton object1 = Singleton.getInstance();
        System.out.println("Object 1 hash code: " + object1.hashCode());

        Singleton object2 = Singleton.getInstance();
        System.out.println("Object 2 hash code: " + object2.hashCode());

        System.out.println(object1.text);
    }
}