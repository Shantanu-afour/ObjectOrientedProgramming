package Polymorphism;
import java.util.Scanner;

public class testMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		double x, y;
		boolean again = false;
		do {
		Scanner sc = new Scanner(System.in);
		
		Sum s = new Sum();
		try {
		System.out.println("Enter two integers: ");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("Sum of two integers: " + s.sum(a, b));
		
		System.out.println("Enter three integers: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		System.out.println("Sum of three integers: " + s.sum(a, b, c));
		
		System.out.println("Enter two doubles: ");
		x = sc.nextDouble();
		y = sc.nextDouble();
		System.out.println("Sum of two doubles: " + s.sum(x, y));
		} catch(Exception e) {
			System.out.println("Invalid input: ");
			again = true;
			}
		} while(again);
	}

}
