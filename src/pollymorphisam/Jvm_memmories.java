package pollymorphisam;

public class Jvm_memmories 
{
    public static void main(String[] args)  //stack
   {
	
   }

   public static void m1()           //declaration      //static pool area
   {
	System.out.println("method m1");    //method area
   }

   public void m2()              // declaration store in    // heap area
  {
	System.out.println("method m2");   //method area
   } 
  }
