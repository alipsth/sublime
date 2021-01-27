import java.util.Scanner;
public class Aplikasi{
	public static void main(String[] args) {
		
		Scanner nilai = new Scanner (System.in);

		double luas,keliling;

		System.out.println("\n");

		System.out.println("Nama Anggota:");
		System.out.println("Muhammad Alghani");
		System.out.println("Andrian Ramdani");
		System.out.println("Rifa Ramdani");
		System.out.println("\n");

		System.out.println("\t ********************************************************************");
		System.out.println("\t SELAMAT DATANG DI APLIKASI MENGHITUNG LUAS DAN KELILING BANGUN DATAR");
		System.out.println("\t ********************************************************************");

		System.out.println("\n");

		System.out.println("\t A.MENGHITUNG LUAS JAJAR GENJANG");

		System.out.println("\n");

		int a,t;

		System.out.print("\t masukan alas   = ");
		a = nilai.nextInt();
		System.out.print("\t masukan tinggi = ");
		t = nilai.nextInt();
		luas = a*t;
		System.out.println("\t luas jajar genjang :" + luas);

		System.out.println("\n");

		System.out.println("\t B.MENGHITUNG KELILING JAJAR GENJANG");

		System.out.println("\n");

		int sisiA,sisiB;
		System.out.print("\t Sisi A = ");
		sisiA = nilai.nextInt();
		System.out.print("\t Sisi B = ");
		sisiB = nilai.nextInt();
		keliling = 2 * sisiA + sisiB;
		System.out.println("\t keliling jajar genjang :" + keliling);

		System.out.println("\n");

		System.out.println("\t C.MENGHITUNG LUAS BELAH KETUPAT");

		System.out.println("\n");

		int al,bae;

		System.out.print("\t diagonal 1 = ");
		al = nilai.nextInt();
		System.out.print("\t diagonal 2 = ");
		bae = nilai.nextInt();
		luas = 0.5 * al * bae ;
		System.out.println("\t luas belah ketupat :" + luas);

		System.out.println("\n");

		System.out.println("\t D.MENGHITUNG KELILING BELAH KETUPAT");

		System.out.println("\n");

		int sisi;

		System.out.print("\t masukan sisi = ");
		sisi = nilai.nextInt();
		keliling = 4 * sisi;
		System.out.println("\t keliling belah ketupat :" + keliling);

		System.out.println("\n");

		System.out.println("\t E.MENGHITUNG LUAS LAYANG-LAYANG");

		System.out.println("\n");

		int d1 , d2 ;

		System.out.print("\t Diagonal 1 = ");
		d1 = nilai.nextInt();
		System.out.print("\t Diagonal 2 = ");
		d2 = nilai.nextInt();
		luas = d1 * d2 / 2 ;
		System.out.println("\t Luas Layang-layang = "+luas);

		System.out.println("\n");

		System.out.println("\t F.MENGHITUNG KELILING LAYANG-LAYANG");

		System.out.println("\n");

		int sisiC , sisiD ;

		System.out.print("\t Masukan Sisi A = ");
		sisiC = nilai.nextInt();
		System.out.print("\t Masukan Sisi B = ");
		sisiD = nilai.nextInt();
		keliling = 2* sisiA + 2*sisiB;
		System.out.println("\t Keliling Layang-layang = "+keliling);
		System.out.println("\t Jadi Luas layang-layang = "+luas+ " dan Keliling = "+keliling);

		System.out.println("\n");


		System.out.println("\t G.MENGHITUNG LUAS LINGKARAN");

		System.out.println("\n");

        int v,z;

        System.out.print("\t masukan jari jari = ");
		v = nilai.nextInt();
		System.out.print("\t masukan jari jari = ");
		z = nilai.nextInt();
		luas = 3.14*v*z;
		System.out.println("\t Luas Lingkaran = "+luas);

		System.out.println("\n");


		System.out.println("\t H.MENGHITUNG KELILING LINGKARAN");

		System.out.println("\n");

		int w;

		System.out.print("\t masukan jari jari = ");
		w = nilai.nextInt();
		keliling = 2 * 3.14 * w;
		System.out.println("\t keliling Lingkaran :" + keliling);

		System.out.println("\n");


		System.out.println("\t I.MENGHITUNG LUAS PERSEGI PANJANG");

		System.out.println("\n");


		int p,l;

		System.out.print("\t Masukan Panjang = ");
		p = nilai.nextInt();
		System.out.print("\t Masukan   Lebar = ");
		l = nilai.nextInt();
		luas = p * l ;
		System.out.println("\t luas persegi Panjang :" + luas);

		System.out.println("\n");


		System.out.println("\t J.MENGHITUNG KELILING PERSEGI");

		System.out.println("\n");


		int m,n;

		System.out.print("\t Panjang = ");
		m = nilai.nextInt();
		System.out.print("\t Lebar = ");
		n = nilai.nextInt();
		keliling = 2*m+n;
		System.out.println("\t keliling persegi Panjang :" + keliling);

		System.out.println("\n");

		System.out.println("\t K.MENGHITUNG LUAS PERSEGI");

		System.out.println("\n");

		int sisiE,sisiF;

		System.out.print("\t Sisi A = ");
		sisiE = nilai.nextInt();
		System.out.print("\t Sisi B = ");
		sisiF = nilai.nextInt();
		luas = sisiE * sisiF ;
		System.out.println("\t luas persegi :" + luas);

		System.out.println("\n");

		System.out.println("\t L.MENGHITUNG KELILING PERSEGI");

		System.out.println("\n");

		int your;

		System.out.print("\t Masukan Sisi = ");
		your = nilai.nextInt();
		keliling = 4 * your;
		System.out.println("\t keliling persegi :" + keliling);

		System.out.println("\n");

		System.out.println("\t M.MENGHITUNG LUAS SEGITIGA");

		System.out.println("\n");

		int aa,tt;

		System.out.print("\t masukan alas   = ");
		aa = nilai.nextInt();
		System.out.print("\t masukan tinggi = ");
		tt = nilai.nextInt();
		luas = 0.5*aa*tt; 
		System.out.println("\t luas segitiga :" + luas);

		System.out.println("\n");

		System.out.println("\t N.MENGHITUNG KELILING SEGITIGA");

		System.out.println("\n");

		int sisiG,sisiH,sisiI;

		System.out.print("\t Sisi A = ");
		sisiG = nilai.nextInt();
		System.out.print("\t Sisi B = ");
		sisiH = nilai.nextInt();
		System.out.print("\t Sisi C = ");
		sisiI = nilai.nextInt();
		keliling = sisiG+sisiH+sisiI;
		System.out.println("\t keliling segitiga :" + keliling);

		System.out.println("\n");

		System.out.println("\t O.MENGHITUNG LUAS TRAPESIUM");

		System.out.println("\n");

		int wd,ws,wa;

		System.out.print("\t Sisi A = ");
		wd = nilai.nextInt();
		System.out.print("\t Sisi B = ");
		ws = nilai.nextInt();
		System.out.print("\t tinggi = ");
		wa = nilai.nextInt();
		luas = 0.5 * wd + ws * wa;
		System.out.println("\t luas trapesium :" + luas);

		System.out.println("\n");

		System.out.println("\t P.MENGHITUNG KELILING TRAPESIUM");

		System.out.println("\n");

		int sisiJ,sisiK,sisiL,sisiM;

		System.out.print("\t Sisi A = ");
		sisiJ = nilai.nextInt();
		System.out.print("\t Sisi B = ");
		sisiK = nilai.nextInt();
		System.out.print("\t Sisi C = ");
		sisiL = nilai.nextInt();
		System.out.print("\t Sisi D = ");
		sisiM = nilai.nextInt();
		keliling = sisiJ + sisiK + sisiL + sisiM;
		System.out.println("\t keliling trapesium :" + keliling);






	}



	
}