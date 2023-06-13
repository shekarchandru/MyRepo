package com.gl.inheritance;

import java.util.Scanner;

public class Furniture {

	protected int length;
	protected int width;
	protected int height;
	protected Scanner scan1 = new Scanner(System.in);
	
	public void acceptFurnitureDetails()
	{
		System.out.println("Enter the length ");
		length = scan1.nextInt();
		System.out.println("Enter the Width ");
		width = scan1.nextInt();
		System.out.println("Enter the Height");
		height = scan1.nextInt();
	}
	public void displayFurnitureDetails()
	{
		System.out.println("The Furniture Details are ..");
		System.out.println("The Length is "+length);
		System.out.println("The Width is "+width);
		System.out.println("The Height is "+height);
	}
}
