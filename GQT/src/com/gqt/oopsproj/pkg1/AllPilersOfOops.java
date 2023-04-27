package com.gqt.oopsproj.pkg1;
import java.util.Scanner;
abstract class Shape{
	double area;
	abstract void collectData();
	abstract void calculate();
	void display() {
		System.out.println(area);
	}
}
class Square extends Shape{
	private double side;
	@Override
	void collectData() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the side : ");
		side = sc.nextDouble();
	}
	@Override
	void calculate() {
		area = side * side;
	}
}
class Circle extends Shape{
	private double radius;
	final double pi = 3.147;
	@Override
	void collectData() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radious : ");
		radius = sc.nextDouble();
	}
	@Override
	void calculate() {
		area = pi * radius * radius;
	}
}
class Rectangle extends Shape{
	private double l,b;
	final double pi = 3.147;
	@Override
	void collectData() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length : ");
		l = sc.nextDouble();
		System.out.print("Enter the breadth : ");
		b = sc.nextDouble();
	}
	@Override
	void calculate() {
		area = l * b;
	}
}
class Geometry{
	void shepeops(Shape s) {
		s.collectData();
		s.calculate();
		s.display();
	}
}
public class AllPilersOfOops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square s = new Square();
		Circle c = new Circle();
		Rectangle r = new Rectangle();
		Geometry g = new Geometry();
		g.shepeops(s);
		g.shepeops(c);
		g.shepeops(r);

	}

}
