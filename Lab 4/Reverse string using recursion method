import java.util.Scanner;
public class string
{
    public static void printReverse(String s) {
        if (s.length() == 0) {
            return;
        } else {
            printReverse(s.substring(1));
            System.out.print(s.charAt(0));
        }
    }

    public static void main(String[] args)
    {
        String str ="";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        str = sc.nextLine();
        System.out.print("String is : ");
        printReverse(str);
    }
}
