class rightTriangle
{
	public static void main(String arg[])
	{
		int i, j;
		for( i = 0; i < 9; i++)
		{
			for( j = 0; j < i; j++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}