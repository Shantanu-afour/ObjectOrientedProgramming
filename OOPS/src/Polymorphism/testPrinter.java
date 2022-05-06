package Polymorphism;
import java.util.Scanner;

public class testPrinter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		boolean again = false;
		do {
		Scanner sc = new Scanner(System.in);
		threeDPrinter tDPr = new threeDPrinter();
		inkPrinter iPr = new inkPrinter();
		printer sPr = new printer();
		driver dr = new driver();
		
		System.out.println("----Available Printers----" + "\n 1.Simple Printer " + "\n 2.Ink Printer " + "\n 3.3D Printer ");
		System.out.println("Choose one");
		try {
		i = sc.nextInt();
		switch(i) {
		case 1:
			dr.runPrint(sPr);
			break;
		case 2:
			dr.runPrint(iPr);
			break;
		case 3:
			dr.runPrint(tDPr);
			break;
			}
		}catch(Exception e) {
			System.out.println("Invalid input");
			again = true;
		}	
	} while(again);
  }
}