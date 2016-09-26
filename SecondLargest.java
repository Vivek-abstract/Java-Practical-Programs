import java.util.Scanner;

public class SecondLargest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i = 0; i < n; i++){
			System.out.println("Enter element: ");
			a[i] = sc.nextInt();
		}
		
		int largest = Integer.MIN_VALUE;
	    int secondLargest = Integer.MIN_VALUE;
	    
		for(int i = 0; i < n; i++){
			if(a[i] > largest){
				secondLargest = largest;
				largest = a[i];
			}
			else if(a[i] > secondLargest && a[i] != largest)
				secondLargest = a[i];
		}
		System.out.println("Largest = " + largest);
		System.out.println("Second Largest = " + secondLargest);
		sc.close(); // Ignore this
	}
}
