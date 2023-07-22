package inheritance;

public class Heirachical_inheritance 
{
public static void main(String[] args) 
{
	Whatsapp1 W1=new Whatsapp1();
	W1.audio_call();
	W1.chat();
	System.out.println("-----");
	
	Whatsapp2 W2=new Whatsapp2();
	W2.video_call();
	W2.chat();
	System.out.println("------");
	
	Whatsapp3 W3=new Whatsapp3();
	W3.community();
	W3.chat();
}
}
