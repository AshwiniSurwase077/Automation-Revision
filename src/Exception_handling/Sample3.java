package Exception_handling;

public class Sample3 
{
public static void main(String[] args) 
{
String s2="velocity";

///System.out.println(s2.charAt(8));


try
{
	System.out.println(s2.charAt(8));	
}
catch(ArrayIndexOutOfBoundsException e)
{
	System.out.println("ArrayIndexOutOfBounds Exception handled");
}
catch(NullPointerException e)
{
	System.out.println("nullpoiter Exception handled");
}
//catch(StringIndexOutOfBoundsException e)
//{
//	System.out.println("StringIndexOutOfBounds Exception handled");
//}
catch(Exception e)   //if we dont know which exception is there produced then we can use this exception
{
	e.printStackTrace();
	System.out.println("generic Exception handled");
}


System.out.println("hellow");
}
}