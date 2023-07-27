package Generalization;

public class Airtel implements Simcards
{

	public void sms()
	{
		System.out.println("SMS: 200");
	}
	
	public void call()
	{
		System.out.println("CALL: unlimited 28days");
	}
	
	public void data()
	{
		System.out.println("DATA: 2GB");
	}
	
	public void Hellotune()
	{
		System.out.println("Hellotune: free on wynk music");
	}
	
}
