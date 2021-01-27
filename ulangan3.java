import java.util.Scanner;
class ulangan3{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int jumlah=1;
		System.out.println("\n");
		System.out.print("Masukan Bilangan = ");
		int bilangan = in.nextInt();
		System.out.print("Masukan Pangkat  = ");
		int pangkat = in.nextInt();
		int hasil = (int) Math.pow(bilangan,pangkat);
		for (int a=1;a<=pangkat ;a++ ) {
			System.out.print(+bilangan);
			System.out.print(" x ");
			
		}
		System.out.print(" = " +hasil);
	}
}