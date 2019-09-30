package com.sortingPrograms;
/**
 * 
 * @author sanjeetpandit
 * 
 *Worst Case Time complexity :  O(n^2)
 *Best Case Time Complexity :Ω(n)
 */
public class InsertionSort {
	void SortingValue(int arr[]) {
		int n=arr.length;
		int min,j;
		for(int i=1;i<n;i++) {
			min=arr[i];
			j=i-1;
			while( j>=0 && arr[j]>min) {
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=min;
		}
	}
	void PrintValue(int arr[]) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		InsertionSort sort=new InsertionSort();
		int arr[]= {4,23,2,5,4,6,7,2,3,5,9,0};
		sort.SortingValue(arr);
		System.out.println("Äfter Sorting Values are: ");
		sort.PrintValue(arr);
	}

}
