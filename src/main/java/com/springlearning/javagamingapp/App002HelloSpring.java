package com.springlearning.javagamingapp;

import com.springlearning.javagamingapp.game.GameRunner;
import com.springlearning.javagamingapp.game.SuperContraGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class App002HelloSpring {

    public static void main (String[] agrs) {
        // Launch a Spring context
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        // get bean
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("address2"));
        System.out.println(context.getBean(Address.class));
        System.out.println(context.getBean("person2"));
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
    }
}
