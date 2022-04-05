class Math
{
public void add(int a, int b)		
{
	System.out.println(a+b);
}

public void add(float a, float b)	
{
	System.out.println(a+b);
}
public void add(String a, String b)	
{
	System.out.println(a+b);
}
}

class Overload
{
public static void main(String... ar)
{
	Math ob = new Math();
	ob.add(6,8);
	ob.add(5.6f,1.1f);
	ob.add("html","css");
}
}
