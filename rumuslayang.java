import java.util.Scanner;
public class rumuslayang{
	public static void main(String[] args) {
		
		Scanner nilai = new Scanner (System.in);

		double keliling , luas ;

		System.out.println("MENGHITUNG LUAS LAYANG-LAYANG");

		int d1 , d2 ;

		System.out.print("Diagonal 1 = ");
		d1 = nilai.nextInt();
		System.out.print("Diagonal 2 = ");
		d2 = nilai.nextInt();
		luas = d1 * d2 / 2 ;
		System.out.println("Luas Layang-layang = "+luas);

		System.out.println("\n");

		System.out.println("\nMENGHITUNG KELILING LAYANG-LAYANG");

		int sisiA , sisiB ;

		System.out.print("Sisi A = ");
		sisiA = nilai.nextInt();
		System.out.print("Sisi B = ");
		sisiB = nilai.nextInt();
		keliling = 2* sisiA + 2*sisiB;
		System.out.println("Keliling Layang-layang = "+keliling);
		System.out.println("\nJadi Luas layang-layang = "+luas+ " dan Keliling = "+keliling);
	}
}