package String_class_methods;

public class Sample2 
{
public static void main(String[] args) 
{
	String s1="Ashwini";
	//s1=s1.toUpperCase();
	String s2="ABcd";
	String s3="ab cd";
	String s4="velocity is my taining institute";
	
	System.out.println(s1.length());
	System.out.println(s1);
	System.out.println(s1.toUpperCase());
	
		
	System.out.println(s2.equals(s3));  //both are case diff
	System.out.println(s2.toLowerCase());
	System.out.println(s2.equalsIgnoreCase(s3));  //ignore case sensetive using
	System.out.println(s3.contains("ab"));
	System.out.println(s4.startsWith("v"));
	System.out.println("--");
	System.out.println(s4.startsWith("velocity"));
	System.out.println(s4.endsWith("e"));
	System.out.println(s4.endsWith("institute"));
	
}


}
