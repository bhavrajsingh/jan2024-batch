package package1;

public class constructors {
public void m1()
{
	this.m5();
	System.out.println("default method");
}
public void m2()
{
	this.m1();
	System.out.println("one parametrized method");

}
public void m3()
{this.m2();
	System.out.println("two parametrized method");
}
public void m4()
{
	System.out.println("three parametrized method");
}
public void m5()
{
	this.m4();
	System.out.println("four parametrized method");

}
public static void main(String[] args) {
	constructors ob= new constructors();
	ob.m3();
}
}
