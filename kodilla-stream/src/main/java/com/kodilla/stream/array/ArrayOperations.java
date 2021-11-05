package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] numbers){
        IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .forEach(System.out:: println); // chciałem tutaj użyć kolektora joining, ale wyskakiwał jakiś długi i niezrozumiały błąd

        OptionalDouble averageOfArray = IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .average();

        double result = averageOfArray.orElse(0);
        System.out.println("The average of an array is: " + result);

        return result;
    }
}
