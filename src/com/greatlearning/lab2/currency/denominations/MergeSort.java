package com.greatlearning.lab2.currency.denominations;

public class MergeSort {
	
	 public void mergeSort(int [] arr, int L,int R ) {
			if ( L <R) {
				
				int mid = (L+R)/2;
				
				mergeSort(arr,L, mid);
				mergeSort(arr,mid + 1,R);
				merge(arr,L, mid,R);
			}
		}
		
		public void merge(int [] arr,int L,int mid,int R) {
			int size1 = mid - L + 1;
			int size2= R - mid;
			int [] Leftarray = new int [size1];
			int [] Rightarray = new int [size2];
			
			
			for(int i =0;i<size1;i++) {
				
				 Leftarray [i] = arr [L+i] ;
			}
			
			for (int j=0;j<size2;j++) {
				
				Rightarray[j] = arr[mid+1+j];
			}
			
			int i = 0;
			int j = 0;
			int k = L;
			while (i<size1 && j<size2) {
				
				if (Leftarray[i]>= Rightarray[j]) {
					 arr[k] = Leftarray[i];
					 i++;
					 k++;
				}else {
					arr[k] = Rightarray[j];
					j++;
					k++;
				}
			}
	   while(i<size1) {
				
				arr[k]=Leftarray[i];
				i++;
				k++;
				
			}
	   while(j<size2) {
			
			arr[k]=Rightarray[j];
			j++;
			k++;
		}
		}
}

		
	