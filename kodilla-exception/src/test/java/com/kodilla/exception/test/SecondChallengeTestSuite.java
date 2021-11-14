package com.kodilla.exception.test;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Executable;

import static org.junit.jupiter.api.Assertions.*;

public class SecondChallengeTestSuite {

    @Test
    void noExepctionExample() {
        // given
        SecondChallenge secondChallenge = new SecondChallenge();

        // when & then
        assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1, 2));
    }

    @Test
    void xBiggerThanTwoException() {
        // given
        SecondChallenge secondChallenge = new SecondChallenge();

        // when & then
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2.5, 2));
    }

    @Test
    void xSmallerThanOneException() {
        // given
        SecondChallenge secondChallenge = new SecondChallenge();

        // when & then
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0.5, 2));
    }

    @Test
    void yEqualsOneAndHalfException() {
        // given
        SecondChallenge secondChallenge = new SecondChallenge();

        // when & then
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(1, 1.5));
    }
}
