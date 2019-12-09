package com.capgemini.datastructure.sorting;

public class BubbleSort {

	static void bubblesort(int arr[], int n) {
		int i, j, temp;
		boolean swapped;
		for (i = 0; i < n - 1; i++) {
			swapped = false;
			for(j=0;j<n-i-1;j++) {
			if (arr[j] > arr[j + 1]) {

				temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = temp;
				swapped = true;
			}
		}
		if (swapped == false)
			break;
		}
	}

	static void printArray(int arr[], int size) {
		int i;
		for (i = 0; i < size; i++) {
			System.out.println(arr[i] + "  ");
			System.out.println();
		}
	}
	
	

	public static void main(String[] args) {
		int arr[] = { 65, 12, 2, 6, 7, 56, 98, 100, 1 };
		int n = arr.length;
		bubblesort(arr, n);
		System.out.println("Sorted array: ");
		printArray(arr, n);

	}// end of the main()

}// end of the class
