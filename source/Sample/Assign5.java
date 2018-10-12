public class Assign5{
	public static void main (String args [])
	{
		char c = 'z';
		
		if (( c >= 'a' && c <= 'z') || (c >= 'A'&& c <= 'Z'))
			System.out.println("Its an alphabet:" +c);
		else
			System.out.println("Its not an alphabet:" +c);
		
		if( c >= 'a' && c <= 'z')
			System.out.println("Its an lower case alphabet:" +c);
		else if (c >= 'A'&& c <= 'Z')
			System.out.println("Its an Upper case alphabet:" +c);
	}
}