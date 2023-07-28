package Arrays;

import java.util.Arrays;

public class Sample4_sorting 
{
public static void main(String[] args) 
{
int [] ar=new int[5];

ar[0]=30;
ar[1]=90;
ar[2]=10;
ar[3]=40;
ar[4]=70;


//int [] ar={10,20,30,40};

System.out.println(ar.length);
for(int i=0; i<=ar.length-1; i++)
{
	System.out.println(ar[i]);
}
System.out.println("            ");

Arrays.sort(ar);

//System.out.println(ar.length);
for(int i=0; i<=ar.length-1; i++)
{
	System.out.println(ar[i]);
}

System.out.println("             ");

//System.out.println(ar.length);
for(int i=ar.length-1; i>=0; i--)
{
	System.out.println(ar[i]);
}
}
}
