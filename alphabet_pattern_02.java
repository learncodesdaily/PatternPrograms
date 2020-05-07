package patternAlphabets;


public class alphabet_pattern_02 {
	public static void main(String[] args) {
		
		int n = 5;
		int k;
		
		System.out.println("alphabet pattern : \n");
		
		for(int i = 1;i <= n;i ++) 
		{
			k =  'A' + i - 1;
			for(int j = 1;j <= n;j ++) 
			{
				System.out.print((char)k+" ");
			}
			System.out.println();
		}
	}
}

/*
 * OUTPUT:
 
	alphabet pattern : 

	A A A A A 
	B B B B B 
	C C C C C 
	D D D D D 
	E E E E E   */