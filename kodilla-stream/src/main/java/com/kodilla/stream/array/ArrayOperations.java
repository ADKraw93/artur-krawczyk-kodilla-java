package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] numbers){
        String numbersString = IntStream.range(0, numbers.length)
                .mapToObj(n -> "" + numbers[n])
                .collect(Collectors.joining(", ")); // chciałem tutaj użyć kolektora joining, ale wyskakiwał jakiś długi i niezrozumiały błąd

        System.out.println(numbersString);

        OptionalDouble averageOfArray = IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .average();

        double result = averageOfArray.orElse(0);
        System.out.println("The average of an array is: " + result);

        return result;
    }
}
