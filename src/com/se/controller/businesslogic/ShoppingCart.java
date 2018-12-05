package com.se.controller.businesslogic;


/**
 * @author Mohamed Hany
 * @version 1.0
 * @created 05-Dec-2018 10:14:59 PM
 */
public class ShoppingCart {

	private PayStrategy strategy;
	public PayStrategy m_PayStrategy;
	public Medicine m_Medicine;

	public ShoppingCart(){

	}

	public boolean changePaymentMethod(){
		return false;
	}

	public void payBill(){

	}
}//end ShoppingCart