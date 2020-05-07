package patternNumbers;

import java.util.Scanner;

public class number_pattern_09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n;
		int k;

		System.out.println("Enter the Pattern Size : ");
		n = sc.nextInt();

		System.out.println("Number Pattern : \n");

		for(int i = 1;i <= n;i ++) 
		{
			k = 1;
			for(int j = 1;j <= n;j ++) 
			{
				if(i >= j)
					System.out.print(k++ +" ");
				else
					System.out.print("\t");
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

		1 				
		1 2 			
		1 2 3 		
		1 2 3 4 	
		1 2 3 4 5 
*/