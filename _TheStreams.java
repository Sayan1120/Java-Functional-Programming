package com.streams.sys.functional.program;

import com.functional.programming.sys.code.Main;

import java.util.List;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

import static com.streams.sys.functional.program._TheStreams.Gender.*;

public class _TheStreams {
    public static void main(String[] args){
        List<Person> people = List.of(
                new Person("Sayan", MALE),
                new Person("Maya", FEMALE),
                new Person("Kiara", FEMALE),
                new Person("Drexel", MALE),
                new Person("Ginny", PREFER_NOT_SAY)
        );

//        people.stream()
//                .map(person -> person.name)
//                .mapToInt(String::length)
//        //      .mapToInt(name -> name.length()) works the same as the code above this line
//        //      .collect(Collectors.toSet()) we do not require collect method because we are asking for the length of the String
//                .forEach(System.out::println);
//        //      .forEach(gender -> System.out.println(gender)); same as the above forEach loop
        
        Function<Person, String> personStringFunc = person -> person.name;
        ToIntFunction<String> Len = String::length;
        IntConsumer println = System.out::println;

        people.stream()
                .map(personStringFunc)
                .mapToInt(Len)
                .forEach(println);

        Predicate<Person> personPredicate = person -> PREFER_NOT_SAY.equals(person.gender);
        boolean containsOnlyFemales = people.stream()
                .noneMatch(personPredicate);
        System.out.println(containsOnlyFemales);

    }

    static class Person{
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender){
            this.name = name;
            this.gender = gender;
        }
        @Override
        public String toString(){
            return "name= '" + name + '\'' +
                    ", gender= " + gender;
        }
    }
    enum Gender{
        MALE, FEMALE, PREFER_NOT_SAY;
    }
}
