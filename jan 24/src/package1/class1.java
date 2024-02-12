package package1;

public class class1 //class creation
{
int abc;
public void bhavraj() //user defined method
{
System.out.println("welcome");
}
public static void main(String[] args)  //main method
{
	class1 ob=new class1(); //object creation
	ob.bhavraj();
	ob.abc=10;
	System.out.println("value of abc="+ob.abc);
	ob.abc=99;
	System.out.println("value of abc="+ob.abc);
}
}