package com.gqt.arraysproj.package1;
import java.util.Scanner;
public class JaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = new int[3][];
		arr[0] = new int[3];
		arr[1] = new int[4]; // Declaring 2D array with odd column.
		arr[2] = new int[2];
		// Initializing the jagged array.
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j] = count ++;
			}
		}
		// Printing the data of a jagged array.
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
