package Arrays;

public class Sample1_single_dimentional
{
public static void main(String[] args) 
{
String [] ar=new String[5];  //array declaration

ar[0]="vanshika";             //array initialization
ar[1]="vaaman";
ar[2]="Sanjay";
ar[3]="kevin";
ar[4]="vedant";

System.out.println(ar[0]);    //array usage using printing statement print specific array value
System.out.println(ar[3]);

for(int i=0; i<=4; i++)        //using for loop we can print all array
{
	System.out.println(ar[i]);
}
}
}
