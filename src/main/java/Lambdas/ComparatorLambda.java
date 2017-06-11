package src.main.java.Lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Jordan on 6/11/2017.
 */
public class ComparatorLambda {

    class Person {
        private String givenName;
        private String surName;
        private int age;
        private String gender;
        private String eMail;
        private String phone;
        private String address;

        void printName(){
            System.out.println(this.givenName);
        }

        String getSurName() {
            return this.surName;
        }

    }

    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();

        // Sort with Inner class
        Collections.sort(personList, new Comparator<Person>(){
            public int compare(Person p1, Person p2) {
                return p1.getSurName().compareTo(p2.getSurName());
            }
        });

        System.out.println("=== Sorted Asc SurName ===");
        for(Person p:personList) {
            p.printName();
        }

        // use Lambda instead

        // Print Asc
        System.out.println("=== Sorted Asc SurName ===");
        Collections.sort(personList, (Person p1, Person p2) ->
            p1.getSurName().compareTo(p2.getSurName()));

        for (Person p:personList) {
            p.printName();
        }
    }
}
