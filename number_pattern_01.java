package patternNumbers;

import java.util.Scanner;

public class number_pattern_01 {

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
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}
}

/*
Output:

		Enter the Pattern Size : 
		5
		Number Pattern : 

		1 1 1 1 1 
		2 2 2 2 2 
		3 3 3 3 3 
		4 4 4 4 4 
		5 5 5 5 5 
 */