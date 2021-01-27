import java.util.Scanner;
public class detik{
	public static void main(String[] args) {
		
		Scanner detik=new Scanner(System.in);
		System.out.println("\n");

		System.out.print("\t\t Masukan jam :");
		int x =detik.nextInt();
		System.out.print("\t\t Masukan menit :");
		int y =detik.nextInt();
		System.out.print("\t\t Masukan detik :");
		int z =detik.nextInt();
		int hasil=3600*x+60*y+1*z;
		System.out.print("\t\t Maka total detik nya adalah :"+hasil);
	}
}