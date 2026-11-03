package Com.globalQuest.CoreJavaBasic.DataTypes;

import java.util.Scanner;
class Farmer
{
	double p;
	double t;
	double r;
	double si;
	void collectData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the principle:");
		p=sc.nextDouble();
		System.out.println("Enter the time:");
		t=sc.nextDouble();
		r=2.786;
	}
	void calculate()
	{
		si=(p*t*r)/100;
	}
	void display()
	{
		System.out.println("The simple Interest="+si);
	}
}
public class MainLanch {

	public static void main(String[] args) {
		Farmer f1=new Farmer();
		Farmer f2=new Farmer();
		System.out.println("Farmer -1:");
		f1.collectData();
		f1.calculate();
		f1.display();
		System.out.println("------------");
		System.out.println("Farmer - 2");
		f2.collectData();
		f2.calculate();
		f2.display();
		}
	}

