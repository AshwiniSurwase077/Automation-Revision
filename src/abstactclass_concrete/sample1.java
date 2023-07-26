package abstactclass_concrete;

abstract public class sample1
{
	
	//abstact class-combo(incomplete + complete method)
public void m1()  //complete method
{
	System.out.println("m1 completed in abstact class");
}

public void m2()  //complete method
{
	System.out.println("m2 completed in abstract class");
}

abstract public void m3();  //only declared in class not provide defination

abstract public void m4();  //incomplete method

//public static void main(String[] args) 
//{
//Sample1() s1=new Sample1();
//s1.m2();
//s1.m1();  //we cant create object of abstract class
//}
}
