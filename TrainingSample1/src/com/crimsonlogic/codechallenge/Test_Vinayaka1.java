package com.crimsonlogic.codechallenge;

public class Test_Vinayaka1 {
	public static void main(String[] args) {
		
		//considaring max velocity as 100 units 
		
		double time;
		double time_taken[] = new double[201];
		double angle[] = new double[90];
		double velocity[] = new double[200];
		double minTimearray[] = new double[200];
		double degrees = 0;
		double mintime;
	    double radians = Math.toRadians(degrees);
	    double k = 100;
	    int velo;
	    
		for(int i=1;i<90;i++)
		{	double minTime = 100000;
			for(int j=1;j<=200;j++)
			{	
				double doubleTemp = 0;
				velo = j+i;
				if(velo>200) break;
				doubleTemp = k/(velo*Math.cos(i));
				if(minTime<doubleTemp)
				{
					angle[i] = i;
					velocity[i] = velo;
					minTime = doubleTemp;
					minTimearray[i] = minTime;
				}
			}
			
		}
		System.out.println("By considaring maximum speed as 100 units the top 5 combinations of angle and speed which gives minimum times are\n");
		System.out.println("ANGLE \t VELOCITY\t  TIME");
		for(int i=0;i<5;i++)
		{
		
		System.out.println(angle[i] +" \t "+velocity[i] + "\t \t "+minTimearray[i]);
		}
	}
}
