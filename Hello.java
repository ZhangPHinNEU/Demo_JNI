
public class Hello
{
    static
    {  
        System.load(System.getProperty("user.dir")+"//sayHello.dll");
        
    }
     
    public static native void sayHello();
     
    @SuppressWarnings("static-access")
    public static void main(String[] args)
    {
        new Hello().sayHello();
    }

}
