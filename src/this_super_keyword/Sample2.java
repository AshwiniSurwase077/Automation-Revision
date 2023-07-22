package this_super_keyword;

public class Sample2 extends Sample1
{
	int a=20;  //global variable in same class
	
	public void m1()
	{
		int a=30;  //local variable in same class
		System.out.println(a);	//local variable in same class method{30}
		System.out.println(this.a); //global variable in same class
		System.out.println(super.a);  //global variable from super class
	}
public static void main(String[] args) 
{ 
	Sample2 s2=new Sample2();
	s2.m1();
}
}
