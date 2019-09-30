package com.sortingPrograms;

public class QuickSort {
	public int partition(int arr[], int low, int high) {
		int pivot=arr[high];
		int i=(low-1);
		for(int j=low;j<high;j++) {
			if(arr[j]<=pivot) {
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			
		}
		int temp=arr[i+1];
		arr[i+1]=arr[high];
		arr[high]=temp;
		
		return i+1;	
	}
	public void sort(int arr[], int low, int high) {
		if(low<high) {
			int pi=partition(arr,low,high);
			sort(arr,low,pi-1);
			sort(arr,pi+1,high);
			
		}
	}
	
	public void Print(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		
		QuickSort sort=new QuickSort();
		int arr[]= {5,3,2,7,8,4,9,1,10,65,23};
		System.out.println("Before Sorting Elements Are :");
		sort.Print(arr);
		sort.sort(arr, 0, arr.length-1);
		System.out.println();
		System.out.println("After Sorting Elements Are :");
		sort.Print(arr);

	}

}
