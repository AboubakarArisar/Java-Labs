import java.util.Scanner;
class Employee
{
    String name[]= new String[3];
    String Address[]= new String[3];
    String YearOfJoining[]= new String[3];
    void data()
    {
        System.out.println("Name\t\tYear of Joining\t\tAddress");
        for(int i=0;i<3;i++)
        {
            System.out.println(name[i]+"\t\t"+YearOfJoining[i]+"\t\t"+Address[i]);
        }
    }
}
public class Employeedata
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String name[]=new String[3];

        String address[]= new String[3];;
        String yearofjoining[]= new String[3];
        Employee emp=new Employee();
        for(int i=0;i<3;i++)
        {
            System.out.print("Enter employee"+(i+1)+" name : ");
            name[i]=sc.next();
            emp.name[i] = name[i];
            System.out.print("Enter employee"+(i+1)+" address : ");
            address[i]=sc.next();
            emp.Address[i] = address[i];
            System.out.print("Enter employee"+(i+1)+" year of joining : ");
            yearofjoining[i]=sc.next();
            emp.YearOfJoining[i] = yearofjoining[i];
            System.out.println();
        }
        emp.data();
    }
}
