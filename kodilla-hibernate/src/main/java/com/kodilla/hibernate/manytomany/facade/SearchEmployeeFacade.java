package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SearchEmployeeFacade {

    private static final Logger LOGGER = LoggerFactory.getLogger(SearchEmployeeFacade.class);
    private final EmployeeDao employeeDao;

    @Autowired
    public SearchEmployeeFacade(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    public List<Employee> retrieveEmployeesByTextFragment (final String letters) {
        LOGGER.info("Starting searching a company with a name containing /'" + letters + "/'");
        List<Employee> listOfEmployees = employeeDao.retrieveEmployeesByTextFragment(letters);

        if(listOfEmployees.size() == 0) {
            LOGGER.warn(SearchException.WARN_EMPLOYEE_NOT_FOUND);
            return new ArrayList<>();
        } else {
            LOGGER.info("There were found " + listOfEmployees.size() + " companies matching the criterion.");
            return listOfEmployees;
        }
    }
}
