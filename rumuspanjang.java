import java.util.Scanner;
public class rumuspanjang{
	public static void main(String[] args) {
		
		Scanner nilai = new Scanner (System.in);

		int luas,keliling;

		System.out.println("MENGHITUNG LUAS PERSEGI PANJANG");

		int p,l;

		System.out.print("Panjang = ");
		p = nilai.nextInt();
		System.out.print("Lebar = ");
		l = nilai.nextInt();
		luas = p * l ;
		System.out.println("luas persegi Panjang :" + luas);

		System.out.println("MENGHITUNG KELILING PERSEGI");

		int al,bae;

		System.out.print("Panjang = ");
		al = nilai.nextInt();
		System.out.print("Lebar = ");
		bae = nilai.nextInt();
		keliling = 2*p+l;
		System.out.println("keliling persegi Panjang :" + keliling);
	}
}