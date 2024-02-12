package package1;

public class arithmetic3 {
	//((((10/2)-2)+2)-2)/2)
public float div(float a,int b)
{
	float c=a/b;
	return c;
}
public float sub1(float c,int d)
{
	float e=c-d;
	return e;
}
public float sum(float e,int f)
{
	float g=e+f;
	return g;
}

public static void main(String[] args)
{
	arithmetic3 ob= new arithmetic3();
	float div1=ob.div(10, 2);
	float sub1=ob.sub1(div1, 2);
	float sum=ob.sum(sub1, 2);
	float sub2=ob.sub1(sum, 2);
	float div2=ob.div(sub2, 2);
	System.out.println("final vlue="+div2);
}
}
