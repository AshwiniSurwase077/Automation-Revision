package Types_of_Variable;

public class Example2
{
	static int x=10;  //static global variable
	                 //we can can directly in main method 
	//int x=10;    //we cant call nonstatic global variable directly in main method

public static void main(String[] args) 
{
	m3();     //........................call static global variable in static method
	Example2 s4=new Example2(); //......call non-static global variable in static method(object)
	s4.m4();
	
	Example3.m5();  //..................call static global variable from diffrent class
	Example3 s6=new Example3();  //.....call non-static global variable from diffrent class
	s6.m6();
	
}

public static void m3()
{ 
System.out.println(x);	  //we can call static global variable in static method
}

public void m4()
{ 
System.out.println(x);    //we can static global in non-static method
}


}
