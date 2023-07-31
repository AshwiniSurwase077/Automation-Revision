package Exception_handling;

public class Sample_1 
{
public static void main(String[] args) 
{
int []ar= {10,20,30,40};

try
{
	System.out.println(ar[5]);
}

catch(ArrayIndexOutOfBoundsException e)
{
	System.out.println("ArrayIndexOutOfBounds Exception handled");
}

System.out.println("hellow");
}
}
