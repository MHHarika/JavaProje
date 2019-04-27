package Proje.Bilet.com;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Odeme {
	
	private boolean bilgiMaili;
	private long kartNo;
	private double odenecektutar;
	private YolcuBilgileri yolcuod;
	private UcusSeferBilgileri ucusod;
	private EkHizmet hizmetod;
	private String odemeTarih;


	
	public void OdemeAl(UcusSeferBilgileri ucusod,YolcuBilgileri yolcuod,EkHizmet hizmetod) {
		
		//satýn alýnan biletlerin bilgileri gösterilir.
		
		if (ucusod.getDonusKod()==0) {
		Veritabaný.secilenUcusGöster(ucusod.getGidisKod());}
		else {                     
			Veritabaný.secilenUcusGöster(ucusod.getGidisKod());
			Veritabaný.secilenUcusGöster(ucusod.getDonusKod());
		};
		
		//hizmet tutarý görüntülenir.
		
		System.out.println("******Ödenecek Hizmet Tutarý*******");
		System.out.println("                                        ");
		hizmetod.EkHizmetToplamTutarGöster();
		System.out.println("Bilet ve Alýnan Ek Hizmetlerle Birlikte Ödenmesi Gereken Toplam Tutar: ");
		if (ucusod.getDonusKod()==0) {
		float fiyats =Veritabaný.UcusFiyatGöster(ucusod.getGidisKod());
		ucusod.setFiyat(fiyats);}
		else {
		float fiyats =Veritabaný.UcusFiyatGöster(ucusod.getGidisKod());
		float fiyatd = Veritabaný.UcusFiyatGöster(ucusod.getDonusKod());
		float fiyattop = fiyats + fiyatd;
		ucusod.setFiyat(fiyattop);
		}
		double sonTutar = ucusod.getFiyat() + hizmetod.EkHizmetToplamTutarGöster(); 
		setOdenecektutar(sonTutar);
		System.out.println("ÖDENECEK HÝZMET TUTARI: " + sonTutar);
		
		//kullanýcýdan  kart bilgisi alýnýr ve ödeme iþlemine geçilir.
		
		Scanner kart = new Scanner(System.in);
		System.out.println("                                                          ");
		System.out.println("Satýn Alma Ýþlemi Ýçin Lütfen Kart Bilgilerinizi Giriniz: ");
		long kno = kart.nextLong();
		System.out.println(".........................................................................................");
		System.out.println("Banka verileri doðrulanýyor lütfen bekleyiniz.Ödemeniz onaylandýðýnda onay kodu verilecektir.");
		System.out.println("Ýþlem baþarýyla gerçekleþti ve ödemeniz onaylandý ..");
		
		String dt=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime());
		setOdemeTarih(dt);
		System.out.println("Ödeme Tarihi Ve Saati");
		System.out.println( new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime()) );
		System.out.println("                                                                                    ");
	}

	public boolean isBilgiMaili() {
		return bilgiMaili;
	}

	public void setBilgiMaili(boolean bilgiMaili) {
		this.bilgiMaili = bilgiMaili;
	}

	public long getKartNo() {
		return kartNo;
	}

	public void setKartNo(long kartNo) {
		this.kartNo = kartNo;
	}

	public double getOdenecektutar() {
		return odenecektutar;
	}

	public void setOdenecektutar(double odenecektutar) {
		this.odenecektutar = odenecektutar;
	}

	public YolcuBilgileri getYolcuod() {
		return yolcuod;
	}

	public void setYolcuod(YolcuBilgileri yolcuod) {
		this.yolcuod = yolcuod;
	}

	public UcusSeferBilgileri getUcusod() {
		return ucusod;
	}

	public void setUcusod(UcusSeferBilgileri ucusod) {
		this.ucusod = ucusod;
	}

	public EkHizmet getHizmetod() {
		return hizmetod;
	}

	public void setHizmetod(EkHizmet hizmetod) {
		this.hizmetod = hizmetod;
	}

	public String getOdemeTarih() {
		return odemeTarih;
	}

	public void setOdemeTarih(String odemeTarih) {
		this.odemeTarih = odemeTarih;
	}
	
	
	
}
