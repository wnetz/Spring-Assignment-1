package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig
{
    @Bean
    public Student getStudent()
    {
        return new Student(0,"AAAA",List.of(getPhone()),getAddress());
    }
    @Bean
    public Address getAddress()
    {
        return new Address("peoria","AZ","USA","00000");
    }
    @Bean
    public Phone getPhone()
    {
        return new Phone("000-000-0000");
    }

}
