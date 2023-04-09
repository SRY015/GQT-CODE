import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n: ");
		
		int n = sc.nextInt();
		System.out.print(2+" ");
		for(int i=3;i<=n;i++) {
			int counter=0;
			for(int j=2;j<i;j++) {
				if(i%j == 0) {
					counter ++;
				}
			}
			if(counter < 1) {
				System.out.print(i+" ");
			}
		}

	}

}
