package com.kodilla.hibernate.manytomany.facade;

public class SearchException extends Exception {

    public static String WARN_EMPLOYEE_NOT_FOUND = "No employee was found.";
    public static String WARN_COMPANY_NOT_FOUND = "No company was found.";

    public SearchException (String message) {
        super(message);
    }
}
