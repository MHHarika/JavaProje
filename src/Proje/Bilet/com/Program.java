package Proje.Bilet.com;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		UcusSeferBilgileri ucus1 = new UcusSeferBilgileri();
		ucus1.UcusSeferBilgisiAl(ucus1);
				
		YolcuBilgileri yolcu1 = new YolcuBilgileri();
		yolcu1.YolcuBilgiAl(yolcu1);
		
		
		EkHizmet hizmet1 = new EkHizmet();
		hizmet1.EkHizmetAl(hizmet1);
		
		Odeme odeme1 = new Odeme();
		odeme1.OdemeAl(ucus1, yolcu1, hizmet1);
		
		Rezervasyon rezervasyon1= new Rezervasyon();
		rezervasyon1.RezervasyonGoster(odeme1,ucus1,yolcu1);
		
		
		
	}

	
	
	
	
	

}
