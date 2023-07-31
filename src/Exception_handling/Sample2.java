package Exception_handling;

public class Sample2
{
public static void main(String[] args) 
{
String s1="abcd";
//System.out.println(s1.charAt(8)); is to check exception

try
{
	System.out.println(s1.charAt(8));
}
catch(StringIndexOutOfBoundsException e)
{
	System.out.println("StringIndexOutOfBounds Exception handled");
}

System.out.println("hi");
}
}
