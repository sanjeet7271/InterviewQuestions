package com.sortingPrograms;
/**
 * 
 * @author sanjeetpandit
 * *Worst Case Time complexity : O(nlogn)
 *Best Case Time Complexity :Ω(n)
 *
 */
public class MergeSort {
	
	public void mergesort(int arr[], int low ,int mid, int high) {
		
		int n1=mid-low+1;
		int n2=high-mid;
		int LeftData[]=new int[n1];
		int RightData[]=new int[n2];
		for(int i=0;i<n1;i++) {
			LeftData[i]=arr[low+i];
		}
		for(int j=0;j<n2;j++) {
			RightData[j]=arr[mid+1+j];
		}
		int i=0,j=0,k=low;
		while(i<n1 && j<n2) {
			if(LeftData[i]<=RightData[j]) {
				arr[k]=LeftData[i];
				i++;
			}else {
				arr[k]=RightData[j];
				j++;
			}
			k++;
		}
		while(i<n1){
			arr[k]=LeftData[i];
			i++;
			k++;
		}
		while(j<n2) {
			arr[k]=RightData[j];
			j++;
			k++;
		}
		
		
	}
	void sort(int arr[], int low, int high) {
		if(low<high) {
			int mid=(low+high)/2;
			sort(arr,low,mid);
			sort(arr,mid+1,high);
			mergesort(arr,low,mid,high);
		}
	}
	public void print(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	public static void main(String[] args) {
		
		MergeSort sort=new MergeSort();
		int arr[]= {3,2,4,5,3,6,9,7,34,12,4,5,75,75};
		System.out.print("Before Sorting elements are :");
		sort.print(arr);
		sort.sort(arr, 0, arr.length-1);
		System.out.print("After Sorting elements are :");
		sort.print(arr);
	}

}
