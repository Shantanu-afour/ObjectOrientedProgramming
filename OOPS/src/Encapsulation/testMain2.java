package Encapsulation;
import java.util.Scanner;
public class testMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean again = false;
		cricketScorer scorer = new cricketScorer();
		do {
		try {
			int j;
			for(int i = 0; i < 6; i++) {
			Scanner sc = new Scanner(System.in);
				System.out.println("Enter runs 1-6 for 1 over: ");
				j = sc.nextInt();
				switch(j) {
				case 1:
					scorer.single();
					again = false;
					break;
				case 2:
					scorer.twos();
					again = false;
					break;
				case 3:
					scorer.threes();
					again = false;
					break;
				case 4:
					scorer.four();
					again = false;
					break;
				case 5:
					scorer.fives();
					again = false;
					break;
				case 6:
					scorer.six();
					again = false;
					break;
				default:
					System.out.println("Enter numbers 1-6");
					again = false;
			}
		}
	} catch(Exception e) {
		System.out.println("Invalid input: " + e);
		again = true;
	}
		} while(again);
		scorer.printScore();
	}

}
