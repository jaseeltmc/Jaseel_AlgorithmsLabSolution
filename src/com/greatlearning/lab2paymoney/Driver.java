package com.greatlearning.lab2paymoney;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of transaction array ");
		
		int size = sc.nextInt();
		
		int [] arr =new int [size];
		
		System.out.println("Enter the values of the array ");
		
		for (int i =0;i<size;i++) {
			arr [i] = sc.nextInt();
		}
		
		System.out.println("Enter the total no of targets that needs to be achieved ");
		
		int targetNo = sc.nextInt();
		
		Target transaction = new Target();
		
		while(targetNo!=0) {
			
			System.out.println("Enter the value of target");
			
			long target = (long)sc.nextLong();
			targetNo--;
			transaction.transaction(arr, target);
			
			
		}sc.close();
		
					
				}
			
		
		

	}


