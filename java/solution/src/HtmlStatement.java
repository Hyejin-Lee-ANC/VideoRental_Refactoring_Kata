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

public class HtmlStatement extends Statement {
    @Override
    protected String header(String name) {
        return "<h2>" + name + "</h2>\n";
    }

    @Override
    protected String lineItem(Movie movie, double amount) {
        return "<b>" + movie.getTitle() + "</b>: " + amount + "\n";
    }

    @Override
    protected String footer(double totalAmount, int frequentRenterPoints) {
        return "<br/>You owe " + totalAmount + "\n";
    }
}
