package Proje.Bilet.com;

import java.util.Scanner;

public class EkHizmet  {
	double bagajUcret;
	double yemekUcret;
	double koltukUcret;
	
	public static void main(String[] args) {
	
		
	}
	
	public double BagajHakki() {
		System.out.println("2 Farklý Bagaj Hakkýnýz Bulunmaktadýr.");
		System.out.println("1. 8 Kg lýk kabin bagajýna ek olarak 20 Kg Bagaj.Ek ucret 34 Tl");
		System.out.println("2. 12 kg lýk kabin bagajýna ek olarak 15 Kg Bagaj.Ek ucret 45 Tl");
		Scanner input = new Scanner(System.in);
		int secim = input.nextInt();
		switch(secim) {
		
			case 1:
				bagajUcret = 34;
				System.out.println("Bagaj Hakký Ek Hizmetinin Ücreti 34 Tl dir");
				break;
			case 2:
				bagajUcret = 45;
				System.out.println("Bagaj Hakký Ek Hizmetinin Ücreti 45 Tl dir");
				break;
		}
		return bagajUcret ;
	};
	
	
	public double Yemek() {
		System.out.println("3 Farklý Menu Hakkýnýz Bulunmaktadýr.");
		System.out.println("1. Peynirli Sandwiç ve Kahve Menüsü.Ek ucret 20 Tl");
		System.out.println("2. Soslu Makarna ve Kola Menüsü .Ek ucret 30 Tl");
		System.out.println("3. Dilim Pasta ve Çay Menüsü.Ek ucret 25 Tl");
		Scanner input = new Scanner(System.in);
		int secim = input.nextInt();
		switch(secim) {
		
			case 1:
				yemekUcret = 20;
				System.out.println("Yemek Menusu Almanýn  Ek Hizmetinin Ücreti 20 Tl dir");
				break;
			case 2:
				yemekUcret = 30;
				System.out.println("Yemek Menusu Almanýn  Ek Hizmetinin Ücreti 30 Tl dir");
				break;
			case 3:
				yemekUcret = 25;
				System.out.println("Yemek Menusu Almanýn  Ek Hizmetinin Ücreti 25 Tl dir");
				break;
		}
		return yemekUcret;
	}
	
	public double KoltukSecUcreti() {
		System.out.println("Koltuk seçimi ücretlidir .Ek Ucret 20 Tl");
		System.out.println("1.Koltuk Seçimi Ýstiyorum ");
		System.out.println("2.Koltuk Seçimi Ýstemiyorum");
		Scanner input = new Scanner(System.in);
		int secim = input.nextInt();
		switch(secim) {
		
			case 1:
				koltukUcret = 20;
				System.out.println("Koltuk Seçimi Almanýn Ek Hizmetinin Ücreti 20 Tl dir");
				break;
			case 2:
				koltukUcret = 0;
				System.out.println("Koltuk Seçimi Almanýn Ek Hizmetinin Ücreti 20 Tl dir");
				break;
		}
		return koltukUcret;
	}
	
	public  void EkHizmetAl(EkHizmet ek) {
			
			do {
				Scanner input = new Scanner(System.in);
				BilgiMenusuUtils.EkHizmetSecenekleriniYazdir();
				int sec2 = input.nextInt();
				
				switch (sec2){
					case 1:
						
						ek.BagajHakki();
						break;
					case 2:
						
						ek.Yemek();
						break;
					case 3:
						
						ek.KoltukSecUcreti();
						break;}
						System.out.println("Ek Hizmet Menüsünden çýkýþ için 1 e basýn yada tekrar ek hizmet almak için 2 ye basýn");
						int deger = input.nextInt();
						if (deger == 2) {
							continue;
						}else {
							System.out.println("Çýkýþ yaptýnýz.");
							break;
						}}while(true);
			
			
		
		};

	public double EkHizmetToplamTutarGöster() {
		return this.bagajUcret + this.koltukUcret + this.yemekUcret;
	}
	


	
	
	
}
