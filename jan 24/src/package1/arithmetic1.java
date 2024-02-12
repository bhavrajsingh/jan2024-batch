package package1;

public class arithmetic1 {
//(((((10+2)+2)-2)*2)/2)
	public int sum(int a,int b, int c)
	{
	int d=a+b+c;
	return d;
	
}
public int sub(int d,int e )
{
	int g=d-e;
	return g;
}
public int mul(int g,int h)
{
	 h=g*h;
	return h;
}
public void div(int h,int i)
{
	 i=h/i;
	 System.out.println("total value="+i);
	
}
public static void main(String[] args) {
	arithmetic1 ob= new arithmetic1();
	int sumresult=ob.sum(10, 2, 2);
	int subresult=ob.sub(sumresult, 2);
	int mulresult=ob.mul(subresult, 2);
	ob.div(mulresult, 2);
}

}