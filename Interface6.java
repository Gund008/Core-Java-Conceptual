import java .lang.*;

class Interface6
{
    public static void main(String arg[])
    {
        Derived dobj=new Derived();
        dobj.fun();
        dobj.gun();
        dobj.run();
        dobj.mun();
    }
}
class Hello
{
    public int x;
    public int y;

    public Hello()
    {
         this.x=11;
         this.y=12;
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
interface Demo
{
     public static final int a=10;
     int b=12;
     
     public void run();
}
interface Base
{
    public int i=33;
    public int j=44;

    public void mun();
}
class Derived extends Hello implements Demo, Base
{
     public int k;
     public int l;

     public Derived()
     {
        this.k=0;
        this.l=0;
     }
     public void run()
     {
        System.out.println("Inside run");
     }
     public void mun()
     {
        System.out.println("Inside mun");
     }
}
