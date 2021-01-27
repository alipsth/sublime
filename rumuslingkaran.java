import java.util.Scanner;
public class rumuslingkaran{
	public static void main(String[] args) {
		
		Scanner nilai = new Scanner(System.in);

        double luas,keliling;

        System.out.println("MENGHITUNG LUAS LINGKARAN");

        int al,bae;

        System.out.print("masukan jari jari = ");
		al = nilai.nextInt();
		System.out.print("masukan jari jari = ");
		bae = nilai.nextInt();
		luas = 3.14*al*bae;
		System.out.println("Luas Lingkaran = "+luas);

		System.out.println("MENGHITUNG KELILING LINGKARAN");

		int your;

		System.out.print("masukan jari jari = ");
		your = nilai.nextInt();
		keliling = 2 * 3.14 * your;
		System.out.println("keliling Lingkaran :" + keliling);


	}
}
