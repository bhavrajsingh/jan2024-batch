package package1;

public class arithmetic 
{
 public int sum(int a,int b) //(10+2)(10-2)
 {
	 int c;
	 c=a+b;
	 System.out.println("sum="+c);
	 return c;
 }
 public int sub(int d,int e)
 {
	 int f;
	 f=d-e;
	 System.out.println("sub="+f);
	 return f;
 }
 public void mul(int g,int h)
 {
	 int i;
	 i=g*h;
	 System.out.println("mul="+i);
 }
 public static void main(String[] args) {
	arithmetic ob=new arithmetic();
	int sumresult=ob.sum(10,2);
	int subresult=ob.sub(10, 2);
	ob.mul(sumresult, subresult);
}
}
