package accessspecifier;

public class Sample4_protected 
{
protected int a;

protected Sample4_protected()
{
	a=10;
}

protected void m3()
{
	System.out.println(a);
}

public static void main(String[] args) 
{
Sample4_protected s3=new Sample4_protected();
s3.m3();
System.out.println(s3.a);
}

}
