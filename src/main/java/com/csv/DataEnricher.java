package com.csv;

import java.util.*;

public class DataEnricher {
    private Map<String, Integer> questionsAnswersMap = new HashMap<>();
    private List<String> questions = new ArrayList<>();
    private final CsvReader reader;

    public DataEnricher(CsvReader reader) {
        this.reader = reader;
        enrichData();
    }

    public Map<String, Integer> getQuestionsAnswersMap() {
        return questionsAnswersMap;
    }

    public List<String> getQuestions() {
        return questions;
    }

    public void enrichData() {//enrich
        List<String> read = reader.read();//when(reader.read(), arrayOf("1+2=3", "", ""));
        for (String task : read){
            String[] split = task.split(",");
            questions.add(split[0]);

            questionsAnswersMap.put(split[0], Integer.parseInt(split[1]));
        }
    }
}
