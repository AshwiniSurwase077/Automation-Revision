package Methods;

public class Sample3
{
	//method with Parameter
public static void main(String[] args) 
{
	add(10,20);
	add(20,40);
	
	Sample3 s3=new Sample3();
	s3.mult(4, 5);
	
	Sample4.convertNameToUpperCase("ashwini");
	Sample4 s4=new Sample4();
	s4.studentinfo("ashwini", 101, "ETC", 65.5f, 'A');
}

public static void add(int num1,int num2)
{
	System.out.println(num1+num2);
}
public void mult(int num1,int num2)
{
	System.out.println(num1*num2);
}

}
