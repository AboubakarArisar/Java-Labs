abstract class Marks
{
	abstract double getPercentage(double total, double obt);
}
class A extends Marks
{
	double obt;
	double m1,m2,m3;
	A(double m1,double m2, double m3)
	{
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
		obt = (m1+m2+m3);
	}

	
	double tot = 300;
	double getPercentage(double total,double obt)
	{
		return ((obt/tot)*100);
	}
}
class B extends Marks
{
	double obt ;
	double m1,m2,m3,m4;
	B(double m1,double m2, double m3,double m4)
	{
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
		this.m4 = m4;
		this.obt = (m1+m2+m3+m4);
	}
	
	double tot = 400;
	double getPercentage(double total,double obt)
	{
		return ((obt/tot)*100);
	}
}
public class last {
public static void main(String args[])
{
	A st1 = new A(78,96,90);
	System.out.println("Percentage of student 1 in 3 subjects is : "+st1.getPercentage(st1.tot, st1.obt)+"%");

	B st2 = new B(78,96,90,87);
	System.out.println("Percentage of student 1 in 4 subjects is : "+st2.getPercentage(st2.tot, st2.obt)+"%");
}
}
