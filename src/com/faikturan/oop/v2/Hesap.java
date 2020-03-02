package com.faikturan.oop.v2;

public class Hesap {
	private String numara;
	private double bakiye;
	private String musteriAdi;
	private String musteriEmail;
	private String musteriTelefon;
	
	
	public Hesap() {
		this("5678", 2.5, "Varsay�lan Ad", "Varsay�lan Email", "Varsay�lan Telefon");
		System.out.println("Bo� yap�c� metod cagirildi.");
	}

	public Hesap(String numara, double bakiye, String musteriAdi, String musteriEmail, String musteriTelefon) {
		this.numara = numara;
		this.bakiye = bakiye;
		this.musteriAdi = musteriAdi;
		this.musteriEmail = musteriEmail;
		this.musteriTelefon = musteriTelefon;
	}

	public void paraYatirma(double yatirilanPara) {
		this.bakiye += yatirilanPara;
		System.out.println("Yat�r�lan Para: " +yatirilanPara + " Kalan Bakiye: " 
		+bakiye);
	}
	
	public void paraCekme(double cekilenPara) {
		if (this.bakiye - cekilenPara < 0) {
			System.out.println("Sadece " +this.bakiye + " mevcut. Para �ekme ��lemi"
					+ "ger�ekle�tirilemedi.");
		} else {
			this.bakiye -= cekilenPara;
			System.out.println("�ekilen Para Miktar�: " + cekilenPara + 
					" Kalan Bakiye " + this.bakiye);
		}
	}
	
	public String getNumara() {
		return numara;
	}

	public void setNumara(String numara) {
		this.numara = numara;
	}

	public double getBakiye() {
		return bakiye;
	}

	public void setBakiye(double bakiye) {
		this.bakiye = bakiye;
	}

	public String getMusteriAdi() {
		return musteriAdi;
	}

	public void setMusteriAdi(String musteriAdi) {
		this.musteriAdi = musteriAdi;
	}

	public String getMusteriEmail() {
		return musteriEmail;
	}

	public void setMusteriEmail(String musteriEmail) {
		this.musteriEmail = musteriEmail;
	}

	public String getMusteriTelefon() {
		return musteriTelefon;
	}

	public void setMusteriTelefon(String musteriTelefon) {
		this.musteriTelefon = musteriTelefon;
	}
	
	
	
	

}
