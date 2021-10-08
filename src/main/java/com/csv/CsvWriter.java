package com.csv;

import lombok.SneakyThrows;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CsvWriter {

    private static List<String[]> dataLines = new ArrayList<>();
    private final String path = "./src/main/resources/data.csv";

    @SneakyThrows
    public static void main(String[] args) {
        dataLines.add(new String[]
                {"5 + 7 = ", "12"});
        dataLines.add(new String[]
                {"4 + 65 = ", "69"});
        dataLines.add(new String[]
                {"16 + 56 = ", "72"});
        dataLines.add(new String[]
                {"78 - 14 = ", "64"});
        dataLines.add(new String[]
                {"76 + 56 = ", "132"});

        new CsvWriter().givenDataArray_whenConvertToCSV_thenOutputCreated();
    }

    public String escapeSpecialCharacters(String data) {
        String escapedData = data.replaceAll("\\R", " ");
        if (data.contains(",") || data.contains("\"") || data.contains("'")) {
            data = data.replace("\"", "\"\"");
            escapedData = "\"" + data + "\"";
        }
        return escapedData;
    }

    public String convertToCSV(String[] data) {
        return Stream.of(data)
                .map(this::escapeSpecialCharacters)
                .collect(Collectors.joining(","));
    }

    public void givenDataArray_whenConvertToCSV_thenOutputCreated() throws IOException {
        File csvOutputFile = new File(path);
        try (PrintWriter pw = new PrintWriter(csvOutputFile)) {
            dataLines.stream()
                    .map(this::convertToCSV)
                    .forEach(pw::println);
        }
    }
}
