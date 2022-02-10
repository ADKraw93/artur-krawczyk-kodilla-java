package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.Board;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryTestSuite {

    @Test
    void testGetBooks() {
        //Given
        Book book1 = new Book("Big Adventures", "Indiana Johnes", LocalDate.of(1984, 1, 1));
        Book book2 = new Book("Handbook of Geography", "Mr. Teacher", LocalDate.of(2020, 1, 1));
        Book book3 = new Book("Cookbook", "Siostra Anastazja", LocalDate.of(2016, 1, 1));

        Library library = new Library("My small library");
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        Library shallowCloneLibrary = null;
        try {
            shallowCloneLibrary = library.shallowCopy();
            shallowCloneLibrary.setName("Shallow clone of library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepCloneLibrary = null;
        try {
            deepCloneLibrary = library.deepCopy();
            deepCloneLibrary.setName("Deep clone of library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().remove(book1);

        //Then
        assertEquals(library.getBooks().size(), 2);
        assertEquals(shallowCloneLibrary.getBooks().size(), 2);
        assertEquals(deepCloneLibrary.getBooks().size(), 3);
    }
}
