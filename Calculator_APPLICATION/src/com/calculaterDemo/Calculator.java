package com.calculaterDemo;

import java.util.HashSet;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hset=new HashSet<>();
		hset.add("+");
		hset.add("-");
		hset.add("*");
		hset.add("/");
		hset.add("|");
		hset.add("&");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		 double Num1=sc.nextInt();
		System.out.println("Enter the second number");
		double Num2=sc.nextInt();
		System.out.println("Enter the operator");
		String s=sc.next();
		if(hset.contains(s)==false)
			System.out.println("Wrong operator entered");
		sc.close();
		switch(s)
		{
		case "+":System.out.println(Num1+Num2);
		         break;
		case "-":System.out.println(Num1-Num2);
		         break;
		case "*": System.out.println(Num1*Num2);
		           break;
		case "/": {
			if(Num2==0) throw new ArithmeticException("Cannot divide by zero");
			else System.out.println(Num1/Num2);
		}
		          break;
		case "|": System.out.println((int)Num1|(int)Num2);
		case "&":System.out.println((int)Num1&(int)Num2);
		
		default:System.out.println("Try again");
			      
		}

	}

}
