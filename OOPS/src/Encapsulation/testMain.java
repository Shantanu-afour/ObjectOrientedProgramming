package Encapsulation;
import java.util.Scanner;

public class testMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean again = false;
		do {
		try {
			String name;
			int age;
			Scanner sc1 = new Scanner(System.in);
			Scanner sc2 = new Scanner(System.in);
		
			Encapsulate obj = new Encapsulate();
		
			System.out.println("Enter name: ");
			name = sc1.nextLine();
		
			System.out.println("Enter age: ");
			age = sc2.nextInt();
		

			obj.setName(name);
			obj.setAge(age);

			System.out.println("Person's name: " + obj.getName());
			System.out.println("Person's age: " + obj.getAge());
			System.exit(0);

		} catch(Exception e) {
				System.out.println("Invalid Input: " + e);
				again = true;
		}
		} while(again);
	}
}
