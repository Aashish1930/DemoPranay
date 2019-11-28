//........FUNCTION OVERLOADING EXAMPLE FUNCTION NAME IS SAME BUT PARAMETER ARE DIFFRENT //......
public class Functionoverloading {
	public static int a=30;
	public static int b=50;
	
	public static void addnumbers()
	{
		int c=a+b;
			System.out.println("addition "  +c);
			
	}
	public static void addnumbers(int r,int s)
	{
		int add=r+s;
		System.out.println("addition " +add);
		
	}
	
	public static void main (String[] args)
	{
		addnumbers();
		addnumbers(50,60);
	}
}
