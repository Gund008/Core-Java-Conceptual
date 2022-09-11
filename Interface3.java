import java.lang.*;

class Interface1
{
    public static void main(String arg[])
    {
        Demo dobj=new Demo();
        System.out.println(dobj.a);
        System.out.println(dobj.b);
        dobj.fun();
        dobj.gun();
        dobj.run();
    }
}

interface Base
{
    public int A=1;
    public int B=2;
    public void fun();
    public void gun();
}

interface Hello extends Base
{
    public int x=11;
    public int y=12;
    
    public void run();
    public void gun();
}

class Demo implements Hello
{
    public int a;
    public int b;

    public void run()
    {
        System.out.println("Inside run");
    }
    public void gun()
    {
        System.out.println("inside gun");
    }
    public void fun()
    {
      System.out.println("Inside gun");
    }

}