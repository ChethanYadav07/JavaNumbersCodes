package com.logical.pkg4;

import java.util.Scanner;

public class BintoDecusingString
{
public static int convert(String s)
{
	int res=0;
	int p=0;
	for(int i=s.length()-1;i>=0;i--)
	{
		int a=s.charAt(i)-48;
		res=res+(int)Math.pow(2, p)*a;
		p++;
	}
	return res;
}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		System.out.println(convert(s1));
	}

}
