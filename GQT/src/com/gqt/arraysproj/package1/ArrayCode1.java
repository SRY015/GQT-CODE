package com.gqt.arraysproj.package1;
import java.util.Scanner;
public class ArrayCode1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the count of students : ");
		int n = sc.nextInt();
		int arr[] = new int[n]; // One dimensional array
		// Storing the data.
		for(int i=0;i<n;i++) {
			System.out.println("Enter the marks of student "+(i+1)+": ");
			arr[i] = sc.nextInt();
		}
		System.out.println("#######------Markes Added-------#######");
		// Fetching the data.
		for(int i=0;i<n;i++) {
			System.out.println("The marks of student"+(i+1)+" is :"+arr[i]);
		}

	}

}
