package com.gqt.oopsproj.pkg1;
// Example program where encapsulation is implemented.
	class Dog1{
		private String name;
		private int cost;
		private int age;
		private String color;
		private String breed;
		// Independent setter and getter.
		public String getName(){
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getCost() {
			return cost;
		}
		public void setCost(int cost) {
			this.cost = cost;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public String getBreed() {
			return breed;
		}
		public void setBreed(String breed) {
			this.breed = breed;
		}
	}
public class Code2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog1 d1 = new Dog1();
		d1.setName("Tommy");
		d1.setCost(3000);
		d1.setAge(3);
		d1.setColor("Black");
		d1.setBreed("GR");
		
		System.out.println(d1.getName());
		System.out.println(d1.getCost());
		System.out.println(d1.getAge());
		System.out.println(d1.getColor());
		System.out.println(d1.getBreed());
		
	}

}
