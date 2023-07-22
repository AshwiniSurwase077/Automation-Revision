package inheritance;

public class Son extends Father 
{
	public void bike()
	{
		System.out.println("Bike");
	}
	
	public void car()
	{
		System.out.println("car");
	}
	
	public static void main(String[] args) 
	{
	Son s=new Son();
	s.bike();
	s.car();s.farm();
	s.gold();
	s.farm();
	s.Ogold();
	s.Tradition();
	s.home();
	s.money();
	}

}
