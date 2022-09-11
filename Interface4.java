import java.lang.*;

class Interface4
{
    public static void main(String arg[])
    {
        Base bobj=new Base(11,22);
        bobj.fun();
        bobj.gun();
    }
}
interface Demo
{
   public int a=11;
   public int b=2;

   public void fun();
}
interface Hello
{
    public int b=11;
    public int v=99;
    
    public void gun();
}
class Base implements Demo,Hello
{
   public int x;
   public int y;
   public Base(int a,int b)
   {
     this.x=a;
     this.y=b;
     System.out.println("Inside constructor");
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