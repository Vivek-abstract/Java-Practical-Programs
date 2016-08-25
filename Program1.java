/**
 * @(#)Program1.java
 *
 *
 * @author 
 * @version 1.00 2016/8/24
 */


import java.util.*;
class Program1 {
	
	public static void main(String args[]){
	{
		int a,b,c,res,ch;
		Scanner sc=new Scanner (System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		res=((a>b)?((a>c)?a:c):((b>c)?b:c));
		int d;
		double r1,r2;
		d=b*b-4*a*c;
		System.out.println("enter 1:largest 2:roots");
		ch=sc.nextInt();
		switch(ch){
			case 1: 
				System.out.println("largest="+res); 
				break;
			case 2:{
				if(d>0){
					System.out.println("roots are real and distinct");
					r1=-b+Math.sqrt(d)/(2*a);
					r2=-b-Math.sqrt(d)/(2*a);
					System.out.println(r1);
					System.out.println(r2);
				}
				else if (d==0){
					System.out.println("roots are real and equal");
					r1=(double)-b/(2*a);
					System.out.println(r1);
				}
				else {
					System.out.println("roots are imaginary");
				}
			} 
		}
	}
}