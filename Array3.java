import java.io.*;

/*write a program which Accept the marks of a student into
the keyboard and finds total marks and percentage
*/
class Array3
{
public static void main(String arg[])throws IOException 
{    
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("How many subjects");
    //int n=Integer.nextInt();
    //bufferedReader class Accept input only String formate
    
    int n=Integer.parseInt(br.readLine());
    
    int  []marks=new int[n];

    for(int i=0;i<n;i++)
    {
        System.out.println("Enter marks:");
        marks[i]=Integer.parseInt(br.readLine());
    }

    int total=0;
    for(int i=0;i<n;i++)
    total+=marks[i]; //total=total+marks

    System.out.println("Total marks:"+total);
    float percent=(float)total/n;
    System.out.println("percentage="+percent);
}
}