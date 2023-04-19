package com.logical.pkg4;

public class even 
{
 public static void check(int num)
 {
	 int even=0;
	 int odd=0;
	 while(num>0)
	 {
		 int rem=num%10;
		 if(rem!=0 && rem%2==0)
		 {
			 even++;
		 }
		 else
		 {
			 odd++;
		 }
		 num=num/10;
	 }
	 System.out.println(even);
	 System.out.println(odd);
	 
 }
 public static void main(String[] args)
 {
		check(1234567890);
 }
}
