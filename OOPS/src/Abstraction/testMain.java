package Abstraction;
import java.util.Scanner;

public class testMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean again = false;
		
		do {
		try {
			Scanner sc1 = new Scanner(System.in);
			Scanner sc2 = new Scanner(System.in);
			double radius, length, width;
			String color1, color2;
			System.out.println("Enter radius of circle: ");
			radius = sc1.nextDouble();
			System.out.println("Enter color of circle: ");
			color1 = sc2.nextLine();
			System.out.println("Enter length of rectangle: ");
			length = sc1.nextDouble();
			System.out.println("Enter width of rectangle: ");
			width = sc1.nextDouble();
			System.out.println("Enter color of rectangle: ");
			color2 = sc2.nextLine();
			Shape s1 = new Circle(color1, radius);
			Shape s2 = new Rectangle(color2, length, width);
			System.out.println(s1.toString());
			System.out.println(s2.toString());
			System.exit(0);
			} catch(Exception e) {
				System.out.println("Invalid input: " + e);
				again = true;
			}
		} while(again);
		}
	}
