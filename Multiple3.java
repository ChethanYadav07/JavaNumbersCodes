package com.logical.pkg4;

public class Multiple3 
{
	 public static void check(int num)
	 {
		 int count=0;
		 while(num>0)
		 {
			 int rem=num%10;
			 if(rem!=0)
			 {
			 if( rem%3==0)
			 {
				count++; 
			 }
			 }
			 num=num/10;
			 
		 }
		 System.out.println(count);
		
		 
	 }
	 public static void main(String[] args)
	 {
			check(1234567890);
			check(369369360);
	 }
}
