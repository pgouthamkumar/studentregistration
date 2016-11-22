package com.crimsonlogic.codechallenge;

public class Test_Vinayaka {

	public static void main(String[] args) {

		// considaring max velocity as 100 units

		double time;
		double time_taken[] = new double[101];
		double angle1[] = new double[90];
		double velocity1[] = new double[100];
		double minTimearray[] = new double[100];
		double degrees = 0;
		double mintime;
		double radians = Math.toRadians(degrees);
		double k = 100;
		double velo;

		// minimum time required with speed 10 in 0 degree
		time = k / (100 * Math.cos(radians));
		//time = 0.001D;
		

		for (int i = 0; i < 90; i++) {

			velo = 1 / (time * Math.cos(Math.toRadians(i)));
			if (velo > 100)
				break;

			velocity1[i] = velo;
			angle1[i] = i;

		}
		System.out
				.println("By considaring minimum fixed time the combinations of angle and speed which gives minimum times are\n");
		System.out.format("ANGLE \t \tSPEED \t\t  TIME\n");
		for (int i = 0; i < 90; i++) {

			System.out.format("%.1f\t\t%.4f\t\t%f\n", angle1[i], velocity1[i],
					time);
		}
	}
}
