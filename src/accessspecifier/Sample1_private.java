package accessspecifier;

public class Sample1_private 
{
private  int a;
 
 private Sample1_private()
{
	a=10;
}


public static void main(String[] args) 
{
	Sample1_private s=new Sample1_private();
      s.m1();
}

public void m1()
{
	System.out.println(a);
}
}
