// ***************************************************************************
// Copyright (c) 2020, Industrial Logic, Inc., All Rights Reserved.
//
// This code is the exclusive property of Industrial Logic, Inc. It may ONLY be
// used by students during Industrial Logic's workshops or by individuals
// who are being coached by Industrial Logic on a project.
//
// This code may NOT be copied or used for any other purpose without the prior
// written consent of Industrial Logic, Inc.
// ****************************************************************************

import java.util.ArrayList;
import java.util.List;

public class Customer {
	private String _name;
    private List<Rental> myRentals = new ArrayList<Rental>();

	public Customer(String name) {
		this._name = name;
	}

	public void addRental(Rental rental) {
		myRentals.add(rental);
	}

	public String getName() {
		return _name;
	}

	public String statement(Statement statement) {
        return statement.statement(getName(), this.myRentals, totalAmount(this.myRentals), frequentRenterPoints(this.myRentals));
    }

    private double totalAmount(Iterable<Rental> rentals) {
        double totalAmount = 0;
        for (Rental each : rentals) {
            double thisAmount = each.amount();
            totalAmount += thisAmount;
        }
        return totalAmount;
    }

    private int frequentRenterPoints(Iterable<Rental> rentals) {
        int totalRenterPoints = 0;
        for (Rental each : rentals) {
            totalRenterPoints += each.renterPoints(each.getDaysRented());
        }
        return totalRenterPoints;
    }

}
