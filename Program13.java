import java.io.IOException;
import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;


public class Program13 {
	public static void main(String args[]){
		int choice, rpt = 1;
		String name;
		Scanner sc = new Scanner(System.in);
		Vector students = new Vector();
		while(rpt != 0){
			System.out.println("1. Add student name");
			System.out.println("2. Remove student name");
			System.out.println("3. Search");
			System.out.println("4. Display");
			System.out.println("5. Exit");
			System.out.println("Enter choice: ");
			choice = sc.nextInt();
			sc.nextLine();
			switch(choice){
				case 1:
					System.out.println("Enter name of student: ");
					name = sc.nextLine();
					students.addElement(name);
					break;
				case 2:
					System.out.println("Enter name to remove: ");
					name = sc.nextLine();
					students.removeElement(name);
					break;
				case 3:
					System.out.println("Enter name to search: ");
					name = sc.nextLine();
					if(students.contains(name)){
						System.out.println(name + " is present at position: "
								+ students.indexOf(name));
					} else {
						System.out.println("Element not found");
					}
					break;
				case 4:
					System.out.println("The student list is as follows: ");
					Enumeration e = students.elements();
					while(e.hasMoreElements()){
						System.out.println(e.nextElement());
					}
					break;
				case 5:
					System.exit(0);
			}
			System.out.println("Do you want to continue? (1/0):");
			rpt = sc.nextInt();
		}
	}
}
