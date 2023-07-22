package inheritance;

public class Whatsapp1 extends Whatsapp
{
public void audio_call()
{
	System.out.println("audio_call");
}

public static void main(String[] args) 
{
Whatsapp1 W1=new Whatsapp1();
W1.audio_call();
W1.chat();
}
}
