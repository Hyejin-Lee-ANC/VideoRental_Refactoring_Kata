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

public class NewReleasePrice extends Price {
    public double amount(int daysRented) {
        return (double) (daysRented * 3);
    }

    public int renterPoints(int daysRented) {
        return daysRented > 1 ? 2 : 1;
    }
}
