package accessspecifier;

public class Sample6_public
{
public int c;    //variable declaration
public int d;

public Sample6_public()  //constructor
{
	c=6;
	d=7;
}

public void m6()
{
	System.out.println(c);
}

public void m7()
{
	System.out.println(d);
}

public static void main(String[] args) 
{
Sample6_public s6=new Sample6_public();
s6.m6();
s6.m7();
System.out.println(s6.c);
System.out.println(s6.d);
}
}
