import java.lang.*;


class Overloading
{
    public static void main(String arg[])
    {
        Demo dobj=new Demo();
        int ret=0;

        ret=dobj.add(1,2);
        System.out.println("Addtion is:"+ret);

        ret=dobj.add(1,2,3);
        System.out.println("Addtion is:"+ret);

        ret=dobj.add(1,2,3,4);
        System.out.println("Addtion is:"+ret);
    }
}
class Demo
{
    public int  add(int a,int b)
    {
        return a+b;
    }
    public int add(int a,int b,int c)
    {
        return a+b+c;
    }
    public int add(int a,int b,int c,int d)
    {
        return a+b+c+d;
    }
}

