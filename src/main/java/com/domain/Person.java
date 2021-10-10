package com.domain;

import java.util.Map;

public class Person {
    private String name;
    private Map<String, Integer> answer;

    public Person(String name, Map<String, Integer> answer) {
        this.name = name;
        this.answer = answer;
    }

    public String getName() {
        return name;
    }

    public Map<String, Integer> getAnswer() {
        return answer;
    }
}
