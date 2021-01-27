import java.util.Scanner;
public class rumusketupat{
	public static void main(String[] args) {
		
		Scanner nilai = new Scanner (System.in);

		double luas,keliling;


		System.out.println("MENGHITUNG LUAS BELAH KETUPAT");

		int al,bae;

		System.out.print("diagonal 1 = ");
		al = nilai.nextInt();
		System.out.print("diagonal 2 = ");
		bae = nilai.nextInt();
		luas = 0.5 * al * bae ;
		System.out.println("luas belah ketupat :" + luas);

		System.out.println("MENGHITUNG KELILING BELAH KETUPAT");

		int sisi;

		System.out.print("masukan sisi = ");
		sisi = nilai.nextInt();
		keliling = 4 * sisi;
		System.out.println("keliling belah ketupat :" + keliling);




	}
}
	
