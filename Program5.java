/**
 * @(#)Program 5.java
 *
 *
 * @author
 * @version 1.00 2016/8/24
 */

import java.util.*;
public class Program5{

	public static void main(String args[]){
		int choice;
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		str = sc.nextLine();
		System.out.println("1. Replace substring\n2. Remove spaces\n3. Count no of alphabets, digits and special symbols");
		System.out.print("Enter choice: ");
		choice = sc.nextInt();
		switch(choice){
			case 1:
				replace(str);
				break;
			case 2:
				remove_spaces(str);
				break;
			case 3:
				count(str);
				break;
			default:
				System.out.println("Invalid input");
				break;
		}
	}
	public static void replace(String str){
		String str1, str2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter substring to replace: ");
		str1 = sc.nextLine();
		System.out.println("With what do you want to replace?");
		str2 = sc.nextLine();
		str = str.replaceAll(str1, str2);
		System.out.println(str);
	}
	public static void remove_spaces(String str){
		str = str.replaceAll(" ","");
		str = str.replaceAll("\t","");
		System.out.println(str);
	}
	public static void count(String str){
		int n = str.length();
		int i, nAlpha = 0, nDigits = 0, nSpl = 0;
		char ch[] = new char[n];
		ch = str.toCharArray();
		char temp;
		for(i = 0; i < n; i++){
			temp = ch[i];
			if((temp >= 'A' && temp <= 'Z') || (temp >= 'a' && temp <= 'z'))
				nAlpha++;
			else if(temp >= '0' && temp <= '9')
				nDigits++;
			else
				nSpl++;
		}
		System.out.println("The string " + str + " has ");
		System.out.println("Alphabets : " + nAlpha);
		System.out.println("Digits: " + nDigits);
		System.out.println("Special Characters: " + nSpl);
	}
}
