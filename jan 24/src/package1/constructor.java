package package1;

public class constructor {
public constructor() {
	this(4,0,9);
	System.out.println("default constructor");
}
public constructor(int a)
{
	this();
	System.out.println("one parametrized");
}
public constructor(int a,int b)
{
	this(2);
	System.out.println("2 parameterized");
}
public constructor(int a,int b,int c)
{
	
	System.out.println("3 parameterized");
	
}
public constructor(int a,int b,int c,int d)
{
this(8,9);
	
	System.out.println("4 parameterized");
}
public static void main(String[] args) {
	constructor ob=new constructor(2,3,4,8);
	
}
}
