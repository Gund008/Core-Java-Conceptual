import java.lang.*;

class Class1 
{
    public static void main(String arg[])
    {
        Demo obj=new Demo(11,21); 
        obj.fun();
        obj.gun();
    }
}
class Demo
{
    private int i;  //chractristics
    private int j;

    public Demo(int a,int b)  //constructor
    {
       this.i=a;
       this.j=b;
    }
    protected void Demo()    //finalise
    {
        System.gc();
    }
    public void fun()  //method
    {
      System.out.println("Inside fun\n");
      System.out.println(this.i);
      System.out.println(this.j);
    }
    public void gun()
    {
      System.out.println("Inside gun\n");
    }
}

