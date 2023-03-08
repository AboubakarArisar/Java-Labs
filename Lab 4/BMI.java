import java.util.Scanner;
class weight
{
    static double weight;
    static double height;
    weight(double x,double y)
    {
        weight = x;
        height = y;
    }
    public static double calculate(double x,double y)
    {
        weight = x;
        height = y;
        return (weight/(Math.pow(height,2)))*703;
    }
    public static String findStatus(double bmi)
    {
        if(bmi<18.5)
            return "Underweight";
        else if(bmi>=18.5 && bmi<=24.9)
            return "Normal";
        else if(bmi>=25.0 && bmi<=29.9)
            return "Oveweight";
        else
            return "Obese";

    }

}
public class BMI
{
    public static void main(String[] args)
    {
        weight w = new weight(48.6,8.7);
        System.out.print("Body mass index is  : " +w.calculate(w.weight,w.height));
        System.out.println();
        System.out.println("Status is : " +w.findStatus(w.calculate(w.weight,w.height)));
    }
}
