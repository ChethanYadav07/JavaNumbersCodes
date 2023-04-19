package com.logical.pkg4;

public class Pattern9to1
{
	public static void printpattern(int row,int column)
	{
		int n=9;
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=column;j++)
			{
				System.out.print(n+" ");
				n--;
			}
			System.out.println();
		}
	}
		public static void main(String[] args)
		{
			printpattern(3,3);
		}

}
