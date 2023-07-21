package Types_of_Variable;

public class Example1_Global_and_local
{
	int a=30;         //global variable can inside class any method
	                  //Non_static global variable
	static int e=2;                  //we cant call non-static global varible directly in static/main method
	                  //object creation used to call nonstatic global variable in static/main method

	public void m1()
	{
		int b=10;       //local variable can call only inside method
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void m2()
	{
		int c=20;
		System.out.println(c);
		
	}
	
	public static void main(String[] args) 
	{
		Example1_Global_and_local s1=new Example1_Global_and_local();
		s1.m1();
		Example1_Global_and_local.m2();
		System.out.println(e);
	}
	
}
