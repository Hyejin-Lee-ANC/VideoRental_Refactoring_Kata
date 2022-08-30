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

public class TextStatement extends Statement {
    protected String header(String name) {
        return "Rental Record for " + name + "\n";
    }

    protected String lineItem(Movie movie, double amount) {
        return "\t" + movie.getTitle() + "\t" + String.valueOf(amount) + "\n";
    }

    protected String footer(double totalAmount, int frequentRenterPoints) {
        String footer1 = "You owed " + String.valueOf(totalAmount) + "\n";
        String footer2 = "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points";
        return footer1 + footer2;
    }
}
