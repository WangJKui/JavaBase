package com.wjk.java.rec.mov;

import java.util.Enumeration;
import java.util.Vector;

/**
 * 顾客
 * @author h
 *
 */
public class Customer {

	private String _name;
	private Vector _rentals = new Vector();
	public Customer(String _name) {
		super();
		this._name = _name;
	}
	
	public void addRental(Rental rental) {
		_rentals.addElement(rental);
	}
	

	public String getName() {
		return _name;
	}
	
	
	public String statement() {
		double totalAmount = 0;
		int frequentRenterPoints = 0;
		
		Enumeration rentals = _rentals.elements();
		String result = "Rental Record for " + getName() + "\n";
		
		while (rentals.hasMoreElements()) {
			
			Rental each = (Rental) rentals.nextElement();

			//重构
			double thisAmount = each.getCharge();
			//重构
			frequentRenterPoints += each.getFrequentRenterPoints();
			
			result += "\t" +each.getMovie().getTitle() + "\t" +
					String.valueOf(thisAmount) + "\n";
			totalAmount += thisAmount;
			
		}
		
		result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
		result += "You earned " +String.valueOf(frequentRenterPoints) +
				"frequent renter points ";
		
		return result;
		
	}


}
