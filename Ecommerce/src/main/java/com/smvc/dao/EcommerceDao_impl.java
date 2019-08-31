package com.smvc.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.smvc.pojo.MainData;
import com.smvc.pojo.SubData;

@Repository
public class EcommerceDao_impl implements EcommerceDao {

	@Autowired
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<MainData> listCategory() {
		Session session = this.sessionFactory.getCurrentSession();
		/*
		 * List<Main> list = session.createQuery("from Main where id=1").list();
		 */
		List<MainData> list = session.createQuery("from MainData").list(); 
		System.out.println(list);
		return list;

	}

	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<SubData> listProducts(String product_type) {
		Session session = this.sessionFactory.getCurrentSession();
		Query query =session.createQuery("from SubData where product_type='"+product_type+"'");
		
		 List<SubData> list1=query.list();
	
		return list1;
	}
	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<SubData> listDesign(String prod_list) {
		Session session =this.sessionFactory.getCurrentSession();
		Query query=session.createQuery("from SubData where prod_list='"+prod_list+"'"); 
		List<SubData> list2=query.list();
				 return list2;
	}

}
