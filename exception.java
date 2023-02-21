import java.util.Scanner;
import java.io.*;
class exception
{
	public static void main(String[] args)throws ArithmeticException
	{
		try
		{
			int a,b,c;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter first Number");
			a=sc.nextInt();
			System.out.println("Enter second Number");
			b=sc.nextInt();
			c=a/b;
			System.out.println("quotient="+c);			
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("End of operation");
		}
	}
}
