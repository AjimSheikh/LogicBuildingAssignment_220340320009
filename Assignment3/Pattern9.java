

class Pattern9
	{
		public static void main(String args[])
		{
			for( char i='A' ; i<='E' ; i++)
			{	
				for( char j='D' ; j>=i ; j--)
				{
					System.out.print(" ");
				}
				for( char j='A' ; j<=i ; j++)
				{
					System.out.print(j+" ");
				}	
				System.out.println();
			}
		}
	}