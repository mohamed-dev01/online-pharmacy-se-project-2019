package com.se.controller.businesslogic;


/**
 * @author Mohamed Hany
 * @version 1.0
 * @created 05-Dec-2018 10:14:59 PM
 */
public interface Subject {


	public void addMedicine();

	/**
	 * 
	 * @param observer
	 */
	public void addObserver(Observer observer);


	/**
	 * 
	 * @param observer
	 */
	public void removeObserver(Observer observer);

}