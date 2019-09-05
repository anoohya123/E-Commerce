package com.smvc.dao;

import java.util.List;

import com.smvc.pojo.Order1;
import com.smvc.pojo.SubData;

public interface CartDao {
public List<Order1> saveProducts();

public List<SubData> findProduct(int prod_id);
public String insertq();
}
