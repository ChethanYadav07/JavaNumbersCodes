package com.logical.pkg4;

import java.util.Scanner;

public class Palindrome 
{
    
    public static void check(int num)
    {
    	int z=num;
    	int rev=0;
    	int rem=0;
    	while(num>0)
    	{
    		rem=num%10;
    		rev=(rev*10)+rem;
    		num=num/10;
    	}
    	System.out.println(rev);
    	if(rev==z)
    	{
    		System.out.println("palindrome");
    	}
    	else
    	{
    		System.out.println("not palindrome");
    	}
    }
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		check(num);
	}
}
