package com.logical.pkg4;

public class Pattern 
{
public static void printpattern(int row,int column)
{
	for(int i=1;i<=row;i++)
	{
		for(int j=1;j<=column;j++)
		{
			System.out.print(j+" ");
		}
		System.out.println();
	}
}
	public static void main(String[] args)
	{
		printpattern(4,4);
	}

}
