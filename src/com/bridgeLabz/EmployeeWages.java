package com.bridgeLabz;

public class EmployeeWages 
{
	public static final int IS_PRESENT_full_time=1;
	public static final int IS_PRESENT_part_time=2;
	public static final int EMP_RATE_PER_HR=20;
	
	public static void main(String args[])
	{
		System.out.println("Welcome to EmployeeWage Computation Program on Master Branch");
		
		int emphr=0,salary=0;
		int empcheck=(int)Math.floor(Math.random()*10)%3;
		switch(empcheck)
		{
			case IS_PRESENT_full_time:
				emphr=8;
				break;
			case IS_PRESENT_part_time:
				emphr=4;
				break;
			default:
				emphr=0;
		}
		salary=emphr*EMP_RATE_PER_HR;
		System.out.println("EmpWage:" +salary);
	}	
}
