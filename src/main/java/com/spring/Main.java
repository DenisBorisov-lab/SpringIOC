package com.spring;

import com.csv.Data;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/spring-context.xml");
        Data data = new Data();
        System.out.println(data.getMap());
        System.out.println(data.getQuestions());

    }
}
