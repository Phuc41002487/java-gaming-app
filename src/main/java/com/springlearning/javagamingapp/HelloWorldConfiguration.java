package com.springlearning.javagamingapp;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, Address address) {}
record Address(String city, String country) {}
@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name() {
        return "Phuc";
    }

    @Bean
    public int age() {
        return 31;
    }

    @Bean
    public Person person() {
        var person = new Person("Vo", 31, address());
        return person;
    }

    @Bean
    public Person person2(String name, int age, @Qualifier("origin") Address address) {
        var person = new Person(name, age, address);
        return person;
    }

    @Bean
    @Primary
    public Address address() {
        var address = new Address("Weimar", "Germany");
        return address;
    }

    @Bean
    @Qualifier("origin")
    public Address address2() {
        var address = new Address("Kon Tum", "Vietnam");
        return address;
    }
}
