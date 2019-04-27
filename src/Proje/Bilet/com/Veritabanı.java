package Proje.Bilet.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Veritabaný {
	public static void main(String[] args) {
		
		
		UcusFiyatGöster(568);
	}
	
public static void BiletYolcuBilgisiGöster(String tc){
		
		try {
			Connection myConn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/javaproje?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey", 
					"root", 
					"921,pink");
			Statement myStmt = myConn.createStatement();
			ResultSet myRs = myStmt.executeQuery("select * from tbl_yolcubilgileri where tc =" + "'" + tc + "'  ");
			while (myRs.next()) {
				System.out.println("**************Bilet Ýçin Girilen Yolcu Kaydýnýz******************");
				System.out.println("Ad: "+myRs.getString("ad")+" -- "+"Soyad: "+myRs.getString("soyad")+" -- "+"Tc: "+ myRs.getString("tc")+" -- "+"Cinsiyet:"+ myRs.getString("cinsiyet"));
				System.out.println("****************************************************************");
				System.out.println("                                                                ");
			}
			
			
			
		}
		
		catch (Exception exc) {
			exc.printStackTrace();}
		
	}
	

	
	
	public static float UcusFiyatGöster(int kod){
		float fiyat = 0;
		try {
			
			Connection myConn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/javaproje?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey", 
					"root", 
					"921,pink");
			Statement myStmt = myConn.createStatement();
			ResultSet myRs = myStmt.executeQuery("select fiyat from tbl_ucusseferbilgileri where ucusseferbilgileri_id =" + "'" + kod + "'  ");
			while (myRs.next()) {
				 fiyat =  myRs.getFloat("fiyat");
			}
			
		}
		
		catch (Exception exc) {
			exc.printStackTrace();}
		return fiyat;
		
	}

	
	
	
	
	
	
	public static void secilenUcusGöster(int kod){
		
		try {
			Connection myConn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/javaproje?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey", 
					"root", 
					"921,pink");
			Statement myStmt = myConn.createStatement();
			ResultSet myRs = myStmt.executeQuery("select * from tbl_ucusseferbilgileri where ucusseferbilgileri_id =" + "'" + kod + "'  ");
			while (myRs.next()) {
				System.out.println("**************Seçtiðiniz bilet ve bilgileri******************");
				System.out.println("UcusKodu: "+myRs.getInt("ucusseferbilgileri_id")+" -- "+myRs.getString("nereden")+" -- "+myRs.getString("nereye")+" -- "+"Tarih: "+ myRs.getString("ucusTarihi")+" -- "+"Ucus Saati: "+myRs.getTime("ucusSaati")+" -- "+"Sure: "+myRs.getTime("sure")+" -- "+"Fiyat:"+myRs.getDouble("fiyat")+"TL");
				System.out.println("*************************************************************");
				System.out.println("                                                             ");
			}
			
			
			
			
			
		}
		
		catch (Exception exc) {
			exc.printStackTrace();}
		
	}
	

	
	public static void seferListele(String n1,String n2,String d1) {
		
		
		try {
			Connection myConn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/javaproje?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey", 
					"root", 
					"921,pink");
			Statement myStmt = myConn.createStatement();
			ResultSet myRs = myStmt.executeQuery("select * from tbl_ucusseferbilgileri where nereden =" + "'" + n1 + "' and nereye= " + "'" + n2 + "' and ucusTarihi = " + "'" + d1 + "' ");
			while (myRs.next()) {
				System.out.println("UcusKodu: "+myRs.getInt("ucusseferbilgileri_id")+" -- "+myRs.getString("nereden")+" -- "+myRs.getString("nereye")+" -- "+"Tarih: "+ myRs.getString("ucusTarihi")+" -- "+"Ucus Saati: "+myRs.getTime("ucusSaati")+" -- "+"Sure: "+myRs.getTime("sure")+" -- "+"Fiyat:"+myRs.getDouble("fiyat")+"TL");
			}
			
			
			
		}
		
		catch (Exception exc) {
			exc.printStackTrace();}
		}
		
	
	public static void YolcuBilgisiEkle(String ad1,String soyad1,String tc1,String cep,String mail,String cinsiyet,String dtarih) {
			
			Connection con = null;
			try {
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/javaproje?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey", 
						"root", 
						"921,pink");
				String sorgu = "insert into tbl_yolcubilgileri (ad,soyad,tc,cepno,mail,cinsiyet,d_tarihi) values (?, ?, ?, ?, ?, ?, ?)";
				PreparedStatement prepareStatement = con.prepareStatement(sorgu);
				prepareStatement.setString(1, ad1);
				prepareStatement.setString(2, soyad1);
				prepareStatement.setString(3, tc1);
				prepareStatement.setString(4, cep);
				prepareStatement.setString(5, mail);
				prepareStatement.setString(6,cinsiyet);
				prepareStatement.setString(7, dtarih);
				
				prepareStatement.execute();
				
			} catch (Exception exc) {
				exc.printStackTrace();
			} finally {
				try {
					con.close();
				} catch (SQLException e) {
					System.out.println("Hata oluþtu. Baðlantý bile kapatýlamadý.");
				}
			}
			System.out.println("Bilet için yolcu kaydýnýz oluþturuldu.");
		}

		
	
	
	
	
		}


