package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {
    private final List<Continent> listOfContinents = new ArrayList<>();

    public void addContinent (Continent continent){
        listOfContinents.add(continent);
    }

    public BigDecimal getPeopleQuantity(){
        BigDecimal peopleQuantity = listOfContinents.stream()
                .flatMap(continent -> continent.getListOfCountries().stream())
                .map(country -> country.getPeopleQuantity())
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
        return peopleQuantity;
    }
}
