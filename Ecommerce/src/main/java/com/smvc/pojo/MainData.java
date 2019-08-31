package com.smvc.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class MainData {
	@Id
	@Column
private int id;
private String product_type;



public MainData() {
	
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getProduct_type() {
	return product_type;
}
public void setProduct_type(String product_type) {
	this.product_type = product_type;
}

@Override
public String toString() {
	return "MainData [id=" + id + ", product_type=" + product_type + "]";
}


}
