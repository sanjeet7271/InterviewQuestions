package com.search;

public class BinarySearch {
	
	int binarySearch1(int arr[], int low, int high, int x) {
		if(low<=high) {
			int mid=low+(high-low)/2;
			if(arr[mid]==x) {
				return mid;
			}
			if(arr[mid]>x) {
				return binarySearch1(arr,low,mid-1,x);
			}else {
				return binarySearch1(arr, mid+1, high,x);
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		BinarySearch search=new BinarySearch();
		int arr[]= {2,1,4,3,8,7,5,9,15,11};
		int n=arr.length;
		int x=7;
		int result=search.binarySearch1(arr, 0, n-1, x);
		if(result==-1) {
			System.out.println("Element not found :");
		}else {
			System.out.println("Element found at :"+result);
		}

	}

}
