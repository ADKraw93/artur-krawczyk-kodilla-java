package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.BookSignature;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {
        //Given
        Set<Book> booksSet = new HashSet<>();
        MedianAdapter medianAdapter = new MedianAdapter();
        Book book1 = new Book("John Smith", "Strategy of War", 1980, "RHN/1980/2");
        Book book2 = new Book("A.R. Thommas", "The beauty", 1982, "ATR/1982/12");
        Book book3 = new Book("Mickey Riley", "Basics of Algebra", 1986, "TRF/1985/22");
        Book book4 = new Book("A.B.C", "Something", 1990, "RHN/1990/1");
        Book book5 = new Book("Lue Bee", "Bees Stories", 2012, "SXX/2012/69");
        booksSet.addAll(List.of(book1, book2, book3, book4, book5));
        //When
        int medianYear = medianAdapter.publicationYearMedian(booksSet);
        //Then
        assertEquals(medianYear, 1986);
    }
}
