import java.util.Scanner;
public class rumussegitiga{
	public static void main(String[] args) {
		
		Scanner nilai = new Scanner (System.in);

		double luas,keliling;

		System.out.println("MENGHITUNG LUAS SEGITIGA");

		int a,t;

		System.out.print("masukan alas   = ");
		a = nilai.nextInt();
		System.out.print("masukan tinggi = ");
		t = nilai.nextInt();
		luas = 0.5*a*t; 
		System.out.println("luas segitiga :" + luas);

		System.out.println("MENGHITUNG KELILING SEGITIGA");

		int sisiA,sisiB,sisiC;

		System.out.print("Sisi A = ");
		sisiA = nilai.nextInt();
		System.out.print("Sisi B = ");
		sisiB = nilai.nextInt();
		System.out.print("Sisi C = ");
		sisiC = nilai.nextInt();
		keliling = sisiA+sisiB+sisiC;
		System.out.println("keliling segitiga :" + keliling);


	}
}