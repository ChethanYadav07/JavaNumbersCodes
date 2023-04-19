package com.logical.pkg4;

import java.util.Scanner;

public class Armstrongwithoutspcl 
{
	 public static String check(int num)
	   {
		   int t1=num;
		   int count=0;
		   while(t1>0)
		   {
			   count++;
			   t1=t1/10;
		   }
		   int t2=num;
		   int  sum=0;
		   while(t2>0)
		   {
			   int rem=t2%10;
			   int s=(rem)^count;
			   sum=sum+s;
			   t2=t2/10;
		   }
		   if(num==sum)
		   {
			   return "yes";
		   }
		   else
		   {
			   return "no";
		   }
	   }
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		System.out.println(check(num));

	}

}
