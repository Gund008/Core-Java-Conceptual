import java.lang.*;


//JVM run start run
class Class 
{
    public static void main(String arg[])
    {
        Demo obj=new Demo(11,21);  //explicitely call constructor
        System.out.println(obj.i); //11
        System.out.println(obj.j); //20
        obj.fun();
        obj.gun();

    }
}

class Demo
{
    public int i;  //chractristics
    public int j;

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
    }
    public void gun()
    {
      System.out.println("Inside gun\n");
    }
}

