package Proje.Bilet.com;

import java.sql.Time;
import java.time.LocalTime;

public class Rezervasyon {
	private int rezervasyon_no;
	private String rez_tarihi;
	private Odeme rezod;
	private UcusSeferBilgileri rezsefer;
	private YolcuBilgileri rezyolcu;
	
	public int getRezervasyon_no() {
		return rezervasyon_no;
	}



	public void setRezervasyon_no(int rezervasyon_no) {
		this.rezervasyon_no = rezervasyon_no;
	}



	public String getRez_tarihi() {
		return rez_tarihi;
	}






	public void setRez_tarihi(String rez_tarihi) {
		this.rez_tarihi = rez_tarihi;
	}




	public Odeme getRezod() {
		return rezod;
	}


	public void setRezod(Odeme rezod) {
		this.rezod = rezod;
	}


	
	
	
	public UcusSeferBilgileri getRezsefer() {
		return rezsefer;
	}



	public void setRezsefer(UcusSeferBilgileri rezsefer) {
		this.rezsefer = rezsefer;
	}



	public YolcuBilgileri getRezyolcu() {
		return rezyolcu;
	}



	public void setRezyolcu(YolcuBilgileri rezyolcu) {
		this.rezyolcu = rezyolcu;
	}



	public void RezervasyonGoster(Odeme od,UcusSeferBilgileri rezsefer,YolcuBilgileri rezyolcu) {
		System.out.println("*************Yapýlan rezervasyonun bilgileri*************** ");
		System.out.println("*************************************************************");
		if (rezsefer.getDonusKod()==0) {
		Veritabaný.secilenUcusGöster(rezsefer.getGidisKod());}
		else {
			Veritabaný.secilenUcusGöster(rezsefer.getGidisKod());
			Veritabaný.secilenUcusGöster(rezsefer.getDonusKod());
			
		};
		Veritabaný.BiletYolcuBilgisiGöster(rezyolcu.getTc());
		System.out.println("Rezervasyon için yapýlan ödeme tutarýnýz: " + od.getOdenecektutar());
		System.out.println("                                                                   ");
		System.out.println("Rezervasyon kodunuz: " + rezervasyonNoYap( rezsefer, rezyolcu));
		setRez_tarihi(od.getOdemeTarih());
		System.out.println("Rezervasyon Tarihi: " + getRez_tarihi());
		
		
	}
 
	
	
	public int rezervasyonNoYap(UcusSeferBilgileri rezsefer,YolcuBilgileri rezyolcu) {
		if (rezsefer.getDonusKod()==0) {
		int kodparca1 = rezsefer.getGidisKod();
		setRezervasyon_no(kodparca1);
		}
		
		else {
			int kodparca1 = rezsefer.getGidisKod();
			int kodparca2 = rezsefer.getDonusKod();
			int son = kodparca1 + kodparca2;
			setRezervasyon_no(son);
			
		};
		
		
		return rezervasyon_no ;
	}



}

