package patternNumbers;

import java.util.Scanner;

public class number_pattern_06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n;
		int k = 0;

		System.out.println("Enter the Pattern Size : ");
		n = sc.nextInt();

		System.out.println("Number Pattern : \n");

		for(int i = 1;i <= n;i ++) 
		{
			int c = i * n;
			for(int j = 1;j <= n;j ++) 
			{
				k++;
				if(i %2 != 0)
					System.out.print(k +" ");
				else
					System.out.print(c-- +" ");
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

		1 2 3 4 5 
		10 9 8 7 6 
		11 12 13 14 15 
		20 19 18 17 16 
		21 22 23 24 25 
*/