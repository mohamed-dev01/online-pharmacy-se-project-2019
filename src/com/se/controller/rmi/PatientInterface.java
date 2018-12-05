package com.se.controller.rmi;

import java.util.ArrayList;


/**
 * @author Mohamed Hany
 * @version 1.0
 * @created 05-Dec-2018 10:14:58 PM
 */
public interface PatientInterface {

	public void addToCart();

	/**
	 * 
	 * @param name
	 * @param id
	 */
	public void byMedicine(String name, int id);

	public ArrayList displayMyOrders();

	/**
	 * 
	 * @param name
	 * @param id
	 */
	public boolean returnMedicine(String name, int id);

	public ArrayList viewAllMedicine();

}