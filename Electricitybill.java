package com.logical.pkg4;

import java.util.Scanner;

public class Electricitybill 
{
	public static int bill(int unit)
	{
		if(unit<=100)
		{
			return 0;
		}
		else if(unit>100 && unit<=200)
		{
			return (unit-100)*5;
		}
		else
		{
			return 500+(unit-200)*10;
		}
	}
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the unit");
			int unit=sc.nextInt();
			System.out.println(bill(unit));

		}

	

}
