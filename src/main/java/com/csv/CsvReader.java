package com.csv;

import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CsvReader {
    @SneakyThrows
    public List<List<String>> read() {
        List<List<String>> records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("./src/main/resources/data.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split("\\.");
                records.add(Arrays.asList(values));
            }
        }
        return records;
    }

}