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

public class Movie {
	private String _title;
	private Price _price;

    public Movie(String title, Price price) {
        _title = title;
        _price = price;
    }

	public String getTitle() {
		return _title;
	}

	public double amount(int daysRented) {
        return _price.amount(daysRented);
	}

    public int renterPoints(int daysRented) {
        return _price.renterPoints(daysRented);
    }
}
