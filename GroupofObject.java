import java.util.Scanner;
import java.lang.String;

class Employee
{
    public int id;
    public String name;

    public Employee(int i,String n)
    {
        id=i;
        name=n;
    }
    public void displaydata()
    {
        System.out.println(id+"\t"+name);
    }
}
public class GroupofObject 
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter id");
        int ino=sobj.nextInt();

        System.out.println("Enter name");
        String str=sobj.nextLine();

        Employee Arr[]=new Employee[5];

        for(int i=0;i<Arr.length;i++)
        {
            Arr[i]=new Employee(ino,str);  //call Constructor    
        }
        System.out.println("\nThe Employee data from array is");

        for(int i=0;i<Arr.length;i++)
        {
            Arr[i].displaydata();
        }
    }
}
