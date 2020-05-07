package patternAlphabets;


public class alphabet_pattern_04 {
	public static void main(String[] args) {
		
		int n = 5;
		int k;
		
		System.out.println("alphabet pattern : \n");
		
		for(int i = 1;i <= n;i ++) 
		{
			k =  'A';
			for(int j = 1;j <= n;j ++) 
			{
				System.out.print((char)k++ +" ");
			}
			System.out.println();
		}
	}
}

/*
 * OUTPUT:
 
	alphabet pattern : 

	A B C D E 
	A B C D E 
	A B C D E 
	A B C D E 
	A B C D E     */