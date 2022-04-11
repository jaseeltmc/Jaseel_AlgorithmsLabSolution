package com.greatlearning.lab2.currency.denominations;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		MergeSort mergeSort = new MergeSort();
		NotesCount notesCount = new NotesCount();
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Enter the size of currency denominations");
		
		int size = sc.nextInt();
		int [] notes = new int [size];
		
		System.out.println("Enter the currency denominations value");
		
		for (int i=0;i<size;i++) {
			
			notes[i] = sc.nextInt();
			
		}
		
		
		
		mergeSort.mergeSort(notes, 0, size-1);
		
		System.out.println("Enter the amount you want to pay");   
		
		int amount = sc.nextInt();
		
		notesCount.notesCountImplimentation(notes, amount);
	
		sc.close();
	}

}
