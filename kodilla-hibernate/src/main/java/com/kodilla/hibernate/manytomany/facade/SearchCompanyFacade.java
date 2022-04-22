package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SearchCompanyFacade {

    private static final Logger LOGGER = LoggerFactory.getLogger(SearchCompanyFacade.class);
    private final CompanyDao companyDao;

    @Autowired
    public SearchCompanyFacade(CompanyDao companyDao) {
        this.companyDao = companyDao;
    }

    public List<Company> retrieveCompanyByFirstLetters (final String letters) {
        LOGGER.info("Starting searching a company with a name containing /'" + letters + "/'");
        List<Company> listOfCompanies = companyDao.retrieveCompanyByTextFragment(letters);

        if(listOfCompanies.size() == 0) {
            LOGGER.warn(SearchException.WARN_COMPANY_NOT_FOUND);
            return new ArrayList<>();
        } else {
            LOGGER.info("There were found " + listOfCompanies.size() + " companies matching the criterion.");
            return listOfCompanies;
        }
    }
}
