package pollymorphisam;

public class Method_overloading 
{
public static void main(String[] args) 
{
  //declaring multiple method with same method name but diffrent argument
	Method_overloading m=new Method_overloading ();
	m.add(2, 0);
	m.add(2, 3, 4);
}

public void add(int a,int b)
{
	System.out.println(a+b);
}

public void add(int a,int b,int c)
{
	System.out.println(a+b+c);
}
}
