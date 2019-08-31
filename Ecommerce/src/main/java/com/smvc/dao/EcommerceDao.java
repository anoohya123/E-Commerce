package com.smvc.dao;

import java.util.List;

import com.smvc.pojo.MainData;
import com.smvc.pojo.SubData;

public interface EcommerceDao {

	public List<MainData> listCategory();

	public List<SubData> listProducts(String product_type);

	public List<SubData> listDesign(String prod_list);

}
