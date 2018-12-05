package com.se.controller.rmi;


/**
 * @author Mohamed Hany
 * @version 1.0
 * @created 05-Dec-2018 10:14:58 PM
 */
public interface AccountInterface {

	/**
	 * 
	 * @param email
	 * @param password
	 */
	public boolean login(String email, String password);

	/**
	 * 
	 * @param email
	 */
	public boolean verfiyAccount(String email);

}