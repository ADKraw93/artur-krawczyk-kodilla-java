package com.kodilla.exception.io;

import java.io.File;
import java.io.IOException;
import java.net.URLDecoder;
import java.nio.file.Files;
import java.nio.file.Path;

import java.util.stream.Stream;

public class FileReaderWithoutHandling {

    public void readFile()  throws IOException {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("names.txt").getFile());
        Stream<String> fileLines = Files.lines(Path.of(URLDecoder.decode(file.getPath(), "UTF-8")));
        fileLines.forEach(System.out::println);
    }
}
