package patternNumbers;

import java.util.Scanner;

public class number_pattern_14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n;
		int k,l;

		System.out.println("Enter the Pattern Size : ");
		n = sc.nextInt();

		System.out.println("Number Pattern : \n");

		for(int i = 1;i <= n;i ++) 
		{
			k = i;
			l = n - 1;
			for(int j = 1;j <= n;j ++) 
			{
				if(i >= j) 
				{
					System.out.print(k +" ");
					k = k + l;
					l--;
				}
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
		2 6 			
		3 7 10 		
		4 8 11 13 	
		5 9 12 14 15 
*/

