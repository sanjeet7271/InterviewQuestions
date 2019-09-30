package com.sortingPrograms;
/**
 * 
 * @author sanjeetpandit
 *
 *Best Case Time Complexity : Ω(n)
 *Worst Case Time Complexity : O(n^2)
 *
 */
public class SelectionSorting {
	public void Sorting(int arr[]) {
		int n=arr.length;
		// One by one move boundary of unsorted subarray 
		for(int i=0;i<n;i++) {
			int min_index=i;
			// Find the minimum element in unsorted array
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[min_index]) {
					min_index=j;
				}
				
			}
			// Swap the found minimum element with the first 
            // element
			int temp=arr[min_index];
			arr[min_index]=arr[i];
			arr[i]=temp;
			
		}
	}
	//Printing Array after Sorting
	public void printSortedValues(int arr[]) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
	
		SelectionSorting sort=new SelectionSorting();
		int arr[]= {2,3,4,1,5,2,8,9,4};
		sort.Sorting(arr);
		System.out.println("After Sorting Elements are :" );
		sort.printSortedValues(arr);

	}

}
