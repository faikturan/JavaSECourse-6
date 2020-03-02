package com.faikturan.oop.v2;

public class OzelMusteri {
	private String musteriAd;
	private double krediLimit;
	private String emailAdres;
	
	
	public OzelMusteri() {
		this("Varsayýlan Müsteri", 50000.0, "default@gmail.com");
	}
	public OzelMusteri(String musteriAd, double krediLimit) {
		this(musteriAd, krediLimit, "bilinmiyor@email.com");
	}
	public OzelMusteri(String musteriAd, double krediLimit, String emailAdres) {
		this.musteriAd = musteriAd;
		this.krediLimit = krediLimit;
		this.emailAdres = emailAdres;
	}
	public String getMusteriAd() {
		return musteriAd;
	}
	public double getKrediLimit() {
		return krediLimit;
	}
	public String getEmailAdres() {
		return emailAdres;
	}
	
	
	
	
	
	

}
