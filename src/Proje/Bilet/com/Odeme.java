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
		
		//sat�n al�nan biletlerin bilgileri g�sterilir.
		
		if (ucusod.getDonusKod()==0) {
		Veritaban�.secilenUcusG�ster(ucusod.getGidisKod());}
		else {                     
			Veritaban�.secilenUcusG�ster(ucusod.getGidisKod());
			Veritaban�.secilenUcusG�ster(ucusod.getDonusKod());
		};
		
		//hizmet tutar� g�r�nt�lenir.
		
		System.out.println("******�denecek Hizmet Tutar�*******");
		System.out.println("                                        ");
		hizmetod.EkHizmetToplamTutarG�ster();
		System.out.println("Bilet ve Al�nan Ek Hizmetlerle Birlikte �denmesi Gereken Toplam Tutar: ");
		if (ucusod.getDonusKod()==0) {
		float fiyats =Veritaban�.UcusFiyatG�ster(ucusod.getGidisKod());
		ucusod.setFiyat(fiyats);}
		else {
		float fiyats =Veritaban�.UcusFiyatG�ster(ucusod.getGidisKod());
		float fiyatd = Veritaban�.UcusFiyatG�ster(ucusod.getDonusKod());
		float fiyattop = fiyats + fiyatd;
		ucusod.setFiyat(fiyattop);
		}
		double sonTutar = ucusod.getFiyat() + hizmetod.EkHizmetToplamTutarG�ster(); 
		setOdenecektutar(sonTutar);
		System.out.println("�DENECEK H�ZMET TUTARI: " + sonTutar);
		
		//kullan�c�dan  kart bilgisi al�n�r ve �deme i�lemine ge�ilir.
		
		Scanner kart = new Scanner(System.in);
		System.out.println("                                                          ");
		System.out.println("Sat�n Alma ��lemi ��in L�tfen Kart Bilgilerinizi Giriniz: ");
		long kno = kart.nextLong();
		System.out.println(".........................................................................................");
		System.out.println("Banka verileri do�rulan�yor l�tfen bekleyiniz.�demeniz onayland���nda onay kodu verilecektir.");
		System.out.println("��lem ba�ar�yla ger�ekle�ti ve �demeniz onayland� ..");
		
		String dt=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime());
		setOdemeTarih(dt);
		System.out.println("�deme Tarihi Ve Saati");
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
