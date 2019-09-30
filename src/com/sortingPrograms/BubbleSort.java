package com.sortingPrograms;
/**
 * 
 * @author sanjeetpandit
 * Number of comparisons:(n-1) + (n-2) + (n-3) +.....+ 1 = n(n-1)/2 nearly equals to n2
 * Best Time Complexity : O(n)
 * Worst Case Time Complexity : O(n^2)
 * 
 * Space complexity is O(1) because an extra variable temp is used for swapping.
 * In the optimized algorithm, the variable swapped adds to the space complexity thus, making it O(2).
 */
public class BubbleSort {
	public void SortingValue(int arr[]) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					// swap arr[j+1] and arr[j] 
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
	}
	public void PritValues(int arr[]) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	public static void main(String[] args) {
		BubbleSort sort=new BubbleSort();
		int arr[]= {1,4,2,3,6,5,8,7,4,3,4};
		sort.SortingValue(arr);
		System.out.println("After Sorting Values Are :");
		sort.PritValues(arr);
	}

}
