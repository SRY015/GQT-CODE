package com.gqt.arraysproj.package1;
import java.util.Scanner;
public class ArrayCode2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the count of classes : ");
		int cls = sc.nextInt();
		System.out.println("Rnter the count of students : ");
		int stu = sc.nextInt();
		int arr[][] = new int[cls][stu]; // two dimensional array
		//storing marks.
		for(int i=0;i<cls;i++) {
			System.out.println("Inside the class "+(i+1)+" : ");
			for(int j=0;j<stu;j++) {
				System.out.println("Enter the marks of student no"+(i+1));
				arr[i][j] = sc.nextInt();
			}
		}
		// Fetching Data.
		for(int i=0;i<cls;i++) {
			System.out.println("Inside class "+(i+1));
			for(int j=0;j<stu;j++) {
				System.out.println("The marks of student no "+(i+1)+" is = "+arr[i][j]);
			}
		}
		

	}

}
