package Inheritance;
import java.util.Scanner;

public class testMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean again = false;
		do {
		try {
		double a,r,l;
        int ch;
        Scanner sc = new Scanner(System.in);
            System.out.println("--------------------------------------------");
            System.out.println("1. Area of circle");
            System.out.println("2. Area of sector of circle");
            System.out.println("3. Area of segment of circle");
            System.out.println("4. Exit!");
            System.out.println("--------------------------------------------");

            System.out.println("Enter your choice?");
            ch = sc.nextInt();

            switch(ch){

                case 1:
                        System.out.println("Enter the radius of the circle");
                        r = sc.nextDouble();
                        circle c = new circle(r);
                        System.out.println("The area of the circle is: "+ c.circleArea());
                        break;

                case 2:
                        System.out.println("Enter the radius of the circle");
                        r = sc.nextDouble();
                        System.out.println("Enter the angle of sector in radians");
                        a = sc.nextDouble();
                        sector s1 = new sector(a,r);
                        System.out.println("The area of the segment of the circle is: " + s1.sectorArea());
                        break;

                case 3:
                        System.out.println("Enter the radius of the circle");
                        r = sc.nextDouble();
                        System.out.println("Enter the length of segment of the circle");
                        l = sc.nextDouble();
                        segment s2 = new segment(l,r);
                        System.out.println("The area of the segment of the circle is: " + s2.segmentArea());
                        break;
                
                case 4:
                        System.exit(0);
                        break;

                default:
                        System.out.println("Invalid choice!!");
                        again = true;
            }
		}catch(Exception e) {
			System.out.println("Invalid input");
			again = true;
		}
        } while(again);
    }
}
