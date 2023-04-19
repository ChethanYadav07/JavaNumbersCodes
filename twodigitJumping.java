package com.logical.pkg4;

public class twodigitJumping
{
public static void check(int n)
{
	int res=0;
	for(int i=0;i<=n;i++)
	{
		if(Math.abs(i%10-i/10)==1)
		{
			res=i;
		}
	}
	System.out.println(res);
}
	public static void main(String[] args)
	{
		check(50);
		check(99);
	}
}
