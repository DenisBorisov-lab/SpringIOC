package com.service;

import com.csv.DataEnricher;
import com.domain.Person;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Appearance {
    private Person person;
    private Map<String, Integer> map;
    private List<String> questions;

    public Appearance(DataEnricher dataEnricher) {
        questions = dataEnricher.getQuestions();
        map = new HashMap<>();
        person = ask();
    }

    private Person ask() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите ваше имя: ");
        String name = sc.nextLine();
        System.out.print("Введите вашу фамилию: ");
        String surname = sc.nextLine();
        for (String question : questions) {
            System.out.println("Вопрос: " + question);
            System.out.print("Ответ: ");
            int answer = sc.nextInt();
            map.put(question, answer);
        }
        person = new Person(name, surname, map);
        return person;
    }

    public Person getPerson() {
        return person;
    }
}
