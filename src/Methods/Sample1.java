package Methods;

public class Sample1 
{
	public static void main(String[] args) 
	{
		m1();
		Sample2.m2();
		
		Sample1 s2=new Sample1();
		s2.m3();
		
		Sample2 s4=new 	Sample2();
		s4.m4();
		
	}

	public static void  m1()
	{
		System.out.println("running static regular method in same class");
	}

	public void m3()
	{
		System.out.println("running non-static rgular method in same class");
	}
	

}
