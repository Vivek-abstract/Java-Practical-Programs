/**
 * @(#)Program4.java
 *
 *
 * @author 
 * @version 1.00 2016/8/10
 */

import java.io.*;
public class Program4 {
    public static void main(String args[]) throws IOException {
    	int choice, n;
    	String temp;
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	System.out.println("1. Sort in descending order\n2. Delete duplicate elements\n3. Tabular");
    	temp = br.readLine();
    	choice = Integer.parseInt(temp);
    	switch(choice){
    		case 1:
    			System.out.println("Enter n:");
    			temp = br.readLine();
    			n = Integer.parseInt(temp);
    			int a[] = new int[n];
    			for(int i = 0; i < n; i++){
    				System.out.print("Enter element: ");
    				temp = br.readLine();
    				a[i] = Integer.parseInt(temp);	
    			}
    			sort1(a, n);
    			for(int i = 0; i < n; i++){
    				System.out.print(a[i] + " ");
    			}
    			break;
    		case 2:
    			System.out.println("Enter n:");
    			temp = br.readLine();
    			n = Integer.parseInt(temp);
    			int b[] = new int[n];
    			for(int i = 0; i < n; i++){
    				System.out.print("Enter element: ");
    				temp = br.readLine();
    				b[i] = Integer.parseInt(temp);	
    			}
    			for(int i = 0; i < n; i++){
    				for(int j = i+1; j < n; j++){
    					if(b[i] == b[j]){
    						for(int k = j; k < n - 1; k++){
    							b[k] = b[k+1];
    						}
    						n--;
    						j--;
    					}
    				}
    			}
    			for(int i = 0; i < n; i++){
    				System.out.print(b[i] + " ");
    			}
    			break;
    		case 3:
    			int rows, col;
    			System.out.println("Enter number of students:");
    			temp = br.readLine();
    			rows = Integer.parseInt(temp);
    			System.out.println("Enter number of subjects:");
    			temp = br.readLine();
    			col = Integer.parseInt(temp);
    			
    			int data[][] = new int[rows][col];
    			int grand_sum = 0;
    			for(int i = 0; i < rows; i++){
    				for(int j = 0; j < col; j++){
    					System.out.print("Enter marks" + (j+1) + " of student " + (i+1) + ": ");
    					temp = br.readLine();
    					data[i][j] = Integer.parseInt(temp);
    				}
    			}
    			for(int i = 0; i < rows; i++){
    				for(int j = 0; j < col; j++){
    					System.out.print(data[i][j] + " ");
    				}
    				System.out.print("| " + row_sum(data, i, col));
    				System.out.println();
    			}
    			for(int i = 0; i < col; i++){
    				System.out.print("----");
    			}
    			System.out.println();
    			for(int i = 0; i < col; i++){
    				grand_sum += col_sum(data, rows, i);
    				System.out.print(col_sum(data, rows, i) + " ");
    			}
    			System.out.print("| " + grand_sum);
				break;
    		default:
    			System.out.println("Invalid input");
    			break;
    	}
    }
    static void sort1(int a[], int n){
    	for(int i = 0; i < n; i++){
    		for(int j = i+1; j < n; j++){
    			if(a[i] < a[j]){
    				int t = a[i];
    				a[i] = a[j];
    				a[j] = t;
    			}
    		}
    	}
    }
    static int row_sum(int a[][], int row, int col){
    	int sum = 0;
    	for(int i = 0; i < col; i++){
    		sum += a[row][i]; 
    	}
    	return sum;
    }
    static int col_sum(int a[][], int row, int col){
    	int sum = 0;
    	for(int i = 0; i < row; i++){
    		sum += a[i][col];
    	}
    	return sum;
    }
}