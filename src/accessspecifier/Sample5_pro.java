package accessspecifier;

public class Sample5_pro 
{
protected int b;

protected Sample5_pro()
{
	b=20;
}

protected void m5()
{
	System.out.println(b);
}

public static void main(String[] args) 
{
Sample5_pro s5=new Sample5_pro();
s5.m5();
System.out.println(s5.b);
System.out.println("--------");
Sample4_protected s3=new Sample4_protected();
s3.m3();
System.out.println(s3.a);
}
}
