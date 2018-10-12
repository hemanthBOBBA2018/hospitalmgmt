//Program to implement r = v/i 

public class Resistance {
	public static void main ( String args [])
	{
		int voltage = 50;
		int current = 10;
		int resistance = 0;
		
		if ( current != 0 )
			 resistance = voltage/current;
		
		if(resistance != 0)
			System.out.print("The resistance value is :" +resistance);
		
		
	}
}