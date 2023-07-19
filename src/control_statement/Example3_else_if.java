package control_statement;

public class Example3_else_if
{
public static void main(String[] args) 
{
     int marks=45;

     if(marks>=65)
     {
    	 System.out.println("DISTINCTION");
     }
     else if(marks<=64 & marks>=60)
     {
    	 System.out.println("1st CLASS");
     }
     else if(marks>=59 & marks<=50)
     {
    	 System.out.println("2nd CLASS");
     }
     else if(marks<=49 & marks>=35)
     {
    	 System.out.println("3rd CLASS");
     }
}
}
