import java.util.Scanner;

public class calisiyor {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Sdf1 qiymetinizi daxil edin:");
		double sdf1 = scan.nextDouble();
		
		System.out.print("Sdf2 qiymetinizi daxil edin:");
		double sdf2 = scan.nextDouble();
		
		System.out.print("Final qiymeti daxil edin:");
		double finalnot = scan.nextDouble();
		
		double sonuc = (sdf1*0.3)+(sdf2*0.3)+(finalnot*0.4);
		
		if(sonuc>=90) {
			System.out.println("Sizin qiymetiniz:A");
		}
		else if (sonuc>=80) {
			System.out.println("Sizin qiymetiniz:B");
			
		}
		else if (sonuc>=70) {
			System.out.println("Sizin qiymetiniz:C");
			
		}
		else if (sonuc>=60) {
			System.out.println("Sizin qiymetiniz:D");
			
			
		}
		else {
			System.out.println("Siz bu imtahandan kesildiniz...");
		}
	}

}
