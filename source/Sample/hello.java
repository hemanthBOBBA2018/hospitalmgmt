public class hello
{
	public static void main( String str[]) {
		System.out.println("welcome to java");
		System.out.println("thanks for supporting");
		main("Anil Dhawan");
		int result = main(100,250);
		System.out.println("the sum of 2 numbers" + result);
		
	}
	
	public static int main(int i, int j)
	{
		return (i+j);
	}
	
	public static void main(String str1)
	{
		System.out.println("Hello brother I am in 2nd main");
		System.out.println(str1);
	}
	
}