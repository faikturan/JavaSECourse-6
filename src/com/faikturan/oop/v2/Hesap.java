package com.faikturan.oop.v2;

public class Hesap {
	private String numara;
	private double bakiye;
	private String musteriAdi;
	private String musteriEmail;
	private String musteriTelefon;
	
	
	public Hesap() {
		this("5678", 2.5, "Varsayýlan Ad", "Varsayýlan Email", "Varsayýlan Telefon");
		System.out.println("Boþ yapýcý metod cagirildi.");
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
		System.out.println("Yatýrýlan Para: " +yatirilanPara + " Kalan Bakiye: " 
		+bakiye);
	}
	
	public void paraCekme(double cekilenPara) {
		if (this.bakiye - cekilenPara < 0) {
			System.out.println("Sadece " +this.bakiye + " mevcut. Para Çekme Ýþlemi"
					+ "gerçekleþtirilemedi.");
		} else {
			this.bakiye -= cekilenPara;
			System.out.println("Çekilen Para Miktarý: " + cekilenPara + 
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
