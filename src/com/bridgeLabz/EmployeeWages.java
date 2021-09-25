package com.bridgeLabz;

public class EmployeeWages 
{
	public static void main(String args[])
	{
		System.out.println("Welcome to EmployeeWage Computation Program on Master Branch");
		
		int IS_PRESENT_full_time=1;
		double empcheck=Math.floor(Math.random()*10)%2;
		if(empcheck==IS_PRESENT_full_time)
			
			System.out.println("Employee is present");
		else
			System.out.println("Employee is absent");
	}
	
}
