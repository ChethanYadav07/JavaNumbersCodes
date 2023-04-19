package com.logical.pkg4;

public class Jumpingnumber
{
public static void check(int n)
{
	boolean b=true;
	for(int i=n;i>1;i--)
	{
		int count=0;
		int a1=0;
		int a2=0;
		int m=i;
		while(m>0)
		{
			int rem=m%10;
			if(count==1)
			{
				a1=rem;
			}
			if(count==1 && Math.abs(a1-a2)!=1)
			{
				b=false;
				break;
			}
			if(count==1 && Math.abs(a1-a2)==1)
			{
				a2=a1;
				b=true;
			}
			if(count==0)
			{
				a2=rem;
				count++;
			}
			m=m/10;
		}
		if(b==true)
		{
            System.out.println(i);
		}
	
	}
}
	public static void main(String[] args)
	{
	   check(50);
//	   check(150);
//	   check(1234);

	}

}
