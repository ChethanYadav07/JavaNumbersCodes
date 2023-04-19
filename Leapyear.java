package com.logical.pkg4;

import java.util.Scanner;

public class Leapyear 
{
public static boolean check(int year)
{
	if(year%100==0 && year%400==0)
	{
		return true;
	}
	else if(year%100!=0 && year%4==0)
	{
		return true;
	}
	else
	{
		return false;
	}
}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year");
		int year=sc.nextInt();
		System.out.println(check(year));

	}
}
