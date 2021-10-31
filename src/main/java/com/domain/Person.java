package com.domain;

import java.util.Map;

public class Person {
    private String name;
    private String surname;
    private Map<String, Integer> answer;

    public Person(String name, String surname, Map<String, Integer> answer) {
        this.name = name;
        this.surname = surname;
        this.answer = answer;
    }

    public String getName() {
        return name;
    }

    public String getSurname(){
        return surname;
    }

    public Map<String, Integer> getAnswer() {
        return answer;
    }
}
