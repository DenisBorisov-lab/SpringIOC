package com.csv;

import java.util.*;

public class Data {
    private Map<String, Integer> map = new HashMap<>();
    private Set<String> questions = new HashSet<>();

    public void generateData() {
        CsvReader reader = new CsvReader();
        List<List<String>> data = reader.read();
        for (List<String> list : data) {
            List<String> array = Arrays.asList(list.get(0).split(","));
            String question = array.get(0);
            int answer = Integer.parseInt(array.get(1));
            map.put(question, answer);
            questions.add(question);
        }
    }

    public Map<String, Integer> getMap() {
        generateData();
        return map;
    }

    public Set<String> getQuestions() {
        generateData();
        return questions;
    }
}
