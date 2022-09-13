import java.lang.*;

class Exception 
{
    public static void main(String args[])
    {
        try{
        System.out.println("Open files");
        int n=args.length;
        System.out.println("n="+n);
        int a=45/n;
        System.out.println("a=+a");

        System.out.println("close files");
        }
        catch(ArithmeticException obj)
        {
            System.out.println(obj);
        }
    }
}