package pollymorphisam;

public class Method_overridding 
{
public static void main(String[] args) 
{
Father f=new Father();
f.car();
f.home();
f.money();

System.out.println("------");

Son s=new Son();
s.car();
s.home();
s.money();
}
}
