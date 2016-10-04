/**
 * @(#)Garden.java
 *
 * Garden application
 *
 * @author 
 * @version 1.00 2016/8/31
 */
 import java.util.*;
public class Garden {
    
    public static void main(String[] args) {
  		int t,h,b,amt,y;
    	tejasdedhiya10@yahoo.com
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter tree code: ");
    	t = sc.nextInt();
    	System.out.println("Enter height: ");
    	h = sc.nextInt();
    	System.out.println("Enter base: ");
    	b = sc.nextInt();
    	System.out.println("Enter amount spent on the tree: ");
    	amt = sc.nextInt();
    	Tree t1 = new Tree(t,h,b,amt);
    		
    	System.out.println("Enter tree code of Mango Tree: ");
    	t = sc.nextInt();
    	System.out.println("Enter height of Mango Tree: ");
    	h = sc.nextInt();
    	System.out.println("Enter base of Mango Tree: ");
    	b = sc.nextInt();
    	System.out.println("Enter amount spent on the Mango tree: ");
    	amt = sc.nextInt();
    	System.out.println("Enter yield");
    	y = sc.nextInt();
    	MangoTree m= new MangoTree(t,h,b,amt,y);
    	
    	t1.display();
    	m.display();
    }
}
class Tree {
	int tcode, height, base, amount;
	Tree(int code, int h, int b, int amt){
		tcode = code;
		height = h;
		base = b;
		amount = amt;
	}
	void display(){
		System.out.println("Tree Code: " + tcode + "\nHeight: " + height + "\nBase = " + base + "\nAmount spent so far = " + amount + "\n");
	}
	void update(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter updated Tree Code: ");
		tcode = sc.nextInt();
		System.out.println("Enter updated height: ");
		height = sc.nextInt();
		System.out.println("Enter updated base: ");
		base = sc.nextInt();
		System.out.println("Enter updated amount: ");
		amount = sc.nextInt();
	}
}
class MangoTree extends Tree{
	int yield;
	MangoTree(int code, int h, int b, int amt, int y){
		super(code, h, b, amt);
		yield = y;
	}
	void display(){
		System.out.println("Info of Mango Tree: ");
		super.display();
		System.out.println("Yield = " + yield);
	}
	void update(){
		Scanner sc = new Scanner(System.in);
		super.update();
		System.out.println("Enter updated yield: ");
		yield = sc.nextInt();
	}
}
