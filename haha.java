import java.util.Scanner;
class haha{
	public static void main(String[] args) {
		int n = 10;

		for (int i = 1;i<=5 ;i++ ) {
			for (int j=1;j<=i ;j++ ) {
				System.out.print(" ");
			}
			for (int z= 5;z>=i ;z-- ) {
				System.out.print("*");
			}
			for (int k=4;k>=i ;k-- ) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}
}