import java.lang.*;


class Abstarct
{
   Demo dobj=new Demo();  //Demo dobj=new Demo();

  Hello hobj=new Hello();
    hobj.fun();
    hobj.gun();
}

abstract class Demo
{
    public int i,j;
    public Demo()
    {
        System.out.println("Demo constructor");
    }
    public void fun()
    {
        System.out.println(" Demo fun");
    }
    public abstract void gun(); //Abstarct method
}

class Hello extends Demo
{
    public int x,y;
    
    public void gun()
    {
        System.out.println("Hello Gun");
    }
}

