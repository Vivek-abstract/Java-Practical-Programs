import java.util.Scanner;


public class Count {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		int n = str.length();
		int i, nBlank = 0, nDigits = 0, nSpl = 0, nUpper = 0, nLower = 0;
		char ch[] = new char[n];
		ch = str.toCharArray();
		char temp;
		for(i = 0; i < n; i++){
			temp = ch[i];
			if(Character.isUpperCase(temp))
				nUpper++;
			else if(Character.isLowerCase(temp))
				nLower++;
			else if(temp == ' ')
				nBlank++;
			else if(temp >= '0' && temp <= '9')
				nDigits++;
			else
				nSpl++;
		}
		System.out.println("The string " + str + " has ");
		System.out.println("UpperCase : " + nUpper);
		System.out.println("LowerCase : " + nLower);
		System.out.println("Blanks : " + nBlank);
		System.out.println("Digits: " + nDigits);
		System.out.println("Special Characters: " + nSpl);
	}
}
