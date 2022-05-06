package employeeDetails;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.*;


public class testMain {
	ArrayList<employee> list = new ArrayList<employee>();
	ListIterator<employee> li = list.listIterator();
	Scanner sc = new Scanner(System.in);
	 Scanner sc1 = new Scanner(System.in);
	 Scanner sc2 = new Scanner(System.in);
	 Scanner sc3 = new Scanner(System.in);
	public class myThread1 extends Thread{
		public void run(String name, String address, String mail) {
					employee emp = new employee(name, address, mail);
					list.add(emp);
		System.out.println("Thread 1 executed");
		}
	}
	
	public class myThread2 extends Thread{
		public void run(ListIterator<employee> li) {
			li.remove();
 			System.out.println("Thread 2 executed");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean again = true;
		int choice = -1;
		 ArrayList<employee> list = new ArrayList<employee>();
		 ListIterator<employee> li = list.listIterator();
		 Scanner sc = new Scanner(System.in);
		 Scanner sc1 = new Scanner(System.in);
		 Scanner sc2 = new Scanner(System.in);
		 Scanner sc3 = new Scanner(System.in);
		do {
		 System.out.println("-------Employee Dashboard-------\n1.Insert\n2.Delete\n3.Update\n4.Display\n5.Sort\n6.Exit\nEnter your choice:");		 
		 choice = sc.nextInt();
		 String name, address, mail;
		 	switch(choice){
		 		case 1:
		 			int n;
		 			myThread1 t1 = new testMain().new myThread1();
	 				myThread2 t2 = new testMain().new myThread2();
		 			System.out.println("Enter number of employees");
		 			n = sc.nextInt();
		 			for(int i = 0; i < n; i++) {
		 				System.out.println("Enter Name: ");
		 				name = sc2.nextLine();
		 				System.out.println("Enter Address: ");
		 				address = sc2.nextLine();
		 				do {
		 				System.out.println("Enter Email ID: ");
		 				mail = sc3.nextLine();
		 				if(!valEmail(mail))
		 					System.out.println("Invalid email format");
		 				} while(!valEmail(mail));
		 				t1.run(name, address, mail);
		 				try {
							t1.join();
						} catch (InterruptedException e3) {
							// TODO Auto-generated catch block
							e3.printStackTrace();
						}
		 			}
		 			t2.start();
		 			break;
		 		case 2:
		 			boolean found = false;
		 			System.out.println("Enter ID to delete: ");
		 			int empid = sc.nextInt();
		 			li = list.listIterator();
		 			while(li.hasNext()) {
		 				employee e = (employee)li.next();
		 				if(e.getId() == empid) {
		 					li.remove();
		 					found = true;
		 				}
		 			}
		 			if(!found)
		 				System.out.println("Record not found");
		 			break;
		 		case 3:
		 			boolean found1 = false;
		 			System.out.println("Enter ID to update: ");
		 			int empid1 = sc.nextInt();
		 			li = list.listIterator();
		 			while(li.hasNext()) {
		 				employee e = (employee)li.next();
		 				if(e.getId() == empid1) {
		 					li.remove();
		 					System.out.println("Enter new employee name: ");
		 					name = sc2.nextLine();
			 				System.out.println("Enter new Address: ");
			 				address = sc2.nextLine();
			 				do {
				 				System.out.println("Enter new Email ID: ");
				 				mail = sc3.nextLine();
				 				if(!valEmail(mail))
				 					System.out.println("Invalid email format");
				 				} while(!valEmail(mail));
			 				e.setId(empid1);
			 				e.setAddress(address);
			 				e.setEmail(mail);
			 				e.setName(name);
			 				li.add(e);
			 				found1 = true;
		 				}
		 			}	
		 			if(!found1)
		 				System.out.println("Record not found");
		 			break; 
		 		case 4:
		 			if(list.size() == 0)
		 				System.out.println("\n**No records**\n");
		 			for(employee e : list) {
		 				System.out.println(e);
		 			}
		 			break;
		 		case 5:
		 			int c = -1;
		 			System.out.println("----Current Order----");
		 			for(employee e : list) {
		 				System.out.println(e);
		 			}
		 			System.out.println("----Sorting fields----\n1.ID\n2.Name\nEnter Choice: ");
		 			c = sc2.nextInt();
		 			if(c == 1) {
		 				Collections.sort(list, new Comparator<employee>(){
		 					public int compare(employee e1, employee e2) {
		 						return e1.getId() - e2.getId();
		 					}
		 				});
		 			} else if(c == 2){
		 				Collections.sort(list, new Comparator<employee>(){
		 					public int compare(employee e1, employee e2) {
		 						return e1.getName().compareTo(e2.getName());
		 					}
		 				});
		 			} else {
		 				System.out.println("Invalid input");
		 			}
		 			System.out.println("----After Sorting----");
		 			for(employee e : list) {
		 				System.out.println(e);
		 			}
		 			break;
		 		case 6:
		 			System.exit(0);
		 		default:
		 			System.out.println("Enter correct option!!!");
		 			break;
		 		}
		} while(again);	
	}
	
	 public static boolean valEmail(String input) {
	    	String emailRegex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
	    	Pattern emailPat = Pattern.compile(emailRegex, Pattern.CASE_INSENSITIVE);
	    	Matcher matcher = emailPat.matcher(input);
	    	return matcher.find();
	    }

}
