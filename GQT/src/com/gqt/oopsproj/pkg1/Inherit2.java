package com.gqt.oopsproj.pkg1;
class Plane{
	void takeOff() {
		System.out.println("Plane took off");
	}
	void fly() { //Overridden method
		System.out.println("Plane is flying");
	}
	void Land() {
		System.out.println("Plane landed");
	}
}
class CargoPlane extends Plane{
	@Override
	void fly() {
		System.out.println("CargoPlane fly at low height");
	}
	void carryGoods() {
		System.out.println("CargoPlane carry Goods");
	}
}
class FighterPlane extends Plane{
	@Override
	void fly() {
		System.out.println("Fighter plane fly at great height");
	}
	void carryWeapon() {
		System.out.println("FightrPlane carry weapon");
	}
}
public class Inherit2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CargoPlane cp = new CargoPlane();
		FighterPlane fp = new FighterPlane();
		cp.takeOff();
		cp.fly();
		cp.Land();
		fp.takeOff();
		fp.fly();
		fp.Land();
	}

}
