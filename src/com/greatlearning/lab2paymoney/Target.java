package com.greatlearning.lab2paymoney;


public class Target {
	
	public void transaction (int [] arrayValues,long target) {
		
		int flag =0;
		long sum = 0;
		
		int valueSize =arrayValues.length;
		
		for(int i=0;i<valueSize;i++) {
			
			sum+=arrayValues[i];
			
			if(sum>=target){
				
				System.out.println("target  "+" achieved after  "+(i+1)+"  transaction ");
				System.out.println();
				
				flag = 1;
				
				break;
			}
			}
		if(flag == 0) {
			
			System.out.println("Given target is not achieved");
		}
			
			
		}
	}



