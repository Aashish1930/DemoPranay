// find small number using function overloading home work //
public class Smallnum 
{
	public static int a=100;
	public static int b=150;
	
	public static void checknumber()
	{	
		if(a>b)
		  {
			System.out.println(" b is smallest number : " +b);
		  }
		else if(b>a)
		  {
			System.out.println(" a is smallest number : " +a);
		  }
		if (a==b)
		  {	
			System.out.println(" equal number");
		  }
	}
	public static void checknumber(float x,float y)
	{
		if(x>y)
		{
			System.out.println("y is smallestj number  :" +y);
		}
		else if(y>x)
		{
			System.out.println(" x is smallest number : " +x);
		}
			if (x==y)
		{
			System.out.println(" equal number : ");
		}	
	}
	public static void main (String[] args)
	{
		
		checknumber();
		checknumber(9.5F,5.0F); 
    }
}
