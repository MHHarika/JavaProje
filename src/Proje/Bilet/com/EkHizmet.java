package Proje.Bilet.com;

import java.util.Scanner;

public class EkHizmet  {
	double bagajUcret;
	double yemekUcret;
	double koltukUcret;
	
	public static void main(String[] args) {
	
		
	}
	
	public double BagajHakki() {
		System.out.println("2 Farkl� Bagaj Hakk�n�z Bulunmaktad�r.");
		System.out.println("1. 8 Kg l�k kabin bagaj�na ek olarak 20 Kg Bagaj.Ek ucret 34 Tl");
		System.out.println("2. 12 kg l�k kabin bagaj�na ek olarak 15 Kg Bagaj.Ek ucret 45 Tl");
		Scanner input = new Scanner(System.in);
		int secim = input.nextInt();
		switch(secim) {
		
			case 1:
				bagajUcret = 34;
				System.out.println("Bagaj Hakk� Ek Hizmetinin �creti 34 Tl dir");
				break;
			case 2:
				bagajUcret = 45;
				System.out.println("Bagaj Hakk� Ek Hizmetinin �creti 45 Tl dir");
				break;
		}
		return bagajUcret ;
	};
	
	
	public double Yemek() {
		System.out.println("3 Farkl� Menu Hakk�n�z Bulunmaktad�r.");
		System.out.println("1. Peynirli Sandwi� ve Kahve Men�s�.Ek ucret 20 Tl");
		System.out.println("2. Soslu Makarna ve Kola Men�s� .Ek ucret 30 Tl");
		System.out.println("3. Dilim Pasta ve �ay Men�s�.Ek ucret 25 Tl");
		Scanner input = new Scanner(System.in);
		int secim = input.nextInt();
		switch(secim) {
		
			case 1:
				yemekUcret = 20;
				System.out.println("Yemek Menusu Alman�n  Ek Hizmetinin �creti 20 Tl dir");
				break;
			case 2:
				yemekUcret = 30;
				System.out.println("Yemek Menusu Alman�n  Ek Hizmetinin �creti 30 Tl dir");
				break;
			case 3:
				yemekUcret = 25;
				System.out.println("Yemek Menusu Alman�n  Ek Hizmetinin �creti 25 Tl dir");
				break;
		}
		return yemekUcret;
	}
	
	public double KoltukSecUcreti() {
		System.out.println("Koltuk se�imi �cretlidir .Ek Ucret 20 Tl");
		System.out.println("1.Koltuk Se�imi �stiyorum ");
		System.out.println("2.Koltuk Se�imi �stemiyorum");
		Scanner input = new Scanner(System.in);
		int secim = input.nextInt();
		switch(secim) {
		
			case 1:
				koltukUcret = 20;
				System.out.println("Koltuk Se�imi Alman�n Ek Hizmetinin �creti 20 Tl dir");
				break;
			case 2:
				koltukUcret = 0;
				System.out.println("Koltuk Se�imi Alman�n Ek Hizmetinin �creti 20 Tl dir");
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
						System.out.println("Ek Hizmet Men�s�nden ��k�� i�in 1 e bas�n yada tekrar ek hizmet almak i�in 2 ye bas�n");
						int deger = input.nextInt();
						if (deger == 2) {
							continue;
						}else {
							System.out.println("��k�� yapt�n�z.");
							break;
						}}while(true);
			
			
		
		};

	public double EkHizmetToplamTutarG�ster() {
		return this.bagajUcret + this.koltukUcret + this.yemekUcret;
	}
	


	
	
	
}
