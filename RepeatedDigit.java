package com.logical.pkg4;

public class RepeatedDigit {

	public static void main(String[] args)
	{
		int n=25;
		int count=0;
		for(int i=1;i<=25;i++)
		{
			if(i%10==2)
			{
				count++;
			}
			if(i/10==2)
			{
				count++;
			}
		}
        System.out.println(count);
	}

}
