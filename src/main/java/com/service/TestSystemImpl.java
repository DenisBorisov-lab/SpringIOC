package com.service;

import com.domain.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class TestSystemImpl implements TestSystem {
    private Map<String, Integer> map;
    private int amountOfCorrectAnswers;
    private Person person;
    private Map<String, Integer> correctAnswers;

    public TestSystemImpl(Person person, Map<String, Integer> correctAnswers) {
        this.person = person;
        this.correctAnswers = correctAnswers;
    }

    @Override
    public void test() {
        map = person.getAnswer();
        List<String> questions = new ArrayList<>(map.keySet());
        for (String question : questions) {
            if (Objects.equals(map.get(question), correctAnswers.get(question))) {
                amountOfCorrectAnswers++;
            }
        }

        System.out.println(person.getName() + " " + person.getSurname() + ", Вы ответили на " + amountOfCorrectAnswers + " из " + map.size());
    }
}
