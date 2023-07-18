package variable;

public class Methods 
{
public static void main(String[] args) 
{
	m1();
	Method1.m2();
	
	Methods s2=new Methods();
	s2.m3();
	
	Method1 s4=new Method1();
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
