package com.gqt.arraysproj.package1;
import java.util.Scanner;
public class JaggedArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("\t <-------School Management System------->");
		System.out.print("Enter the number of classes in your school : ");
		int cls = sc.nextInt();
		int[][] arr = new int[cls][];
		for(int i=0;i<arr.length;i++) {
			System.out.print("Enter the number of students in class "+(i+1)+" : ");
			arr[i] = new int[sc.nextInt()];
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside class"+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.print("Enter the mark of student"+(j+1)+" : ");
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("\t<------:Student Details:------>");
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside class"+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("the mark of student"+(j+1)+" : "+arr[i][j]);
			}
		}
	}

}
