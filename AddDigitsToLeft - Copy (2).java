package com.logical.pkg4;

public class Addnumberleft 
{
	public static void add(int n1,int n2)
	{
		int count=0;
		int num=0;
		int x=n1;
		while(n1>0)
		{
			int rem=n1%10;
			count++;
			n1=n1/10;
		}
		num=n2*(int)(Math.pow(10, (count)))+x;
		System.out.println(num);
	}
		public static void main(String[] args) 
		{
			add(15,3);
			add(123,23);
			add(12345,234);
		}
}
