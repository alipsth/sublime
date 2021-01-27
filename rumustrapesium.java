import java.util.Scanner;
public class rumustrapesium{
	public static void main(String[] args) {

		Scanner nilai = new Scanner (System.in);

		double luas,keliling;

		
		System.out.println("MENGHITUNG LUAS TRAPESIUM");

		int tinggi,al,bae;

		System.out.print("Sisi A = ");
		al = nilai.nextInt();
		System.out.print("Sisi B = ");
		bae = nilai.nextInt();
		System.out.print("tinggi = ");
		tinggi = nilai.nextInt();
		luas = 0.5 * al + bae * tinggi;
		System.out.println("luas trapesium :" + luas);

		System.out.println("MENGHITUNG KELILING TRAPESIUM");

		int sisiA,sisiB,sisiC,sisiD;

		System.out.print("Sisi A = ");
		sisiA = nilai.nextInt();
		System.out.print("Sisi B = ");
		sisiB = nilai.nextInt();
		System.out.print("Sisi C = ");
		sisiC = nilai.nextInt();
		System.out.print("Sisi D = ");
		sisiD = nilai.nextInt();
		keliling = sisiA + sisiB + sisiC + sisiD;
		System.out.println("keliling trapesium :" + keliling);




	}	


		
}