package com.logical.pkg4;
import java.util.Scanner;
public class Prime1ton 
{
public static void print(int n)
{
	for(int i=2;i<=n;i++)
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
		}
	}
}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		print(n);
	}

}
