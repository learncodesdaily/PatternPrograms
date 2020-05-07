package patternNumbers;

import java.util.Scanner;

public class number_pattern_20 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n;
		int k = 0;

		System.out.println("Enter the Pattern Size : ");
		n = sc.nextInt();

		System.out.println("Number Pattern : \n");

		for(int i = 1;i <= n;i ++) 
		{
			int c = k + (n-i) + 1;
			for(int j = 1;j <= n;j ++) 
			{
				if(i <= j) 
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
Output :
	Enter the Pattern Size : 
		5
		Number Pattern : 

		1  2  3  4  5  
		   9  8  7  6  
		      10 11 12  
		         14 13  
		            15  
	*/
