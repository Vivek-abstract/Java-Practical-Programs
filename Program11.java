/**
 * @(#)Program11.java
 *
 *
 * @author 
 * @version 1.00 2016/9/14
 */

import java.util.*;
interface Sports{
	void get_score(int s);
}
class Student{
	String name;
	Student(String n){
		name = n;
	}
}
class Test extends Student{
	int sub1;
	Test(String n, int s1){
		super(n);
		sub1 = s1;
	}
}
class Result extends Test implements Sports{
	int total, score;
	Result(String n, int s1){
		super(n,s1);
	}
	public void get_score(int s){
		score = s;
	}
	void calculate_total(){
		total = score + sub1;
		System.out.println("Total = " + total);
	}
}
public class Program11 {

    public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
    	String name;
 		int sub1, score;
    	System.out.println("Enter name: ");
    	name = sc.nextLine();
    	System.out.println("Enter subject 1 marks: ");
    	sub1 = sc.nextInt();
    	Result r = new Result(name, sub1);
    	System.out.println("Enter sports score: "); 
  		score = sc.nextInt();
    	r.get_score(score);
    	r.calculate_total();
    }
    
}