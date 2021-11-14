package com.kodilla.exception.io;

import java.io.File;
import java.io.IOException;
import java.net.URLDecoder;
import java.nio.file.Files;
import java.nio.file.Path;

import java.util.stream.Stream;

public class FileReader {

    public void readFile()  throws FileReaderException {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("names.txt").getFile());

        try(Stream<String> fileLines = Files.lines(Path.of(URLDecoder.decode(file.getPath(), "UTF-8")));) {
            fileLines.forEach(System.out::println);
        } catch (IOException e) {
            throw new FileReaderException();
        } finally {
            System.out.println("I am gonna be here... always!");
        }
    }

    public void readFile(String fileName)  throws FileReaderException {
        ClassLoader classLoader = getClass().getClassLoader();

        try(Stream<String> fileLines = Files.lines(Path.of(classLoader.getResource(fileName).toURI() ))) {
            // Stream<String> fileLines = Files.lines(Path.of(URLDecoder.decode(new File(classLoader.getResource(fileName).getFile()).getPath(), "UTF-8")));
            fileLines.forEach(System.out::println);
        } catch (Exception e) {
            throw new FileReaderException();
        } finally {
            System.out.println("I am gonna be here... always!");
        }
    }
}
