package control_statement;

public class Example5_Nested_if 
{
public static void main(String[] args) 
{
	int PEM=350;
	int MEM=850;
	
	if(PEM>=300)
	{
		System.out.println("ELIGIBLE FOR MAIN EXAM");
		if(MEM>=800)
		{
			System.out.println("ELIGIBLE FOR INTERVIEW");
		}
		else
		{
			System.out.println("NOT ELIGIBLE FOR INTERVIEW");
		}
	}
	else
	{
		System.out.println("NOT ELEIGIBLE FOR MAIN EXAM");
	}
	
}
}
