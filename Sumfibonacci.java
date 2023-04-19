package com.logical.pkg4;

public class Sumfibonacci 
{
	public static void test()
	{
	    int n=10;
	    int n1=1;
	    int n2=1;
	    int n3=0;
	    int sum=2;
		for(int i=1;i<=n-2;i++)
		{
		n3=n1+n2;
		sum=sum+n3;
		n1=n2;
		n2=n3;
		}
		System.out.println(sum);
	}
	public static void main(String[] args)
	{
		test();

	}

}
