class PyramidPattern5
{
	public static void main(String args[])
	{
		
		for(int i=9; i>=1; i--)
		{
			for(int j=1; j<i; j++)
			{
				System.out.print("  ");	
			}
			for(int j=0; j<=9-i; j++)
			{   
				System.out.print((j+i)+" ");
			}
			for(int j=8; j>=i; j--)
			{   
				System.out.print(j+" ");
			}
			
			System.out.println();
		}
		
	}
}