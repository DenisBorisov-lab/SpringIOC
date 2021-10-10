package com.service;

import com.csv.Data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Appearance {
    private Map<String, Integer> map;

    public void ask() {
        map = new HashMap<>();
        Data data = new Data();
        List<String> questions = data.getQuestions();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < questions.size(); i++) {
            System.out.print("Вопрос " + (i + 1) + ": " + questions.get(i));
            int answer = sc.nextInt();
            map.put(questions.get(i), answer);
        }
    }
}
