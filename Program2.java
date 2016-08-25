/**
 * @(#)Main.java
 *
 *
 * @author 
 * @version 1.00 2016/7/27
 */

import java.io.*;
public class Program1 {

    public static void main(String args[])throws IOException {
    	int n, choice;
    	DataInputStream d = new DataInputStream(System.in);
    	String str;
    	System.out.println("1. Vampire\n2. Pattern 1\n3. Pattern 2\nEnter choice: ");
    	str = d.readLine();
    	choice = Integer.parseInt(str);
    	switch(choice){
    		case 1:
    			int a[] = new int[4];
    			int combos[] = new int[50];
    			int digit, N= 0,  temp1, i = 0, j, k, flag = 1;
    			System.out.println("Enter a number: ");
    			str = d.readLine();
    			n = Integer.parseInt(str);
    			temp1 = n;
    			for(k = 0; n != 0; k++){
    				digit = n % 10;
    				a[k] = digit;
    				n = n / 10;
    				N++;
    			}
    			k = 0;
    			for(i = 0; i < N; i++){
    				for(j = i + 1; j < N; j++){
    					combos[k] = (a[i] * 10) + a[j];
    					k++;
    					combos[k] = (a[j] * 10) + a[i];
    					k++;
    				}	
    			}
    			for(i = 0; i < k ; i++){
    				for(j = i+1; j < k; j++){
    					if(combos[i] * combos[j] == temp1){
    						flag = 0;
    					}
    				}
    			}
    			if(flag == 0)
    				System.out.println("Vampire!!!!");
    			else
    				System.out.println("Not a Vampire");
    			break;
    		case 2:
    			System.out.println("Enter number of rows: ");
    			str = d.readLine();
    			n = Integer.parseInt(str);
    			int count = 0, temp = 1;
    			for(int rows = 1; rows <= n; rows++){
    				char ch = 'A';
    				for(int space = 1; space <= n-rows; space++){
    					System.out.print(" ");
    				}
    				ch = (char)(ch + count);
    				for(int m = 1; m <= rows; m++, ch--){
    					System.out.print(ch);
    				}
    				temp++;
    				count = count + temp;
    				System.out.println();
    			}
    			break;
    		case 3:
    			System.out.println("Enter number of rows: ");
    			str = d.readLine();
    			n = Integer.parseInt(str);
    			for(int rows = 1; rows <= n; rows++){
    				for(int space = 1; space <= n-rows; space++){
    					System.out.print(" ");
    				}
    				if(rows % 2 == 0){
    					for(int m = rows; m >= 1; m--){
    						System.out.print(m);
    					}
    				}else{
    					for(int m = 1; m <= rows; m++){
    						System.out.print(m);
    					}
    				}
    				System.out.println();
    			}
    			break;
    	}
    }
}    