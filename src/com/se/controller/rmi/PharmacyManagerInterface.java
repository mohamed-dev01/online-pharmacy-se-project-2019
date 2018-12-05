package com.se.controller.rmi;

import java.util.ArrayList;


/**
 * @author Mohamed Hany
 * @version 1.0
 * @created 05-Dec-2018 10:14:59 PM
 */
public interface PharmacyManagerInterface {

	public void displayProfitReport();

	/**
	 * 
	 * @param id
	 */
	public boolean removeMedicine(int id);

	public ArrayList viewAllOrders();

}