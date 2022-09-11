import java.lang.*;

class Base
{
    public int A;
    public int B;
    public Base()
    {
        this.A=11;
        this.B=12;
    }
    public void fun()
    {
      System.out.println("Inside fun");
    }
    public void gun()
    {
      System.out.println("Inside gun");
    }
}

class Hello extends Base
{
    public int x;
    public int y;
    
    public void run()
    {
        System.out.println("Inside run");
    }
    public void gun()
    {
         System.out.println("Inside gun");
    }
}
class Interface1
{
    public static void main(String arg[])
    {
        Hello hobj=new Hello();
        System.out.println(hobj.A);
        System.out.println(hobj.B);
        hobj.fun();
        hobj.gun();
        hobj.run();
    }
}