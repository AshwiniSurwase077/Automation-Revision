package String_class_methods;

public class Sample3 
{
public static void main(String[] args) 
{
String s1=" mohan";
String s2="hello, universe";
String s3="my name is cutty,cutty";
String s4="ab";
String s5="ABCDE";
String s6="a,b,c,d,e";
String s7="abcde";
String s8=" ";

System.out.println(s2.length());
System.out.println(s1.charAt(4));
System.out.println(s3.substring(3,6));
System.out.println(s4.concat("cd"));
System.out.println(s4+s5);
System.out.println(s1.indexOf(0));   //taking character
System.out.println(s3.indexOf("is"));
System.out.println(s3.lastIndexOf('y'));
System.out.println(s3.lastIndexOf("cutty"));
System.out.println(s3.startsWith("my"));
System.out.println(s3.endsWith("cutty"));
System.out.println(s5.toLowerCase());
System.out.println(s4.toUpperCase());
System.out.println(s1.trim());
System.out.println(s3.replace("cutty","preety"));
System.out.println(s6.split(","));
System.out.println(s8.isEmpty());
System.out.println(s5.equals(s7));
System.out.println(s5.equalsIgnoreCase(s7));


}
}
