/**
 * @(#)F.java
 *
 *
 * @author
 * @version 1.00 2005/1/1
 */


import java.util.*;
class F {
	public static void main(String[] args){
		long f;
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n: ");
		n = sc.nextInt();
		try{
			if(n<0){
				throw new NegativeNumberException("Factorial of -ve number is not defined.");
			}
			f = factorial(n);
			System.out.println("Factorial : " + f);
		}catch(NegativeNumberException e){
		}
	}
	public static long factorial(int n){
		long f = 1;
		for(int i = 1; i <= n; i++){
			f *= i;
		}
		return f;
	}
}
class NegativeNumberException extends Exception{
	public NegativeNumberException(String str){
		System.out.println(str);
	}
}
