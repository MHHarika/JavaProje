package Proje.Bilet.com;

import java.sql.Time;
import java.util.Scanner;

public class UcusSeferBilgileri  {
	private double fiyat;
	private Time sure;
	private String nereden;
	private String nereye;
	private boolean aktarma;
	private String gidisUcusuTarihi;
	private String donusUcusuTarihi;
	private Time saat;
	private int  seferno;
	private int gidisKod;
	private int donusKod;
	
	
	
	
	public double getFiyat() {
		return fiyat;
	}




	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}




	public Time getSure() {
		return sure;
	}




	public void setSure(Time sure) {
		this.sure = sure;
	}




	public String getNereden() {
		return nereden;
	}




	public void setNereden(String nereden) {
		this.nereden = nereden;
	}




	public String getNereye() {
		return nereye;
	}




	public void setNereye(String nereye) {
		this.nereye = nereye;
	}




	public boolean isAktarma() {
		return aktarma;
	}




	public void setAktarma(boolean aktarma) {
		this.aktarma = aktarma;
	}





	public int getSeferno() {
		return seferno;
	}




	public void setSeferno(int seferno) {
		this.seferno = seferno;
	}


	
	
	public int getGidisKod() {
		return gidisKod;
	}




	public void setGidisKod(int gidisKod) {
		this.gidisKod = gidisKod;
	}




	public int getDonusKod() {
		return donusKod;
	}




	public void setDonusKod(int donusKod) {
		this.donusKod = donusKod;
	}




	public String getGidisUcusuTarihi() {
		return gidisUcusuTarihi;
	}




	public void setGidisUcusuTarihi(String gidisUcusuTarihi) {
		this.gidisUcusuTarihi = gidisUcusuTarihi;
	}




	public String getDonusUcusuTarihi() {
		return donusUcusuTarihi;
	}




	public void setDonusUcusuTarihi(String donusUcusuTarihi) {
		this.donusUcusuTarihi = donusUcusuTarihi;
	}


	
	
	public Time getSaat() {
		return saat;
	}




	public void setSaat(Time saat) {
		this.saat = saat;
	}




	public void UcusSeferBilgisiAl(UcusSeferBilgileri sefer) {
		
		System.out.println("L�tfen arad���n�z u�u� i�in gerekli bilgileri giriniz:");
		Scanner input = new Scanner(System.in);
		System.out.println("1.Gidi�-d�n�� " + "2.Tek y�n");
		int secim = input.nextInt();
		switch(secim) {
		case 1:
			
			System.out.print("Nereden: ");
			String nereden = input.next();
			System.out.print("Nereye: ");
			String nereye = input.next();
			System.out.print("Gidi� Tarihi: ");
			String gtarih = input.next();
			System.out.print("D�n�� Tarihi: ");
			String dtarih = input.next();
			System.out.println("Gidi� u�u�u i�in bir ucuskodu se�imi yap�n: ");
			Veritaban�.seferListele(nereden, nereye, gtarih);
			int gkod = input.nextInt();
			gidisKod = gkod;
			System.out.println("Se�ilen Gidi� u�u�unun kodu:" + gkod);
			System.out.println(" **************************************** ");
			System.out.println(" **************************************** ");
			System.out.println("D�n�� u�u�u i�in bir ucuskodu se�imi yap�n: ");
			Veritaban�.seferListele(nereye, nereden, dtarih);
			int dkod = input.nextInt();
			donusKod = dkod;
			System.out.println("Se�ilen d�n�� u�u�unun kodu: " + dkod);
			
			
			
			sefer.setNereden(nereden);
			sefer.setNereye(nereye);
			sefer.setDonusUcusuTarihi(dtarih);
			sefer.setGidisUcusuTarihi(gtarih);
			sefer.setGidisKod(gkod);
			sefer.setDonusKod(dkod);
			
			
			break;
			
		case 2:
			
			System.out.print("Nereden: ");
			String nereden1 = input.next();
			System.out.print("Nereye: ");
			String nereye1 = input.next();
			System.out.print("Gidi� Tarihi: ");
			String gtarih1 = input.next();
			System.out.println("Gidi� u�u�u i�in bir ucuskodu se�imi yap�n: ");
			Veritaban�.seferListele(nereden1, nereye1, gtarih1);
			
			System.out.println(" **************************************** ");
			int gkod1 = input.nextInt();
			gidisKod = gkod1;
			System.out.println("Se�ilen Gidi� u�u�unun kodu:" + gkod1);
			
			
			
		
			sefer.setNereden(nereden1);
			sefer.setNereye(nereye1);
			sefer.setGidisUcusuTarihi(gtarih1);
			sefer.setGidisKod(gkod1);
		
			
			break;
		}
		
		
	}
	
	
	
	

}
