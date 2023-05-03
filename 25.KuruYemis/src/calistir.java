
public class calistir {

	public static void main(String[] args) {

		/*
		 
		 Çərəz topdan saticisi:
		 12 kolu qozu.kolusunu 3.5 Azn
		 25 kolu fındığı.kolusunu 15.7 Azn
		 40 kolu badem .kolusunu 22 Azn
		 
		 Bu məhsulları satan zaman
		 -- Qozun kolusunu %50 artıq
		 -- Fındığ kolusunu %40 artıq
		 -- Badam kolusunu %60 artıq
		 
		 Çərəzci o günü qazandığı pul ilə dükanın kirasını vermək istəyir
		 
		 kirayə qiyməti: 500 Azn
		 qazandığı pul 500 Azn-dan yüksək  kirayə  verə bilərsən.....
		 
		 */
		
		
		//qiymetler
		double qoz = 3.5;
		double findiq = 15.7;
		double badam = 22;
		
		double maaliyetTutar = qoz*12 + findiq*25 + badam*40;
		double satisTutar = (qoz*1.5)*12 + (findiq*1.4)*25 + (badam*1.6)*40;
		
		double kaarTutar = satisTutar - maaliyetTutar;
		    if(kaarTutar>=500) {
		    	System.out.println("Kiraye odenildi..");
		    }
		   else {
			System.out.println("Kiraye odenile bilmedi...");
		}
		System.out.println("MliyetTutari:"+maaliyetTutar);
		System.out.println("SatisTutari:"+satisTutar);
		System.out.println("KaarTutari:"+kaarTutar);
	}

}
