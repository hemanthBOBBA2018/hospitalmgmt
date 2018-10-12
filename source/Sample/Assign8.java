//Program to check whether the given num is positive or negative

public class Assign8{
	public static void main ( String args[])
	{
	   double num = -23.3;
	   
	   if ( num < 0)
	   {
		   System.out.println("Its an negative number " +num);
		   num = num * -1;
		   System.out.println("After conversion " +num);
	   }
	   else if (num > 0)
		   System.out.println("Its an positive number " +num);
	}
}