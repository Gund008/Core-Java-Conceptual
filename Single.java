import java.lang.*;


class Single
{
    public static void main(String arg[])
    {
        Derived bobj=new Derived();
        System.out.println(bobj.i);
        System.out.println(bobj.k);
        bobj.fun();
        bobj.gun();
    }
}

class Base
{
    public int i;
    public int j;

   public Base()
   {
     System.out.println("Inside base constructor");
   }
   public void fun()
    {
        System.out.println("Base fun");
    }
   public void gun()
   {
    System.out.println("Base gun");
   }
}
class Derived extends Base
{
    public int i;
    public int k;

    public Derived()
    {
        System.out.println("Inside derived");
    }
    public void gun()
    {
        System.out.println("Inside gun");
    }
}
