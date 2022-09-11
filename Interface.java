import java.lang.*;


class Interface
{
    public static void main(String arg[])
    {
        Interface1 iobj=new Interface1(11,21);
        System.out.println(iobj.a);
        System.out.println(iobj.b);
        iobj.fun();
        iobj.gun();
    }
}

//interface is a Blueprint of class
interface  Demo
{
     //public final static byDefault(chractristics)
    public int a=11;
    public static final int b=12;

    //public static(Abstract)
    public void fun();   
    public void gun();
};

class Interface1 implements Demo
{
    int a;
    int b;

   public Interface1(int A,int B)
   {
     this.a=A;
     this.b=B;
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







/*
//one class extend another class
class Base
{

}
class Derived extends Base
{

}
//////////////////////////////////////////////////////
//one class implements one interface
interface Demo
{

}
class Base implements Demo
{

}
////////////////////////////////////////////////////////
//one class implements one interface,and one interface extends one class
class Demo
{

}
interface Derived extends Demo
{

}
class Derived1 implements Derived
{

}
////////////////////////////////////////////////////////
//one class implements one or more interface
interface Demo
{

}
interface Hello
{

}
class Base implements Demo,Hello
{

}
/////////////////////////////////////////////////////////
//one class extends and implements another class
class Hello
{

}
interface Demo
{

}
class extends Hello implements Demo
{

}
*/