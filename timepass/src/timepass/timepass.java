package timepass;

import java.util.Scanner;

public class timepass {

	private static final int S = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("HOMEWORK PROBLEM 1");
		 
		int a = 5;
		int b = 5;
		for (int x=1; x<=a; x++) {
			for (int y=1; y<=b; y++) {
				System.out.print("*");
			}System.out.println();
		}
		
		System.out.println("HOMEWORK PROBLEM 2");
		int c = 4;
		int d = 5;
		for ( int z=1; z<=c; z++) {
			for (int j=1; j<=d; j++) {
			if (z==1 || z==c || j==1 ||  j==d) {
				System.out.print("+");
				} else {
					System.out.print(" ");
				}
		}  System.out.println();
		
		 	}
		
		System.out.println("HOMEWORK PROBLEM 3");
		
		int n=5;
		for (int y=0;y<n;y++) {
			for (int u=0;u<=y;u++) {
				System.out.print("%");
			}System.out.println();
		}
		
		System.out.println("HOMEWORK PROBLEM 4");
		
		int r=5;
		for (int k=r; k>=1;k--) {
			for(int f=0;f<k;f++) {
				System.out.print("%");
			}System.out.println();
		}
		
		
		System.out.println("HOMEWORK PROBLEM 5");
		
		System.out.println("CODE SMGH NI AARA HAIII");
		
		System.out.println("HOMEWORK PROBLEM 6");
		for (int u=5; u>=1; u--) {
			for(int N=1;N<=u;N++) {
				System.out.print(N);
			} System.out.println();
		}
		
		System.out.println("HOMEWORK PROBLEM 7");
		
		int k=6;
		int number = 1;
		for(int o=1;o<=k;o++) {
			for(int u=0;u<o;u++) {
				System.out.print(number+" ");
				number++;
			} System.out.println();
		}
		
		System.out.println("HOMEWORK PROBLEM 8");
		int g=5;
		for (int x=1;x<=g;x++) {
			for (int y=1; y<=x; y++ ) {
				if((x+y)%2 == 0) {
					System.out.print("1 ");
				} else System.out.print("0 ");
			} System.out.println();
		}
		
		
		System.out.println("DRAW A PATTERN OF RHOMBUS!!!!");
	
		
		for (int X=1; X<=5; X++) {
			for( int Y=1 ; Y<=5-X; Y++) {
				System.out.print(" ");
				} for(int Y=1;Y<=5;Y++) {
					System.out.print("*");
				} System.out.println();
		}
		Scanner hg=new Scanner(System.in);
		System.out.println("ENTER A");
		int A=hg.nextInt();
		System.out.println("ENTER B");
		int B=hg.nextInt();
		if(A>B) {
			System.out.println("A = " + A + " IS GREATER");
		} else {
			System.out.println("B = " + B + " IS GREATER");
		}
		
		Scanner hj=new Scanner(System.in);
		System.out.println("ENTER RADIUS OF CIRCLE");
		int radius=hj.nextInt();
		System.out.println("CIRCUMFERENCE OF CIRCLE IS = " + 2 * 3.14* radius);
		
		Scanner hl=new Scanner(System.in);
		System.out.println("ENTER AGE OF A PERSON");
		int age = hl.nextInt();
		if (age>=18) {
			System.out.println("PERSON IS ELIGIBLE TO VOTE");
		} else {
			System.out.println("PERSON IS NOT ELIGIBLE TO VOTE");
		}
		
		
	
		
		
		
		
		
		
		
	}

}
	


