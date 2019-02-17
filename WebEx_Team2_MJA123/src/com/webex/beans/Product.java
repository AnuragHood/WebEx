package com.webex.beans;

import java.awt.Image;

public class Product {
	String product_id;
	String product_name;
	long product_price;
	public String getProduct_id() {
		return product_id;
	}
	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public long getProduct_price() {
		return product_price;
	}
	public void setProduct_price(long product_price) {
		this.product_price = product_price;
	}
	
	
	@Override
	public String toString() {
		return "product [product_id=" + product_id + ", product_name="
				+ product_name + ", product_price=" + product_price
				+ ", product_picture="  + "]";
	}
	public Product(String product_id, String product_name, long product_price,
			Image product_picture) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.product_price = product_price;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	

}
