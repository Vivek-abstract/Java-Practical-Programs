public class Program3 {

	public static void main(String args[]){
		int n, i = 0, j;
		int d[] = new int[20];
		n = Integer.parseInt(args[0]);
		while(n != 0){
			d[i] = n % 10;
			i++;
			n /= 10;
		}
		for(j = i-1; j >= 0; j--){
			switch(d[j]){
				case 0: System.out.print("Zero ");	
						break;
				case 1: System.out.print("One ");
						break;
				case 2: System.out.print("Two ");
						break;
				case 3: System.out.print("Three ");
						break;
				case 4: System.out.print("Four ");
						break;
				case 5: System.out.print("Five ");
						break;
				case 6: System.out.print("Six ");
						break;
				case 7: System.out.print("Seven ");
						break;
				case 8: System.out.print("Eight ");
						break;
				case 9: System.out.print("Nine ");
						break;
				default: System.out.println("Invalid Input");
			}
		}
	}
}