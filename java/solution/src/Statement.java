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

import java.util.List;

public abstract class Statement {
    protected abstract String header(String name);

    protected abstract String lineItem(Movie movie, double amount);

    protected abstract String footer(double totalAmount, int frequentRenterPoints);

    public String statement(String name, List<Rental> rentals, double totalAmount, int totalRenterPoints) {
        String result = header(name);

        for (Rental each : rentals) {
            result += lineItem(each.getMovie(), each.amount());
        }

        result += footer(totalAmount, totalRenterPoints);

        return result;
    }
}
