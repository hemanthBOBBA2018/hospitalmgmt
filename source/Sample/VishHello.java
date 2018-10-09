public class VishHello
{
	public static void main(String []str) {
		System.out.println("welcome to Java Programming ");
		System.out.println("All the best Hemanth !!");
		System.out.println(100+45.34*6.22/189.44);
		System.out.println('G');
		System.out.println("===============================================");
		main("Hemanth Kumar");  // calling or invoking 
		int result = main(100,150);
		System.out.println(result);
		System.out.println("the sum of 2 numbers is " + result);
		System.out.println("===============================================");
		int age = 10;
		String name = "Ram";
		System.out.println(name + " is "+ age +" years old");
		
	}
	public static void main(String str1) {
		System.out.println("hello brother I am in main taking single String arg");
		System.out.println(str1);		
	}
	
	public static int main(int i,int j) {
		return i+j;
	}
	
}