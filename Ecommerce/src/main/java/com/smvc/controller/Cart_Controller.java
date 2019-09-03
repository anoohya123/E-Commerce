package com.smvc.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class Cart_Controller {
@RequestMapping(value="/cart")
public String result() {
	return "cart";
}
}
