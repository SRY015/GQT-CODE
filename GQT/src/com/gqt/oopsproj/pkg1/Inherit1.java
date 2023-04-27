// This program defines the types of methods in Inheritance -->
package com.gqt.oopsproj.pkg1;
class Parent{
	void walk() { //Inherited Method
		System.out.println("Parent walk in a brisk manner");
	}
	void eyeColor() { //Overridden Method
		System.out.println("Parent eye color is black");
	}
}
class Child extends Parent{
	@Override
	void eyeColor() {
		System.out.println("Child's eye color is changed to blue");
	}
	void swim() { //Specialized method
		System.out.println("Child can swim");
	}
}
public class Inherit1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
		c.walk();
		c.swim();

	}

}
