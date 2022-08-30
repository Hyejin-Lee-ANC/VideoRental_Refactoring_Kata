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

import static org.junit.Assert.*;

import org.junit.Test;

public class CustomerTest {
    Customer customer = new Customer("Bob");

    @Test
    public void test() {
        customer.addRental(new Rental(new Movie("Jaws", new RegularPrice()), 2));
        customer.addRental(new Rental(new Movie("GoldenEye", new RegularPrice()), 3));
        customer.addRental(new Rental(new Movie("ShortNew", new NewReleasePrice()), 1));
        customer.addRental(new Rental(new Movie("LongNew", new NewReleasePrice()), 2));
        customer.addRental(new Rental(new Movie("Bambi", new ChildrensPrice()), 3));
        customer.addRental(new Rental(new Movie("Toy Story", new ChildrensPrice()), 4));

        assertEquals(
            "Rental Record for Bob\n" +
                "\tJaws\t2.0\n" +
                "\tGoldenEye\t3.5\n" +
                "\tShortNew\t3.0\n" +
                "\tLongNew\t6.0\n" +
                "\tBambi\t1.5\n" +
                "\tToy Story\t3.0\n" +
                "You owed 19.0\n" +
                "You earned 7 frequent renter points",
            customer.statement(new TextStatement()));
    }

    @Test
    public void htmlStatement() {
        customer.addRental(new Rental(new Movie("Jaws 2", new RegularPrice()), 1));

        assertEquals(
            "<h2>Bob</h2>\n" +
                "<b>Jaws 2</b>: 2.0\n" +
                "<br/>You owe 2.0\n",
            customer.statement(new HtmlStatement()));
    }
}
