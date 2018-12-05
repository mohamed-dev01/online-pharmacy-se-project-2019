package com.se.controller.rmi;

import java.util.ArrayList;


/**
 * @author Mohamed Hany
 * @version 1.0
 * @created 05-Dec-2018 10:14:58 PM
 */
public interface AdminInterface {

	public ArrayList addPINs();

	public boolean createDoctorAccount();

	public boolean removeDoctorAccount();

	public void removePIN();

	public void updateMedicine();

}