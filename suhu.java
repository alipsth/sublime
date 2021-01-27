import java.util.Scanner;
public class suhu{
	public static void main(String[] args) {
		
		Scanner easthood = new Scanner(System.in);
		System.out.println("\n");

		System.out.println("\t==============================");
		System.out.println("\t Welcome to lierdemina21");
        System.out.println("\t==============================");
        
        System.out.print("\t Masukkan Suhu Celcius  : " );
        int c =easthood.nextInt();
        int hasil =c*4/5;
        int total =c*9/5+32;
        int jumlah =c+273;
        System.out.print("\t\t Masukkan hasil dari celcius ke reamur adalah :  "+hasil );
        System.out.println("\n");
        System.out.print("\t\t Masukkan hasil dari celcius ke Fahreinheit   :  "+total);
        System.out.println("\n");
        System.out.print("\t\t Masukkan hasil dari celcius ke kelvin        :  "+jumlah);
	}
}