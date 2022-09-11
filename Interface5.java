import java.lang.*;

class Interface5
{
    public static void main(String arg[])
    {
        Base obj=new Base();
        obj.fun();
        obj.gun();
    }
}

class Hello
{
    public int a;
    public int b;

    public Hello()
    {
        System.out.println("Hello");
    }
}
interface Demo
{
    public static final int a=11;
    public static final int b=22;

    public void fun();
    public void gun();
}
class Base extends Hello implements Demo
{
     public int x;
     public int y;
     public void fun()
     {
        System.out.println("Inside fun");
     }
     public void gun()
     {
        System.out.println("Inside gun");
     }
}