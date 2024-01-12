package org.example.practice.IOStreams;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ArrayInputStream {
    public static void main(String[] args) throws IOException {
        String text = "hello world!\nAnya umnichka.\nSanya Molodets.";
        byte[] bytes = text.getBytes();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bytes)))) {
            List<String> lines = new ArrayList<>();
            String line = reader.readLine();
            while (line != null) {
                lines.add(line);
                line = reader.readLine();
            }

            lines.forEach(System.out::println);
        }
    }
}
