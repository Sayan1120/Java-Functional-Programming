package com.functional.programming.sys.code;

import java.util.List;
import java.util.stream.Collectors;

import static com.functional.programming.sys.code.Main.Gender.FEMALE;
import static com.functional.programming.sys.code.Main.Gender.MALE;

public class Main {
    public static void main(String[] args){

        List<Person> people = List.of(
                new Person("Sayan", MALE),
                new Person("Maya", FEMALE),
                new Person("Kiara", FEMALE),
                new Person("Drexel", MALE),
                new Person("Ginny", FEMALE)
        );

        // Declarative Approach
        List<Person> males = people.stream().filter(person -> MALE.equals(person.gender))
                .collect(Collectors.toList());
        males.forEach(System.out::println);
    }
    static class Person{
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender){
            this.name = name;
            this.gender = gender;
        }
        @Override
        public String toString(){
            return "name: '" + name + '\'' +
                    ", gender: " + gender;
        }
    }


    enum Gender{
        MALE, FEMALE
    }
}
