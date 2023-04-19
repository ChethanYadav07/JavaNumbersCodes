package com.logical.pkg4;

public class Fibonacci
{
	public static void test()
	{
	    int n=10;
	    int n1=0;
	    int n2=1;
	    int n3;
	    System.out.println(n1);
	    System.out.println(n2);
		for(int i=3;i<=n;i++)
		{
		n3=n1+n2;
		System.out.println(""+n3);
		n1=n2;
		n2=n3;
		}
	}
	public static void main(String[] args)
	{
		test();

	}

}
