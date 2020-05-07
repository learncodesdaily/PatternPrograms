package patternNumbers;

import java.util.Scanner;

public class number_pattern_22 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n;
		int k = 0;

		System.out.println("Enter the Pattern Size : ");
		n = sc.nextInt();

		System.out.println("Number Pattern : \n");

		for(int i = 1;i <= n;i ++) 
		{
			int c = k + i;
			for(int j = 1;j <= n;j ++) 
			{
				if(i+j >= n+1) 
				{
					k++;
					if(i % 2 != 0)
						System.out.print(k +"  ");
					else
						System.out.print(c-- +"  ");
				}
				else
					System.out.print("   ");
			}
			System.out.println();
		}
	}
}

/*
Outout :
	Enter the Pattern Size : 
		4
		Number Pattern : 

		         1  
		      3  2  
		   4  5  6  
		10 9  8  7  
*/
	
