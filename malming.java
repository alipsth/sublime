import java.util.Scanner;
public class malming{
	public static void main(String[] args) {
		String aku,dia;
		Scanner bucin = new Scanner(System.in);

		System.out.println("\n ============ Malam rabunya programmer============");
		System.out.print("\n KAMU PILIH AKU ATAU DIA ??? ");
		aku = bucin.nextLine();
		switch(aku){
			case "aku":
			System.out.println(" insya allah saya akan bikin kamu bahagia,dengan apa yg saya punya :)");
			break;
			case "dia":
			System.out.println(" semoga kmu bahagia sama dia dan inget satuhal saya akan selalu ada buat kmu :)");

		}
	}
}
