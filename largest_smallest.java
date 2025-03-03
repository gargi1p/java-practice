package kiet.edu;

import java.util.Scanner;

public class largest_smallest {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of elements:");
		n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n;i++) {
			System.out.println("Enter the element["+i+"]:");
			arr[i] = sc.nextInt();
		}
		int smallest = arr[0];
		int largest = arr[0];
		
		for(int i=0; i<n; i++) {
		if(arr[i]>largest) {
			largest = arr[i];
		}
		if(arr[i]<smallest) {
			smallest = arr[i];
		}
		}
		System.out.println("Largest:"+largest);
		System.out.println("Smallest:"+smallest);
		sc.close();
	}
}
