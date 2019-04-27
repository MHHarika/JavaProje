package Proje.Bilet.com;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class YolcuBilgileri {
	private String ad;
	private String soyad;
	private String tc;
	private String cepNo;
	private String mail;
	private String cinsiyet;
	private String dogumTarihi ;
	
	
	
	
	public String getAd() {
		return ad;
	}




	public void setAd(String ad) {
		this.ad = ad;
	}




	public String getSoyad() {
		return soyad;
	}




	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}




	public String getTc() {
		return tc;
	}




	public void setTc(String tc) {
		this.tc = tc;
	}




	public String getCepNo() {
		return cepNo;
	}




	public void setCepNo(String cepNo) {
		this.cepNo = cepNo;
	}




	public String getMail() {
		return mail;
	}




	public void setMail(String mail) {
		this.mail = mail;
	}




	public String getCinsiyet() {
		return cinsiyet;
	}




	public void setCinsiyet(String cinsiyet) {
		this.cinsiyet = cinsiyet;
	}




	public String getDogumTarihi() {
		return dogumTarihi;
	}




	public void setDogumTarihi(String dogumTarihi) {
		this.dogumTarihi = dogumTarihi;
	}




	public void YolcuBilgiAl(YolcuBilgileri yolcu) {
		System.out.println("Bilet i�in gerekli bilgileri giriniz:");
		Scanner input = new Scanner(System.in);
		System.out.print("Ad�n�z: ");
		String ad = input.next();
		System.out.print("Soyad�n�z: ");
		String soyad = input.next();
		System.out.print("Tc numaran�z: ");
		String tc = input.next();
		System.out.print("Cep numaran�z: ");
		String cep = input.next();
		System.out.print("Mail adresiniz: ");
		String mail = input.next();
		System.out.print("Cinsiyetiniz: " + "Kad�n: K / Erkek : E");
		String cinsiyet = input.next();
		System.out.print("Do�um Tarihiniz: " + "Y�l - Ay- Gun: ");
		String dtarih = input.next();
		Veritaban�.YolcuBilgisiEkle(ad, soyad, tc, cep, mail, cinsiyet, dtarih);
		
		
		yolcu.setAd(ad);
		yolcu.setSoyad(soyad);
		yolcu.setTc(tc);
		yolcu.setCepNo(cep);
		yolcu.setMail(mail);
		yolcu.setCinsiyet(cinsiyet);
		yolcu.setDogumTarihi(dtarih);
		
	}
	
	
}
