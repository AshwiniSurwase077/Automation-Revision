package constructor;

public class Sample1_Default
{ 
	//String name;
    //Sample1_Default()
//{
	//name="ashwini";
//}

public static void main(String[] args) 
{
	Sample1_Default s1=new Sample1_Default();
	
	s1.m1();	
	s1.m2();
}

public void m1()
{
	System.out.println("running nonstatic method default consturctor in same class");
}
public void m2()
{
	System.out.println("running m2 in same class");
}
}
