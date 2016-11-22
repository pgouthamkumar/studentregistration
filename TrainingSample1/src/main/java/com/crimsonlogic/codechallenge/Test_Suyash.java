package com.crimsonlogic.codechallenge;

public class Test_Suyash {
	public static void main(String[] args) {
		final int distance = 200; // Assume Distance to be 100 m
		int velocity=0;
		int i=1;
		double angle, radian = 0.0, temp = 0;
		double time = 100.00; // Assuming Maximum Time
		for (angle = 1; angle < 88; angle++) {
			radian = Math.toRadians(angle);
			for (velocity = 1; velocity <100; velocity++) {
				temp = distance / (velocity * Math.cos(radian));
				System.out.println(time+"::"+temp);
				if (temp < time) {
					time = temp;
					System.out.println("Velocity is:" + velocity
							+ " Angle is :" + angle + " Time is :" + time);
					
				}
			}

		}
		System.out.println("Velocity is:" + velocity
				+ " Angle is :" + angle + " Time is :" + time);
	}
}
