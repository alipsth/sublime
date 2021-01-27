import java.util.Scanner;
public class rumuspersegi{
	public static void main(String[] args) {
		
		Scanner nilai = new Scanner (System.in);

		int luas,keliling;

		System.out.println("MENGHITUNG LUAS PERSEGI");

		int sisiA,sisiB;

		System.out.print("Sisi A = ");
		sisiA = nilai.nextInt();
		System.out.print("Sisi B = ");
		sisiB = nilai.nextInt();
		luas = sisiA * sisiB ;
		System.out.println("luas persegi :" + luas);

		System.out.println("MENGHITUNG KELILING PERSEGI");

		int al;

		System.out.print("Masukan Sisi = ");
		al = nilai.nextInt();
		keliling = 4 * al;
		System.out.println("keliling persegi :" + keliling);


	}
}