import java.lang.*;


class Final
    {
        public static void main(String arg[])
        {
            Demo obj1=new Demo();
            obj1.fun();
            System.out.println(obj1.i);
            System.out.println(obj1.j);
            System.out.println(obj1.k);
        
        

            Demo obj2=new Demo(10,11);
            obj2.fun();
            System.out.println(obj2.i);
            System.out.println(obj2.j);
            System.out.println(obj2.k);

       }
    }

class Demo
{
    public int i;
    public final int j;
    public final int k=10;

    public Demo()
    {
        this.i=13;
        this.j=14;
    }
    public Demo(int i,int k)
    {
        this.i=i;
        this.j=k;
    }
    public void fun()
    {
        i++;
        //j++;  //final,read only
       // k++;
    }
}
    