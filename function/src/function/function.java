package function;
import java.util.Scanner;
public class function {
	
	public static void printMyName(String name) {
		
		System.out.println(name);
		return;
	} 
	
	public static int hereIsMyAge(int age) {
		System.out.println(2024-age);
		return age;
		}
	
	
	public static int theSum(int x , int z) {
		int sum = x*z;
		System.out.println("product of two numbers is : " + sum);
		return sum;
	}  
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sd= new Scanner(System.in);
		System.out.println("ENTER YOUR NAME");
		String name = sd.next();
		printMyName(name);
		
		
		Scanner sf= new Scanner(System.in);
		System.out.println("ENTER YOUR AGE");
		int age =sf.nextInt();
		System.out.println("HERE IS THE YEAR IN WHICH YOU WAS BORN");
		hereIsMyAge(age);
		
		Scanner sk= new Scanner(System.in);
		System.out.println("ENTER VALUE OF x");

		int x=sk.nextInt();
		System.out.println("ENTER VALUE OF y");
		int z=sk.nextInt();
	    theSum(x,z);
		
	    Scanner sz = new Scanner(System.in);
		System.out.println("ENTER NUMBER");

		int V=sz.nextInt();
		System.out.println("FACTORIAL OF A NUMBER IS : ");
	    factorial(V);
	  
	    
	}

	 
	public static void factorial(int V) {
		if (V<0) {
			System.out.println("INVALID");
			return;
		} 
		int number =1;
		for(int d=V; d>=1;d--) {
			number= number*d;
		} System.out.println(number);
		return;
	}
	
	
	
	
	
	
	
	
}
