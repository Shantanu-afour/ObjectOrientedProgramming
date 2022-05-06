package Inheritance;
import java.util.Scanner;

public class testMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		do {
		try {
		int x, y, z;
		superClass sup = new superClass();
		subClass sub = new subClass();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two integers: ");
		sup.i = sc.nextInt();
		sup.j = sc.nextInt();
		System.out.println("Contents of Super Class ");
		sup.showij();
		System.out.println("Enter three integers: ");
		sub.i = sc.nextInt();
		sub.j = sc.nextInt();
		sub.k = sc.nextInt();
		System.out.println("Contents of Sub Class");
		sub.showij();
		sub.showk();
		System.out.println("Sum of i, j and k in Sub Class");
		sub.sum();
		System.exit(0);
		} catch(Exception e) {
			System.out.println("Invalid input: Please Enter Integer");
		}
		} while(true);

	}

}
