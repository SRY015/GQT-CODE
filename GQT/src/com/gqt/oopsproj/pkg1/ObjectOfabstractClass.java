// Generally we know that we cann't create an object of an abstract class. But, in this example we have created an object
// of an abstract class.
package com.gqt.oopsproj.pkg1;
abstract class Calculator{
	abstract void add();
	abstract void sub();
}

public class ObjectOfabstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c1 = new Calculator() {
			@Override
			void add() {
				System.out.println("This is add function");
			}
			@Override
			void sub() {
				System.out.println("This is sub function");
			}
		};
		c1.add();
		c1.sub();

	}

}
