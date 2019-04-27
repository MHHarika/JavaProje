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
		System.out.println("Bilet için gerekli bilgileri giriniz:");
		Scanner input = new Scanner(System.in);
		System.out.print("Adýnýz: ");
		String ad = input.next();
		System.out.print("Soyadýnýz: ");
		String soyad = input.next();
		System.out.print("Tc numaranýz: ");
		String tc = input.next();
		System.out.print("Cep numaranýz: ");
		String cep = input.next();
		System.out.print("Mail adresiniz: ");
		String mail = input.next();
		System.out.print("Cinsiyetiniz: " + "Kadýn: K / Erkek : E");
		String cinsiyet = input.next();
		System.out.print("Doðum Tarihiniz: " + "Yýl - Ay- Gun: ");
		String dtarih = input.next();
		Veritabaný.YolcuBilgisiEkle(ad, soyad, tc, cep, mail, cinsiyet, dtarih);
		
		
		yolcu.setAd(ad);
		yolcu.setSoyad(soyad);
		yolcu.setTc(tc);
		yolcu.setCepNo(cep);
		yolcu.setMail(mail);
		yolcu.setCinsiyet(cinsiyet);
		yolcu.setDogumTarihi(dtarih);
		
	}
	
	
}
