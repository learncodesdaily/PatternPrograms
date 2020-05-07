package patternNumbers;

import java.util.Scanner;

public class number_pattern_21 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n;
		int k = 1,p = 0;

		System.out.println("Enter the Pattern Size : ");
		n = sc.nextInt();

		System.out.println("Number Pattern : \n");

		for(int i = 1;i <= n;i ++) 
		{
			k = p + i;
			for(int j = 1;j <= n;j ++) 
			{
				if(i <= j) 
				{
					if(i == j)
						p = k;
					System.out.print(k +"  ");
					k = k + j;
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

		1  2  4  7  11  
		   3  5  8  12  
		      6  9  13  
		         10 14  
		            15  
	*/