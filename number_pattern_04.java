package patternNumbers;

import java.util.Scanner;

public class number_pattern_04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n;
		int k = 0;
		
		System.out.println("Enter the Pattern Size : ");
		n = sc.nextInt();
		
		System.out.println("Number Pattern : \n");
		
		for(int i = 1;i <= n;i ++) 
		{
			for(int j = 1;j <= n;j ++) 
			{
				System.out.print((k++) +" ");
			}
			System.out.println();
		}
	}
}

/*
Output : 
	
		Enter the Pattern Size : 
		3
		Number Pattern : 

		0 1 2 
		3 4 5 
		6 7 8 
*/