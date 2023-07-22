package inheritance;

public class Multilevel_inheritance 
{
public static void main(String[] args) 
{
	//[sub class access the peoperties of super class and 
	//   that super class access the propertise of another super class]
	Son s=new Son();
	s.bike();
	s.car();
	System.out.println("-----");
	s.gold();
	s.farm();
	s.home();
	s.money();
	System.out.println("---------");
	s.Ogold();
	s.Tradition();
}
}
