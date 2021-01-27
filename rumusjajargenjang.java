import java.util.Scanner;
public class rumusjajargenjang{
	public static void main(String[] args) {
		
		Scanner nilai = new Scanner (System.in);

		double luas,keliling;

		System.out.println("MENGHITUNG LUAS JAJAR GENJANG");

		int a,t;

		System.out.print("masukan alas   = ");
		a = nilai.nextInt();
		System.out.print("masukan tinggi = ");
		t = nilai.nextInt();
		luas = a*t;
		System.out.println("luas jajar genjang :" + luas);

		System.out.println("MENGHITUNG KELILING JAJAR GENJANG");

		int sisiA,sisiB;
		System.out.print("Sisi A = ");
		sisiA = nilai.nextInt();
		System.out.print("Sisi B = ");
		sisiB = nilai.nextInt();
		keliling = 2 * sisiA + sisiB;
		System.out.println("keliling jajar genjang :" + keliling);



	}
}