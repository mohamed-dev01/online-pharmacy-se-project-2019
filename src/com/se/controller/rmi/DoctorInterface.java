package com.se.controller.rmi;

import java.util.ArrayList;


/**
 * @author Mohamed Hany
 * @version 1.0
 * @created 05-Dec-2018 10:14:58 PM
 */
public interface DoctorInterface {

	public void addToCart();

	/**
	 * 
	 * @param name
	 * @param id
	 */
	public void buyMedicine(String name, int id);

	public ArrayList displayMyOrders();

	public ArrayList viewAllMedicines();

}