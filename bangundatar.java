import java.util.Scanner;
public class bangundatar{
	public static void main(String[] args) {

		Scanner kuda = new Scanner(System.in);

		int entog,munding,gajah;
		double al,your,bae,dodol;

		System.out.println("\t ============================================");
		System.out.println("\t \t WELCOME TO MY SHIP ^_^");
        System.out.println("\t ============================================");
		System.out.println("\n");


		System.out.println("\t 1. BANGUN DATAR PERSEGI");
		System.out.println("\t\t keterangan menghitung luas dan keliling");
		System.out.println("\t\tA.menghitung Luas Persegi");
		System.out.println("\t\t keterangan Luas = s x s");
		System.out.print("\t\t Masukan Sisi Persegi : ");
		al = kuda.nextDouble();
		double sil =al*al;
		System.out.print("\t\t Maka Hasil Luas Persegi Adalah : "+ sil);
		System.out.println("\n");

		System.out.println("\t B.menghitung keliling Persegi");
		System.out.println("\t \t menghitung keliling Persegi");
		System.out.println("\t \t keterangan keliling = 4 x s");
		System.out.print("\t \t masukkan sisi Persegi : ");
		your = kuda.nextDouble();
		double sul =4*your;
		System.out.print("\t \t maka hasil keliling Adalah : " +sul);
		System.out.println("\n");


		System.out.println("\t 2. BANGUN DATAR SEGITIGA");
		System.out.println("\t \t A. menghitung luas segitiga");
		System.out.println("\t\t keterangan luas = 1/2 x A x T");
		System.out.print("\t \t Masukan alas segitiga :");
		bae = kuda.nextDouble();
		System.out.print("\t \t Masukan Tinggi segitiga :");
		dodol = kuda.nextDouble();
		double sol = 0.5*bae*dodol;
		System.out.print("\t \t maka Hasil luas segitiga Adalah : "+sol);
		System.out.println("\n");


		System.out.println("\t \t B.menghitung keliling segitiga");
		System.out.println("\t \t keterangan keliling = Sisi A + Sisi B + Sisi C");
		System.out.print("\t \t masukkan sisi A : ");
		entog = kuda.nextInt();
		System.out.print("\t \t masukkan sisi B : ");
		munding = kuda.nextInt();
		System.out.print("\t \t masukkan sisi C : ");
		gajah = kuda.nextInt();
		int sal =entog+munding+gajah;
		System.out.print("\t \t maka hasil luas Persegi Adalah : "+sal);
	}

}