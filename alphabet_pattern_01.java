package patternAlphabets;


public class alphabet_pattern_01 {
	public static void main(String[] args) {
		
		int n = 5;
		int k;
		
		System.out.println("alphabet pattern : \n");
		
		for(int i = 1;i <= n;i ++) 
		{
			k =  'a' + i - 1;
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

	a a a a a 
	b b b b b 
	c c c c c 
	d d d d d 
	e e e e e  */