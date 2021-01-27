import java.util.Scanner;
public class input{
	public static void main(String[] args) {
		
		Scanner al = new Scanner(System.in);

		String nama;
		int umur;

		System.out.print ("masukan nama kmu ;" );
		nama = al.nextLine();
		System.out.println ("\n");
		System.out.println("nama kmu teh geningan : "+nama);

		System.out.print("masukan umur kamu :");
		umur = al.nextInt();
		System.out.println("Umur kamu teh ternyata : "+umur);


	}
}