package patternNumbers;

import java.util.Scanner;

public class number_pattern_23 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n;
		int k,c;

		System.out.println("Enter the Pattern Size : ");
		n = sc.nextInt();

		System.out.println("Number Pattern : \n");

		for(int i = 1;i <= n;i ++) 
		{
			k = i;
			c = n - 1;
			for(int j = 1;j <= n;j ++) 
			{
				if(i+j >= n+1) 
				{
					System.out.print(k +"  ");
					k += c;
					c--;
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
		4
		Number Pattern : 

		         1  
		      2  5  
		   3  6  8  
		4  7  9  10  
	*/
