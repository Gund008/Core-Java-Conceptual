import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class Program
{
    public static void main(String arg[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("How many String?");
        int n=Integer.parseInt(br.readLine());
        
        String str[]=new String[n];
      
        for(int i=0;i<n;i++)
        {
            Scanner sobj=new Scanner("System.in");
            System.out.println("Enter a string");
            str[i]=sobj.nextLine();
        }

        System.out.println("Enter the String Search");
        String search=sobj.nextLine();

        boolean found=false;

        for(int i=0;i<n;i++)
        {
            if(search.equalsIgnoreCase(str[i]))
            {
                System.out.println("Found at position:"+(i+1));
                found=true;
            }
        }
    }
}