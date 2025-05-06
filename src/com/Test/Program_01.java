package com.Test;
import java.util.Scanner;
public class Program_01 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n =sc.nextInt();
		int sqrt = n*n;
		System.out.println("Square root of"+n+"=" +sqrt);
	}

}
