import java.util.Scanner;
class lul{
	public static void main(String[] args) {
		int jumlah,i,j,swap;
		Scanner sa = new Scanner(System.in);

		System.out.println("Masukan jumlah bilangan yang mau diimputkan  : ");
		jumlah = sa.nextInt();

		int array[] = new int [jumlah];
		System.out.print("\n Masukan "+ jumlah + " Buah bilangan Integer : ");
		for (i=0;i<jumlah ;i++ ) {
			System.out.print("Bilangan ke- "+ (i+1)+" =");
			array[i] = sa.nextInt();
		}
		System.out.println("\n Bilangan Belum terurutnya");
		for (int a = 0;a<jumlah ;a++ ) {
			System.out.print(array[a]+ " ");
		}
		for (i = 0;i<jumlah ;i++ ) {
			for (j=0;j<jumlah-i-1 ;j++ ) {
				if (array[j] > array[j+1]) {
					swap = array[j];
					array[j] = array[j+1];
					array[j+1] = swap;
				}
			}
		}
		System.out.println("\n Bilangan terurutnya adalah : ");
		for (i=0;i<jumlah ;i++ ) {
			System.out.print(array[i]+ " ");
		}
	}
}