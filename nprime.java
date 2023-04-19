package com.logical.pkg4;

import java.util.Scanner;

public class nprime 
{
	public static void print(int n)
	{
		int x=0;
		for(int i=2;i<=1000;i++)
		{
			int count=0;
			for(int j=2;j<=i-1;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==0)
			{
				System.out.println(i);
				x++;
			}
			if(x==n)
			{
				break;
			}
		}
		System.out.println();
		System.out.println(x);
	}
		public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the number");
			int n=sc.nextInt();
			print(n);
		}

}
