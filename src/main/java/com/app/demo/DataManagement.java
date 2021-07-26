package com.app.demo;

public class DataManagement {
	
	private int did;
	private String productDetails;
	private double productMails;
	public DataManagement(int did, String productDetails, double productMails) {
		super();
		this.did = did;
		this.productDetails = productDetails;
		this.productMails = productMails;
	}
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getProductDetails() {
		return productDetails;
	}
	public void setProductDetails(String productDetails) {
		this.productDetails = productDetails;
	}
	public double getProductMails() {
		return productMails;
	}
	public void setProductMails(double productMails) {
		this.productMails = productMails;
	}
	@Override
	public String toString() {
		return "DataManagement [did=" + did + ", productDetails=" + productDetails + ", productMails=" + productMails
				+ "]";
	}
	

}
