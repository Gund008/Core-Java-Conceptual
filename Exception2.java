import java.lang.*;

class Exception2
{
    public static void main(String args[])
    {
        try{
        System.out.println("Open files");
        int n=args.length;
        System.out.println("n="+n);
        int a=45/n;
        System.out.println("a=+a");
        
        int b[]={10,20,30};
        b[50]=100;
        }
        catch(ArithmeticException obj)
        {
            System.out.println(obj);
            System.out.println("Please pass data while running is programm");
        }
        finally
        {
            System.out.println("close files");
        }
    }

}