package Generalization;

public class Vodafone implements Simcards
{

	public void sms()
	{
		System.out.println("SMS: 100");
	}
	
	public void call()
	{
		System.out.println("CALL: unlimited 24days");
	}
	
	public void data()
	{
	
	System.out.println("DATA: 1.5GB");
	}
	
	public void bingdata()
	{
		System.out.println("12am-6am unlimited data");
	}
	
	public void data_rollover()
	{
		System.out.println("weekend data rollover on saturday and sunday");
	}
	
	public void data_delight()
	{
		System.out.println("claim extra 2GB in a month");
	}
}
