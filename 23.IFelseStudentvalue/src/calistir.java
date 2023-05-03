import java.util.Scanner;

public class calistir {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.print("Adinizi daxil edin:");
		String ad = scan.nextLine();

		System.out.print("Soyadinizi daxil edin:");
		String soyad = scan.nextLine();

		System.out.print("Dersi daxil edin:");
		String ders = scan.nextLine();

		System.out.print("Sdf1 qiymetinizi daxil edin:");
		double sdf1 = scan.nextDouble();

		System.out.print("Sdf2 qiymetinizi daxil edin:");
		double sdf2 = scan.nextDouble();

		System.out.print("Final qiymetinizi daxil edin:");
		double finalnot = scan.nextDouble();

		double netice = (sdf1 * 0.3) + (sdf2 * 0.3) + (finalnot * 0.4);
		if (netice >= 60) {
			System.out.print(
					ad + " " + soyad + " adli sagird " + ders + " dersinden " + netice + " ortalama ile gecmisdir.");
		} else {
			System.out.print("Siz kesildiniz...");
		}

	}
}
