package com.smvc.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.smvc.pojo.Order1;
import com.smvc.pojo.SubData;

@Repository
public class CartDao_Impl implements CartDao{

	@Autowired
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	@Transactional
	public List<Order1> saveProducts() {
	Session session=this.sessionFactory.getCurrentSession();
	@SuppressWarnings("unchecked")
	List<Order1> list3=session.createQuery("from Order1").list();
		return list3;
	}
	@SuppressWarnings("unchecked")
	@Transactional
	public List<SubData> findProduct(int prod_id) {
	Session session=this.sessionFactory.getCurrentSession();
	List<SubData> list4=session.createQuery("from SubData where product_type").list();
		return list4;
	}
	
	@Transactional
public String insertq() {
	String hql = "INSERT INTO Order1(prod_id, prod_list, quantity, prize, description, product_type, image)"  + 
            "SELECT prod_id, prod_list, quantity, prize, description, product_type, image FROM SubData";
	Session session=this.sessionFactory.getCurrentSession();
Query query = session.createQuery(hql);
int result = query.executeUpdate();
System.out.println("Rows affected: " + result);
return "result";
}
	
}
