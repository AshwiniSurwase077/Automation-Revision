package Arrays;

public class Sample3_single_reverse
{
public static void main(String[] args)
{
	// 
int [] ar=new int[4];  //declaration

ar[0]=1;   //initialization
ar[1]=2;
ar[2]=3;
ar[3]=4;

System.out.println(ar[1]);
System.out.println(ar.length);

for(int i=ar.length-1; i>=0; i--)
{
	System.out.println(ar[i]);
}

}
}
