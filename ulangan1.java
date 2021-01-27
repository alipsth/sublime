import java.util.Scanner;
public class ulangan1{
	public static void main(String[] args) {
		int a,b,c,d,jam,cil,ss,ir,dx;
		double total,jumlah,banyak,bp,gr;
		String nama;
		Scanner riri = new Scanner(System.in);
		System.out.println("\n");
		System.out.println("\t --- Program Perhitungan Gaji Karyawan ---");
		System.out.println("\t -----------------------------------------");
		System.out.println("\n");
		System.out.print("\t Masukan Nama     : ");
		nama = riri.nextLine();
		System.out.print("\t Masukan Golongan : ");
		a = riri.nextInt();
		System.out.print("\t Jumlah jam Kerja : ");
		b = riri.nextInt();
		System.out.println("\n ");
		if (a == 1) {
			System.out.println("\t Nama Karyawan       : " + nama);
			System.out.println("\t Gaji Tetap Karyawan Adalah Rp. 500000");
			int gaji = 500000;
			System.out.println("\t Gaji Per jamnya     : Rp. 5000");
			int per = 5000;
			System.out.println("\t Jumlah Jam Kerjanya : " + b);
			if (b >= 150){
			System.out.println("\t Jumlah Jam Lembur   : " + (b - 150) );
			jam = (b - 150);
			System.out.println("\t Jumlah Gaji Lembur  : " + 1.5 * per * jam);
			total = 1.5 * per * jam;
			System.out.println("\t Total Gaji yang Diterima : Rp. " + (total + gaji));
			}
			else {
			System.out.println("\t Jumlah Jam Lembur   : " + 0);
			System.out.println("\t Jumlah Gaji Lembur  : " + 0);
			System.out.println("\t Total Gaji yang Diterima : Rp. " + gaji);	
			}
		}
		else if (a == 2) {
			System.out.println("\t Nama Karyawan       : " + nama);
			System.out.println("\t Gaji Tetap Karyawan Adalah Rp. 300000");
			int surs = 300000;
			System.out.println("\t Gaji Per jamnya     : Rp. 3000");
			int bar = 3000;
			System.out.println("\t Jumlah Jam Kerjanya : " + b);
			if (b > 150){ 
			System.out.println("\t Jumlah Jam Lembur   : " + (b - 150) );
			cil = (b - 150);
			System.out.println("\t Jumlah Gaji Lembur  : " + 1.5 * bar * cil);
			jumlah = 1.5 * bar * cil;
			System.out.println("\t Total Gaji yang Diterima : Rp. " + (jumlah + surs));
			}
			else {
			System.out.println("\t Jumlah Jam Lembur   : " + 0);
			System.out.println("\t Jumlah Gaji Lembur  : " + 0);
			System.out.println("\t Total Gaji yang Diterima : Rp. " + surs);
			}
		}
		else if (a == 3){
			System.out.println("\t Nama Karyawan       : " + nama);
			System.out.println("\t Gaji Tetap Karyawan Adalah Rp. 250000");
			int tl = 250000;
			System.out.println("\t Gaji Per jamnya     : Rp. 2000");
			int kn = 2000;
			System.out.println("\t Jumlah Jam Kerjanya : " + b);
			if (b > 150) {
			System.out.println("\t Jumlah Jam Lembur   : " + (b - 150) );
			ss = (b - 150);
			System.out.println("\t Jumlah Gaji Lembur  : " + 1.5 * kn * ss);
			banyak = 1.5 * kn * ss;
			System.out.println("\t Total Gaji yang Diterima : Rp. " + (banyak + tl));
			}
			else{
			System.out.println("\t Jumlah Jam Lembur        : " + 0);
			System.out.println("\t Jumlah Gaji Lembur       : " + 0);
			System.out.println("\t Total Gaji yang Diterima : Rp. " + tl);
			}
		}
		else if (a == 4) {
			System.out.println("\t Nama Karyawan       : " + nama);
			System.out.println("\t Gaji Tetap Karyawan Adalah Rp. 100000");
			int cpt = 100000;
			System.out.println("\t Gaji Per jamnya     : Rp. 1500");
			int amr = 1500;
			System.out.println("\t Jumlah Jam Kerjanya : " + b);
			if (b > 150) {
			System.out.println("\t Jumlah Jam Lembur   : " + (b - 150) );
			ir = (b - 150);
			System.out.println("\t Jumlah Gaji Lembur  : " + 1.5 * amr * ir);
			bp = 1.5 * amr * ir;
			System.out.println("\t Total Gaji yang Diterima : Rp. " + (bp + cpt));
			}
			else{
			System.out.println("\t Jumlah Jam Lembur   : " + 0);
			System.out.println("\t Jumlah Gaji Lembur  : " + 0);
			System.out.println("\t Total Gaji yang Diterima : Rp. " + cpt);
			}
		}
		else if (a == 5) {
			System.out.println("\t Nama Karyawan       : " + nama);
			System.out.println("\t Gaji Tetap Karyawan Adalah Rp. 50000");
			int gmr = 50000;
			System.out.println("\t Gaji Per jamnya     : Rp. 5000");
			int sl = 5000;
			System.out.println("\t Jumlah Jam Kerjanya : " + b);
			if (b > 150) {
			System.out.println("\t Jumlah Jam Lembur   : " + (b - 150) );
			dx = (b - 150);
			System.out.println("\t Jumlah Gaji Lembur  : " + 1.5 * sl * dx);
			gr = 1.5 * sl * dx;
			System.out.println("\t Total Gaji yang Diterima : Rp. " + (gr + gmr));
			}
			else{
			System.out.println("\t Jumlah Jam Lembur   : " + 0);
			System.out.println("\t Jumlah Gaji Lembur  : " + 0);
			System.out.println("\t Total Gaji yang Diterima : Rp. " + gmr);
			}
		}
		else {
			System.out.println("\t MAAF, KODE PROGRAM YANG ANDA MASUKAN SALAH!!!");
			System.out.println("\t Silahkan Cek Lagi Kode Program Yang Anda Masukan!!");	
		}
	}
}