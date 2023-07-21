package constructor;

public class Sample2_user_defined 
{
	int num1; //................//declation of variable
	int num2;
	
	Sample2_user_defined()
	{
	num1=23;  //................... //initialization
	num2=23;
	}
	
public static void main(String[] args)
{
	Sample2_user_defined s3=new Sample2_user_defined(); //Create object
	s3.add();
	s3.mult();
}
public void add()
{
	System.out.println(num1+num2);    //user defined call in same class
}

public void mult()
{
	System.out.println(num1*num2);
}

}
