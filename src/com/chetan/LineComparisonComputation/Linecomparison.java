package com.chetan.LineComparisonComputation;

import java.util.Scanner;

public class Linecomparison {
	
	int x1;
	int y1;
	int x2;
	int y2;
	//double lengthofline;
	 
	
	
	public void Input() {
		System.out.println("Enter Two Point x1 & y1 and x2 & y2 :");
		Scanner scanner = new Scanner(System.in);
		
		
		x1 = scanner.nextInt();
		y1 = scanner.nextInt();
		x2 = scanner.nextInt();
		y2 = scanner.nextInt();
		
		
	}
	double LineCalulate() {
	
		return Math.sqrt(Math.pow((x2-x1),2)) + Math.pow((y2-y1),2);
		
		//System.out.println("Length of line is :"+lengthofline);

		
	}
	public void Linecheck(Linecomparison linecomparison2)
	{
		if(this.LineCalulate() == linecomparison2.LineCalulate())
		{
			System.out.println("The line are Same");
		}
		else
		{
			System.out.println("The line are Not Same");
		}
		
	}

	public static void main(String[] args) {
		
		System.out.println("Welcome to Line Comparison Computation");
		Linecomparison linecomparison = new Linecomparison();
		Linecomparison linecomparison2 = new Linecomparison();
		linecomparison.Input();
		linecomparison2.Input();
		
		linecomparison.Linecheck(linecomparison2);
		
	}

}
