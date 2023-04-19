package com.logical.pkg4;

public class Tribonacci 
{
	public static void test()
	{
	    int n=10;
	    int n1=0;
	    int n2=1;
	    int n3=1;
	    int n4;
	    System.out.println(n1);
	    System.out.println(n2);
	    System.out.println(n3);
		for(int i=3;i<=n;i++)
		{
		n4=n1+n2+n3;
		System.out.println(""+n4);
		n1=n2;
		n2=n3;
		n3=n4;
		}
	}
	public static void main(String[] args) 
	{
		test();

	}

}
