package inheritance;

public class Father extends Grandfather
{
public void money()
{
	System.out.println("money");
}

public void home()
{
	System.out.println("home");
}

public void farm()
{
	System.out.println("farm");
}

public void gold()
{
	System.out.println("gold");
}


public static void main(String[] args) 
{
Father f=new Father();
f.money();
f.farm();
f.gold();
f.home();
f.Ogold();
f.Tradition();
}
}
