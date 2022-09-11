import java.lang.*;

class Finalmethod
{
    public static void main(String arg[])
    {
       Derived dobj=new Derived();
       dobj.fun();
       dobj.gun();

    }
}
class Base
{
    public int a;
    public int b;

    public void fun()
    {
        System.out.println("Inside fun");
    }
    public final void gun()
    {
        System.out.println("Inside gun");
    }
}

class Derived extends Base
{
    public int X;

    public void fun()  //Allow(overriding)
    {
        System.out.println("derived fun");
    }
    /*
    public final void gun()
    {
        System.out.println("Inside gun");
    }
    */

}