//Program to determine the highest and lowest number

public class Assign6{
	public static void main(String args[]) {
		int a = 2 , b = 1, c = 13, d=5, e=0;
		
		if ( a > b && a > c && a > d && a > e)
			System.out.println("A is greatest" +a);
		else if ( b > a && b > c && b > d && b > e)
			System.out.println("B is greatest" +b);
		else if ( c > a && c > b && c > d && c > e)
			System.out.println("C is greatest" +c);
		else if ( d > a && d > b && d > c && d > e)
			System.out.println("D is greatest" +d);
		else 
			System.out.println("E is greatest" +e);
		
		
		if ( a < b && a < c && a < d && a < e)
			System.out.println("A is Lowest" +a);
		else if ( b < a && b < c && b < d && b < e)
			System.out.println("B is Lowest" +b);
		else if ( c < a && c < b && c <d && c < e)
			System.out.println("C is Lowest" +c);
		else if ( d < a && d < b && d < c && d < e)
			System.out.println("D is Lowest" +d);
		else 
			System.out.println("E is Lowest" +e);
		
	}
}
