import java.util.*;
class Staff {
	int code;
	String name;
	Staff(int c, String n){
		code = c;
		name = n;
	}
}
class Teacher extends Staff{
	String subject;
	Teacher(int c, String n, String sub){
		super(c,n);
		subject = sub;
	}
	void display(){
		System.out.println(name + " is a " + subject + " teacher.");
		System.out.println("Code: " + code);
	}
}
class Typist extends Staff{
	int speed;
	Typist(int c, String n, int s){
		super(c,n);
		speed = s;
	}
	void display(){
		System.out.println(name + " is a typist whose typing speed is " + speed + " wpm.");
	}
}
class Officer extends Staff{
	String grade;
	Officer(int c, String n, String g){
		super(c,n);
		grade = g;
	}
	void display(){
		System.out.println(name + " is an Officer of grade " + grade);
	}
}
class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int choice, n, speed, code;
		String name, grade, subject;
		System.out.print("Enter number of employees in staff: ");
		n = sc.nextInt();
		sc.nextLine();
		
		for(int i = 1; i <= n; i++){
			System.out.println("Enter name of employee: ");
			name = sc.nextLine();
			System.out.println("Enter code of employee: ");
			code = sc.nextInt();
			System.out.println("1. Teacher\n2. Typist\n3. Officer");
			System.out.println("Enter type of employee: ");
			choice = sc.nextInt();
			sc.nextLine();
			switch(choice){
				case 1:
					System.out.println("Enter subject: ");
					subject = sc.nextLine();
					Teacher t = new Teacher(code, name, subject);
					t.display();
					break;
				case 2:
					System.out.println("Enter speed in wpm: ");
					speed = sc.nextInt();
					sc.nextLine();
					Typist ty = new Typist(code, name, speed);
					ty.display();
					break;
				case 3:
					System.out.println("Enter grade: ");
					grade = sc.next();
					Officer o = new Officer(code,name,grade);
					o.display();
					break;
			}
		}
	}
}
