import java.lang.*;

class Exception3 
{
    public static void main(String args[])throws  ArithmeticException 
    {
        try{
        System.out.println("Open files");
        int n=args.length;
        System.out.println("n="+n);
        int a=45/n;
        System.out.println("a=+a");

        System.out.println("close files");
        }
      finally
        {
            System.out.println("login page");
        }
    }
}