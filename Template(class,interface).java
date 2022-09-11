import java.lang.*;

class Demo
{
    public  int a;
    public int b;

    public Demo(int A,int B)
    {
       this.a=A;
       this.b=B;
    }
    public void fun()
    {
        //Business logic
    }
    public void fun()
    {
       //Business logic
    }
}
class Derived extends Demo       //inheritance
{
    public int a;
    public int b;

    public void gun()
    {

    }
    public void fun()
    {

    }
}
//Class complete charactristics and method
///////////////////////////////////////////////////////////////////////

interface Demo
{
    public int A=10;
    public int B=11;

    public void fun();
    public void gun();
}

class Interface implements Demo
{
    public int a;
    public int b;

    public Interface()
    {
        this.a=11;
        this.b=12;
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
