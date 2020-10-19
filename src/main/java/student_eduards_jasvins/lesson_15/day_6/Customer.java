package student_eduards_jasvins.lesson_15.day_6;

import java.util.Vector;

class Customer {

	public Customer (String name) {
		this.name = name;
	}

	public void addRental (Rental rental) {
		rentals.addElement (rental);
	}

	public String getName () {
		return name;
	}

	private String name;

	private Vector rentals = new Vector ();

	Vector getRentals () { return  rentals; }
}