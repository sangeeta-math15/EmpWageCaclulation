package com.bridgeLabz;

public class EmployeeWages 
{
	public static final int IS_PRESENT_full_time=1;
	public static final int IS_PRESENT_part_time=2;
	public static final int EMP_RATE_PER_HR=20;
	public static final int NUM_Of_Working_Days=20;
	public static final int MAX_HR_IN_MONTH=100; 
		
	
	public static void main(String args[])
	{
		System.out.println("Welcome to EmployeeWage Computation Program on Master Branch");
		
		int emphr=0;
		int totalEmpHr=0,TotalWorkingDays=0;
		while(totalEmpHr<=MAX_HR_IN_MONTH && TotalWorkingDays<NUM_Of_Working_Days)
		{
			TotalWorkingDays++;
		
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
			totalEmpHr=totalEmpHr+emphr;
			System.out.println("Days:" +TotalWorkingDays + "Emp Hr:" +emphr);
		}
		int totalEMPWage=totalEmpHr*EMP_RATE_PER_HR;
		System.out.println("Total Emp Wage" +totalEMPWage);
	}	
}
