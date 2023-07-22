package inheritance;

public class Sinle_level_inherutance 
{
	public static void main(String[] args) 
	{  //sub class access the propertise of super class
		Son s=new Son();
		s.bike();
		s.car();
		System.out.println("-----");
		s.money();
		s.home();
		s.farm();
		s.gold();
	}
}
