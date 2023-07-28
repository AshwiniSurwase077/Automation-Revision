package Arrays;

public class Sample6_multidimentional 
{
public static void main(String[] args) 
{
//int [] [] ar= new int[2][3];

//    0   1   2
//0   10  20  30
//1   40  50  60

//ar[0][0]=10;
//ar[0][1]=20;
//ar[0][2]=30;
//ar[1][0]=40;
//ar[1][1]=50;
//ar[1][2]=60;
	//============================================

int [] [] ar={{10,20,30} ,{40,50,60}};   ///declaration AND INItialization in single step

System.out.println(ar.length);
System.out.println(ar[1][2]);

for(int i=0; i<=1; i++)
{
	for(int j=0; j<=2; j++)
	{
		System.out.println(ar[i][j]+"");
	}
	System.out.println();
}





}
}
