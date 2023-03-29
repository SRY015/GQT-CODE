import java.util.Scanner;

public class myNamePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n : ");
		int n = sc.nextInt();
		
		for(int row = 0;row < n; row ++) {
			for(int col = 0;col < n; col ++) {
				if((row==0 && col <= n/2 && col!=0) || (col==0 && row<n/2 && row!=0) || (row==n/2 && col <= n/2-1 && col!=0)
					|| (row > n/2 && col == n/2 && row < n-1) || (row == n-1 && col < n/2)) {
					System.out.print("# ");
				}else {
					System.out.print("  ");
				}
			}
			
			for(int col = 0;col < n; col ++) {
				if(col==0|| col == n/2 || (row == n/2 && col <= n/2) || (row==0 && col <= n/2)) {
					System.out.print("# ");
				}else {
					System.out.print("  ");
				}
			}
			
				for(int col = 0;col < n; col ++) {
					if(col == 0 || col == n-1 || (row == col)) {
						System.out.print("# ");
					}else {
						System.out.print("  ");
					}
				}
				System.out.print("          ");
				
				for(int col = 0;col < n; col ++) {
					if(col==0 || (row==0 && col < n/2) || (row==n-1 && col < n/2) || (col==n/2 && row!=0 && row<n-1)) {
						System.out.print("# ");
					}else {
						System.out.print("  ");
					}
				}
				
				for(int col = 0;col < n; col ++) {
					if((row==0 && col<n/2) || (col==n/4 && row<n) || (row==n-1 && col<n/2)) {
						System.out.print("# ");
					}else {
						System.out.print("  ");
					}
				}
				
				for(int col = 0;col < n; col ++) {
					if(col==0 || (row==0 && col<n/2) || (row==n/2 && col<n/2) || (col==n/2 && row<=n/2-1 && row!=0)) {
						System.out.print("# ");
					}else {
						System.out.print("  ");
					}
				}
				
	
			System.out.println();
		}

	}

}
