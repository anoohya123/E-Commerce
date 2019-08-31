package com.smvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.smvc.dao.EcommerceDao;
import com.smvc.pojo.MainData;
import com.smvc.pojo.SubData;

@Controller
public class Ecommerce_Controller {
@Autowired
	EcommerceDao e_dao;

@RequestMapping("/commerce")
public ModelAndView data1(@ModelAttribute MainData ecomm) {
	ModelAndView mav=new ModelAndView("listItems","list",e_dao.listCategory());
	return mav;
}

@RequestMapping("/commerce1/{product_type}")
public ModelAndView data2(@PathVariable String product_type ,@ModelAttribute SubData ecomm1) {
		/*
		 * ModelAndView mav=new ModelAndView("listMain","list1",e_dao.listProducts());
		 */
	ModelAndView mav=new ModelAndView("listMain","list1",e_dao.listProducts(product_type));
	return mav;
}

@RequestMapping("/commerce2/{prod_list}")
public ModelAndView data3(@PathVariable String prod_list,@ModelAttribute SubData ecomm2) {
	ModelAndView mav=new ModelAndView("listSub","list2",e_dao.listDesign(prod_list));
	return mav;
}

@RequestMapping("/display")
public ModelAndView data() {
	return new ModelAndView("home");
}
	
}
