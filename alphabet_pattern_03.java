package patternAlphabets;


public class alphabet_pattern_03 {
	public static void main(String[] args) {
		
		int n = 5;
		int k;
		
		System.out.println("alphabet pattern : \n");
		
		for(int i = 1;i <= n;i ++) 
		{
			k =  'A' + n - i;
			for(int j = 1;j <= n;j ++) 
			{
				System.out.print((char)k +" ");
			}
			System.out.println();
		}
	}
}

/*
 * OUTPUT:
 
	alphabet pattern : 

	E E E E E 
	D D D D D 
	C C C C C 
	B B B B B 
	A A A A A    */