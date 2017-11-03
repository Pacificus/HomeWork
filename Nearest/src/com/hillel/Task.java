package com.hillel;

public class Task{
	public static void main(String...args){
		if (args.length < 2){
			System.out.println("Give me more paramms...or input nums");
			return;
		}
		
		int first = Integer.parseInt(args[0]), second = Integer.parseInt(args[1]);
		int nearestToTen = Math.abs(first - 10) < Math.abs(second - 10) ? first : second;
		System.out.println("The num is nearest to 10 is " + nearestToTen);
	}
}
