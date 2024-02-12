package package1;

public class student {
int rollnumber,age;
public void display1()
{
	System.out.println("welcome to all of you");
}
public void display2()
{
	System.out.println("automation is very easy");
}
public static void main(String[] args) {
	student ob=new student();
	ob.display1();
	ob.display2();
	ob.age=30;
	System.out.println("age="+ob.age);
	ob.rollnumber=12;
	System.out.println("roll no. ="+ob.rollnumber);
}
}
