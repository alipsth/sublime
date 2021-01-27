import java.util.Scanner;
public class datar{
	public static void main(String[] args) {
		
		Scanner kuda = new Scanner(System.in);

		int al,your;
		double x,y;


		System.out.println("1. menghitung luas persegi panjang");
		System.out.print("masukan panjang = ");
		al = kuda.nextInt();
		System.out.print("masukan lebar = ");
		your = kuda.nextInt();
		int sil =al*your;
		System.out.println("hasil luas persegi panjang = " + sil);

		System.out.println("2. menghitung luas lingkaran");
		System.out.println("menghitung luas lingkaran");
		System.out.print("masukan jari jari = ");
		y = kuda.nextDouble();
		double sol = 3.14*y*y;
		System.out.println("luas lingkaran = " + sol);
		System.out.println("\n");

		// (==)	Definisi Sama.
	   System.out.println("luas persegi== luas lingkaran : "+(sil == sol)+
	   ".");
	   // (!=)	Definisi Tidak Sama
	   System.out.println("luas persegi!= luas lingkaran : "+(sil !=sol)+
	  ".");
	  // (>) Lebih Besar
	  System.out.println("luas persegi> luas lingkaran  : "+(sil >sol)+
	  ".");
	  // (>) Lebih kecil
	  System.out.println("luas persegi <= luas lingkaran : "+(sil <sol)+
	  ".");
	  // (>=) Lebih besar sama dengan
	  System.out.println(" luas persegi >+ luas lingkaran :"+(sil >=sol)+
	  ".");



	


	}
}