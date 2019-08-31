package com.smvc.pojo;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.sun.org.apache.xml.internal.security.utils.Base64;

@Entity
@Table
public class SubData {
	@Id
	@Column
 public int id;
	@Column
 public String prod_list;
	@Column
 public double prize;
	@Column
 public int quantity;
	@Lob
	@Column
 public byte[] image;
	@Column
 public String description;
	private String base64;
 
	@Transient
	public String getBase64() {
		return this.base64=Base64.encode(this.image);
	}

	public void setBase64(String base64) {
		this.base64 = base64;
	}



public SubData() {
}



public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getProd_list() {
	return prod_list;
}
public void setProd_list(String prod_list) {
	this.prod_list = prod_list;
}
public double getPrize() {
	return prize;
}
public void setPrize(double prize) {
	this.prize = prize;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public byte[] getImage() {
	return image;
}
public String product_type;
public String getProduct_type() {
	return product_type;
}



public void setProduct_type(String product_type) {
	this.product_type = product_type;
}



public void setImage(byte[] image) {
	this.image = image;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}

@Override
public String toString() {
	return "SubData [id=" + id + ", prod_list=" + prod_list + ", prize=" + prize + ", quantity=" + quantity + ", image="
			+ Arrays.toString(image) + ", description=" + description + "]";
}

 
}
