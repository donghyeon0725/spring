package study.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class TestBean {
    @Value("${test}")
    private String test;

    private String defaultTestValue = getTest();

    public TestBean() {
        System.out.println("Constructor test = " + test);
        System.out.println("Constructor defaultTestValue = " + defaultTestValue);
    }

    @PostConstruct
    public void init() {
        System.out.println("PostConstruct test = " + test);
        System.out.println("PostConstruct defaultTestValue = " + defaultTestValue);
    }

    public String getTest() {
        return test;
    }
}
