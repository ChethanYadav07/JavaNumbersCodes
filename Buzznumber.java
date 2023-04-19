package com.logical.pkg4;

public class Buzznumber
{

	public static void main(String[] args) 
	{
		int num=49;
		int lastdigit=num%10;
		if(num%7==0 || lastdigit%7==0)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}

}
