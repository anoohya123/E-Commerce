
package com.smvc.pojo;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;

@Entity

@Table
public class Order1 {

	@Id

	@Column
	public int prod_id;

	@Column
	public String prod_list;

	@Column
	public double prize;

	@Column
	public int quantity;

	@Column
	public byte[] image;

	@Column
	public String description;

	@Column
	public String product_type;

	private String base64;

	@Transient
	public String getBase64() {
		return this.base64 = Base64.encode(this.image);
	}

	public void setBase64(String base64) {
		this.base64 = base64;
	}

	public int getId() {
		return prod_id;
	}

	public void setId(int id) {
		this.prod_id = id;
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
		return "SubData [id=" + prod_id + ", prod_list=" + prod_list + ", prize=" + prize + ", quantity=" + quantity
				+ ", image=" + Arrays.toString(image) + ", description=" + description + "base64=" + base64 + "]";
	}

}
