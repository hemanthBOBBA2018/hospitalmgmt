public class leapYear
{
	public static void main (String args [])
	{
		int year = 1500;
				
				if ( year % 4 == 0 && year %400 != 0)
					System.out.println("Its a leap year "+year);
				else if ( year % 400 == 0 && year % 4 != 0)
					System.out.println("Its a century leap year:" +year);
				else
					System.out.println("Its not a leap year:" +year);
		
	}
}