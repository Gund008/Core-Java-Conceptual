import java.lang.*;
class Super
{ 
    public static void main(String arg[])
    {
        Derived dobj=new Derived();
        dobj.gun();
    }

}
/////////////////////////////////////////////////////////////
class Base
{
    public int i;
    public int j;

    public Base(int A,int B)
    {
         this.i=A;
         this.j=B;
    }
    public void fun()
    {
        System.out.println("Inside fun");
    }
}

class Derived extends Base
{ 
   public int k;
   public int j;
   public Derived()
   {
    super(11,21);  //super keyword used immegitely Access data from Parent class
    this.k=2;
    this.j=3;
   }
 public void gun()
 {
    System.out.println(super.i);
    System.out.println(super.j);
    super.fun();
 }
}

