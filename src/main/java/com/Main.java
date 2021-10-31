package com;

import com.csv.DataEnricher;
import com.service.Appearance;
import com.service.TestSystem;
import com.service.TestSystemImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/spring-context.xml");
        DataEnricher dataEnricher = context.getBean(DataEnricher.class);
        Appearance appearance = context.getBean(Appearance.class);
        TestSystem testSystem = new TestSystemImpl(appearance.getPerson(), dataEnricher.getQuestionsAnswersMap());
        testSystem.test();
    }
}
