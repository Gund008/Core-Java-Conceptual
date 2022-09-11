import java.lang.*;


class Virtual
{
    public static void main(String arg[])
    {
        /*
        Base bobj=new Base();
        bobj.fun();
        bobj.gun();
        bobj.sun();
        */
        Derived dobj=new Derived();
        dobj.fun(); //derived
        dobj.sun(); //derived
        dobj.gun();//base
        dobj.run();//derived

    }
}
class Base
{
    public int i;
    public int j;

    public void fun()
    {
      System.out.println("Inside fun");
    }
    public void gun()  //defination
    {
      System.out.println("Inside gun");
    }
    public void sun()
    {
       System.out.println("Inside sun");
    }
}
class Derived extends Base
{
    public int x,y;
    public void fun()  //overriding
    {
        System.out.println("Derived fun");
    }
    public void sun()  //overriding
    {
        System.out.println("Derived sun");
    }
    public void run()  //defination
    {
        System.out.println("derived run");
    }
}
