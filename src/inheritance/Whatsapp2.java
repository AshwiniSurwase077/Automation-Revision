package inheritance;

public class Whatsapp2 extends Whatsapp
{
	public void video_call()
	{
		System.out.println("video_call");
	}
	
	public static void main(String[] args) 
	{
	Whatsapp2 W2=new Whatsapp2();
	W2.video_call();
	W2.chat();
	}
}
