package com.smvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.smvc.dao.CartDao;
import com.smvc.pojo.Order1;
import com.smvc.pojo.SubData;

@Controller
public class Cart_Controller {
	@Autowired
	CartDao c_dao;
@RequestMapping("/commerce2/cart2")
public ModelAndView result(@ModelAttribute Order1 cart1) {
	System.out.println("dhcbj");
	return new ModelAndView("cart","list3",c_dao.saveProducts());
}

	/* @RequestMapping("/commerce2/cart1") */
public ModelAndView shopping(@PathVariable int prod_id,@ModelAttribute SubData sub1) {
	System.out.println("subdata accessed");
	return new ModelAndView("cart1","list4",c_dao.findProduct(prod_id));
}
@RequestMapping(value="/commerce2/cart1",method=RequestMethod.GET)
 public ModelAndView shopping1(@ModelAttribute Order1 cart1) {
	System.out.println("order saved");
	 ModelAndView mav=new ModelAndView("cart1","result",c_dao.insertq());
	 return mav;
 }
}
