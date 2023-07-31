package String_class_methods;

public class Sample1 
{
public static void main(String[] args) 
{
String s1="abc";   //object creation without new keyword(constant pool area)

String s2=new String();  //object creation using new keyword(non constant pool area)

String s5="ab"; // string object is always final.we cant modifiy them
s5=s5+"cd";  //string object cant be chang
System.out.println(s5);



}
}
