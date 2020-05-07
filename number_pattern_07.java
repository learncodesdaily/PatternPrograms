package patternNumbers;

import java.util.Scanner;

public class number_pattern_07 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n;
		int k;

		System.out.println("Enter the Pattern Size : ");
		n = sc.nextInt();

		System.out.println("Number Pattern : \n");

		for(int i = 1;i <= n;i ++) 
		{
			k = i;
			for(int j = 1;j <= n;j ++) 
			{
				System.out.print(k +" ");
				k = k + n;
			}
			System.out.println();
		}
	}
}

/*
Output :
		Enter the Pattern Size : 
		5
		Number Pattern : 

		1 6 11 16 21 
		2 7 12 17 22 
		3 8 13 18 23 
		4 9 14 19 24 
		5 10 15 20 25 
*/