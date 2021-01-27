import java.util.Scanner;
class haduh{
	public static void main(String[] args) {
		Scanner sa = new Scanner(System.in);

		int s,a,p=0;

		System.out.print("Masukan Jumlah Mahasiswa : ");
		s = sa.nextInt();
		int v = 3;

        int [][] r = new int [1000][1000];
		int [][] x = new int [1000][1000];
		int [][] z = new int [1000][1000];
		float [][] n = new float [1000][1000];

		for (int c=0;c<s ;c++ ) {
			System.out.println();
			for (int e=0;e==0 ;e++ ) {
				System.out.println("Mahasiswa "+(c+1));
				System.out.print("Nilai Tes 1 : ");
			    r[c][e] = sa.nextInt();
			    System.out.print("Nilai Tes 2 : ");
			    x[c][e] = sa.nextInt();
                System.out.print("Nilai Tes 3 : ");
                z[c][e]= sa.nextInt();
                break;
			}
			System.out.println();
		}
		System.out.println("======================================================");
		System.out.println("\t\t Daftar Nilai Siswa : ");
		System.out.println("======================================================");
		System.out.println("\t\t Test 1    Test 2    Test 3    Rata Rata");

		for (int c = 0;c<s ;c++ ) {
			int b = c+1;
			System.out.print("Mahasiswa "+b);
			for (int e = 0;e<v ;e++ ) {
				n[c][e] = (r[c][e]+x[c][e]+z[c][e])/3;
				System.out.println("\t     "+r[c][e]+ "\t    "+x[c][e]+"\t     "+z[c][e]+"\t        "+n[c][e]);
				break;
			}
		}
	}
}