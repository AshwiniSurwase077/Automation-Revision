package constructor;

public class Sample3_with_parameter
{ //method overloading-using constructor name with same class name with multiple method
	int num1;
	int num2;
	
	Sample3_with_parameter(int a,int b)
	{
		num1=a;
		num2=b;
	}
public void add()
{
	System.out.println(num1+num2);
}
public static void main(String[] args) 
{
	Sample3_with_parameter s4=new Sample3_with_parameter(10,20); //with parameter
	s4.add();
	
	System.out.println("----------");
	
	Sample3_with_parameter s5=new Sample3_with_parameter(130,20); //with parameter
	s5.add();
	
	System.out.println("------");
	
	Sample3_with_parameter s6=new Sample3_with_parameter(100,20); //with parameter
	s6.add();
}
}
