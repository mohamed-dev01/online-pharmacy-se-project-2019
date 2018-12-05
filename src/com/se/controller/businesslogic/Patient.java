package com.se.controller.businesslogic;

import java.util.ArrayList;


/**
 * @author Mohamed Hany
 * @version 1.0
 * @created 05-Dec-2018 10:14:58 PM
 */
public class Patient extends Person {

	private ShoppingCart shCart;
	public ShoppingCart m_ShoppingCart;

	public Patient(){

	}

	public void addToCart(){

	}

	/**
	 * 
	 * @param name
	 * @param id
	 */
	public void buyMedicine(String name, int id){

	}

	public ArrayList dispalyMyOrders(){
		return null;
	}

	/**
	 * 
	 * @param name
	 * @param id
	 */
	public boolean returnMedicine(String name, int id){
		return false;
	}

	public ArrayList viewAllMedicine(){
		return null;
	}
}//end Patient