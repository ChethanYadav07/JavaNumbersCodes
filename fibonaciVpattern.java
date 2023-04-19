package com.logical.pkg4;

public class fibonaciVpattern 
{

	public static void main(String[] args) 
	{
		int n=8,a=0,b=1,c=0;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<n*2;j++)
			{
				if(i==j || i+j==n*2)
				{
					System.out.print(a+" ");
					c=a+b;
					a=b;
					b=c;
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
