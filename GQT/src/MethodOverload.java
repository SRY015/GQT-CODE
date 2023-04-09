import java.util.Scanner;
class Demo{
	void add() {
		int a=10, b=20;
		int sum = a+b;
		System.out.println("Sum = "+sum);
	}
	void add(int a, int b, int c) {
		int sum = a + b + c;
		System.out.println("Sum of three numbers : "+sum);
	}
	void add(int a,int b) {
		int sum = a + b;
		System.out.println("Sum of two numbers : "+sum);
	}
}
public class MethodOverload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Demo d1 = new Demo();
		d1.add();
		d1.add(10,30);
		d1.add(2,9,4);

	}

}
