package accessspecifier;

public class Sample2_Default
{
 int b=20;

 Sample2_Default()
{
	b=20;
}
void m2()
{
System.out.println(b);
}

public static void main(String[] args) 
{
Sample2_Default s2=new Sample2_Default();
s2.m2();
System.out.println(s2.b);
}

}
