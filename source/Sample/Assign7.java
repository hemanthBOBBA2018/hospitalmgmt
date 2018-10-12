public class Assign7{
	public static void main (String args[])
	{
		double avg= 17.45;
		
		if ( avg >=0 && avg <= 39.00)
			System.out.println("Fails: " +avg );
		if ( avg >= 40.00 && avg <= 49.00)
			System.out.println("Pass: " +avg );
		if ( avg >=50.00 && avg <= 59.00)
			System.out.println("Second class: " +avg );
		if  (avg >=60.00 && avg <= 80.00)
			System.out.println("First class: " +avg );
		if (avg >=81.00 && avg <= 100)
			System.out.println("Distinction: " +avg );
	}
}