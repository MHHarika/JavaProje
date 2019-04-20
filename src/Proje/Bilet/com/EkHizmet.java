package Proje.Bilet.com;

public class EkHizmet extends UcusSeferBilgileri {
	int bagajUcret;
	int yemekUcret;
	int koltukUcret;
	
	
	public float BagajHakki() {
		return bagajUcret ;
	};
	
	public float Yemek() {
		return yemekUcret;
	}
	
	public float KoltukSecUcreti() {
		return koltukUcret;
	}
	
	
	//en sonda seçimlere göre meydana gelecek ekucretlerin bilgisini tostring ile alabiliriz.
}
