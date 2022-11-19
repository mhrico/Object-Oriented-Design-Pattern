public class Singleton
{
  private static Singleton object = null;
  public String text;
  
  private Singleton(){
    text = "This is a string";
  }

  public static Singleton getInstance()
  {
    if(object == null) object = new Singleton();

    return object;
  }
}