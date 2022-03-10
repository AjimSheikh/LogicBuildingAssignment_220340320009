class Pattern17
	{
		static int sum=1;
		public static void main(String args[])
		{ 
			for( int i=1 ; i<=5 ; i++)
			{	
				for( int j=0 ; j<=i-1 ; j++)
				{
					System.out.print(sum+" ");
					sum++;
				}	
				System.out.println();
			}
		}
	}