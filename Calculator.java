package com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {
	public static void botadd() throws IOException {
		int a=0;
		int b=0;
		System.out.print("Please enter the first number: ");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String nr = null;
		nr = reader.readLine();
		try{
		    a = Integer.parseInt(nr);
		}catch (NumberFormatException ex) {
		    System.out.println("You had not entered an integer!");
		}
		System.out.print("Please enter the second number: ");
		nr = reader.readLine();
		try{
		    b = Integer.parseInt(nr);
		}catch (NumberFormatException ex) {
		    System.out.println("You had not entered an integer!");
		}
		int sum = a+b;
		System.out.println("The sum of the numbers is: " + sum);
	}
}
