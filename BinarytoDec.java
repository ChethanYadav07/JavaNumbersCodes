package com.logical.pkg4;

public class BinarytoDec 
{
public static void convert(int num)
{
	int c=0;
	int sum=0;
	while(num>0)
	{
		int rem=num%10;
		sum=sum+(int)Math.pow(2, c)*rem;
		c++;
		num=num/10;
	}
	System.out.println(sum);
}
	public static void main(String[] args) 
	{
		convert(10011);
		convert(11001);
		convert(1001101);
	}

}
