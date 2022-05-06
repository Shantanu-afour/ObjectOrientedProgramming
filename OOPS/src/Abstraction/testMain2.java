package Abstraction;
import java.util.Scanner;
public class testMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     boolean again = false;
	     do {
	    	 try {
	    		 Scanner sc = new Scanner(System.in);
	    	     StackDefine obj = new StackDefine(); 
	    	     int choice;
	    		 System.out.println("-------Stack-------\n1.Insert\n2.Push\n3.Pop\n4.Display\n5.Exit\nEnter your choice:");
	    		 
	    		 choice = sc.nextInt();
	    		 	switch(choice){
	    		 		case 1:
	    		 			obj.insert();
	    		 			break;
	    		 		case 2:
	    		 			obj.push();
	    		 			break;
	    		 		case 3:
	    		 			obj.pop();
	    		 			break;
	    		 		case 4:
	    		 			obj.display();
	    		 			break;
	    		 		case 5:
	    		 			System.exit(0);
	    		 		default:
	    		 			System.out.println("Enter correct option!!!");
	            	}
	    	 	} catch(Exception e) {
	    	 		System.out.println("Invalid input");
	    	 		again = true;
	    	 	} 
	    	 } while(again);
	}
}	

