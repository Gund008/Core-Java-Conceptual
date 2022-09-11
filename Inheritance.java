import java.lang.*;

class Inheritance
{
    static
    {
        System.out.println("Inside static block");
    }
     public static void main(String arg[])
     {
        System.out.println("Inside static block");
        Derived obj=new Derived();
        obj.fun();
        obj.fun(11);
        obj.gun();
        obj.sun();
     }
}
class Demo
{
   public int i;
   public int j;

   public Demo()
   {
    System.out.println("Inside base constructor");
   }
   public void fun()
   {
    System.out.println("Inside base fun");
   }
   public void fun(int x)
   {
    System.out.println("Inside base fun with argument");
   }
   public void gun()
   {
    System.out.println("Inside gun");
   }
}

class Derived extends Demo
{
    public int x;
    public int y;

    public Derived()
    {
        System.out.println("Inside derived constructor");
    }
    public void sun()
    {
        System.out.println("Inside derived sun");
    }
}
