package com.bridgeLabz;

public class EmployeeWages 
{
	public static void main(String args[])
	{
		System.out.println("Welcome to EmployeeWage Computation Program on Master Branch");
		
		int IS_PRESENT_full_time=1;
		int EMP_RATE_PER_HR=20;
		int emphr=0,salary=0;
		double empcheck=Math.floor(Math.random()*10)%2;
		if(empcheck==IS_PRESENT_full_time)
			emphr=8;
		else
			emphr=0;
		salary=emphr*EMP_RATE_PER_HR;
		System.out.println("EmpWage:" +salary);
	}
	
	
}
