package com.hillel;

public class Task{
	public static void main(String...args){
		if (args.length < 3){
			System.out.println("Give me more paramms...or input nums");
			return;
		}
		
		int first = Integer.parseInt(args[0]), second = Integer.parseInt(args[1]), third = Integer.parseInt(args[2]);
		Task task = new Task();
		int max = task.MaxOfTwoNum(first, second);
		max = task.MaxOfTwoNum(max, third);
		System.out.println("Max of " + first + " " + second + " " + third + " is:\t" +max);
		int min = task.MinOfTwoNum(first, second);
		min = task.MinOfTwoNum(min, third);
		System.out.println("Min of " + first + " " + second + " " + third + " is:\t" +min);
	}
	
	private int MaxOfTwoNum(int num1, int num2){
		return (num1 > num2) ? num1 : num2;
	}
	
	private int MinOfTwoNum(int num1, int num2){
		return (num1 < num2) ? num1 : num2;
	}
}
