package com.gqt.oopsproj.pkg1;
abstract class Animal{
	abstract void eat(); // abstract method.
	void sleep() {
		System.out.println("Animal sleeps");
	}
}
class Elephent extends Animal{
	@Override
	void eat() {
		System.out.println("Elephent eats fruits and vegetables");	
	}
}
class Tiger extends Animal{
	@Override
	void eat() {
		System.out.println("Tiger eats fresh meat");
	}
}
class Monkey extends Animal{
	@Override
	void eat() {
		System.out.println("Monkey eats banana");
	}
}
class Forest{
	void allowAnimal(Animal a) {
		a.eat();
		a.sleep();
	}
}
public class Abst1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Elephent e = new Elephent();
		Tiger t = new Tiger();
		Monkey m = new Monkey();
		
		Forest f = new Forest();
		f.allowAnimal(e);
		f.allowAnimal(t);
		f.allowAnimal(m);

	}

}
