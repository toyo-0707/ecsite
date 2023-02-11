package com.example.ecsite.model.form;

import java.io.Serializable;
import java.util.List;

public class CartForm implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private long Userid;
	private List<Cart> cartList;
	
	public long getUserId() {
		return Userid;
	}
	public void setUserId(long Userid) {
		this.Userid = Userid;
	}
	public List<Cart> getCartList() {
		return cartList;
	}
	public void setCartList(List<Cart> cartList) {
		this.cartList = cartList;
	}

}

