package com.kavinmaha;

//import com.kavinmaha.model.Product;

import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        // 12.05.2021 Primitive DataTypes
        byte theByte = 126;
        short theShort = 32_378;
        int number = 100;
        long theLong = 387_878_787L;
        String name = "Mani";
        float theFloat = 3.14F;
        double value = 110.05;
        Date date = new Date();
        boolean isAdult = true;
        char theChar = 'A';
        System.out.println(theByte);
        System.out.println(theShort);
        System.out.println(number);
        System.out.println(theLong);
        System.out.println(name);
        System.out.println(theFloat);
        System.out.println(value);
        System.out.println(isAdult);
        System.out.println(theChar);

        // Non primitive type aka reference type
        String blog = new String("KavinMaha");
        System.out.println(blog);
        System.out.println(blog.toLowerCase(Locale.ROOT));
        System.out.println(blog.toUpperCase(Locale.ROOT));
        LocalDate now = LocalDate.now();
        System.out.println(now);
        System.out.println(now.getMonth());
        System.out.println(now.getDayOfWeek());
        System.out.println(now.getYear());

        // 17.05.2021 Strings, Arithmetic, Comparison Operators
        String vorName = "Mani";
        String nachName = "Murugan";
        //System.out.println(vorName + " " + nachName);
        System.out.println("Mani" + " " + "Murugan" + " " + vorName.toUpperCase(Locale.ROOT) + " " + nachName.toLowerCase(Locale.ROOT));
        System.out.println((1 + 2) * 3);
        System.out.println(Math.max(1, 2));
        System.out.println(Math.min(1, 2));
        System.out.println(Math.abs(2.3));
        System.out.println(Math.sqrt(2));
        System.out.println(true);
        System.out.println(1 > 2);
        System.out.println(1 < 2);
        int firstNumber = 20;
        int secondNumber = 20;
        System.out.println(firstNumber >= secondNumber);
        System.out.println(firstNumber != secondNumber);
        System.out.println(firstNumber == secondNumber);

        // 19.05.2021 Logical Operators
        boolean isYoung = false;
        String nameCheck = "Mani";
        System.out.println("Logical Operators");
        System.out.println((10 > 8 || 2 == 2) && !isYoung && nameCheck.contains("M"));

        // 19.05.2021 IF Statement
        int age = 15;
        if (age >= 18) {
            System.out.println("I am an Adult");
        } else if (age >= 16 && age < 18) {
            System.out.println("I am almost an Adult");
        } else {
            System.out.println("I am not an Adult");
        }

        // 19.05.2021 Ternary Operator
        int adultAge = 18;
        String message = adultAge >= 18 ? "I am an Adult" : "I am not an Adult";
        System.out.println(message);

        // 19.05.2021 Switch Statements
        String gender = "male";
        switch (gender.toUpperCase(Locale.ROOT)) {
            case "FEMALE" -> System.out.println("I am a Female");
            case "MALE" -> System.out.println("I am a male");
            default -> System.out.println("Unknown");
        }

        // 14.05.2021 Non-primitive types
        Person alex = new Person("Alex");
        Person mariam = alex;

        //alex.name = "Alexander";
        //mariam.name = "Alexa";

        System.out.println(alex.name + mariam.name);

    }

    static class Person {
        String name;

        Person(String name) {
            this.name = name;
        }
    }


    // Below line will print it
        /*
            It is a multiline comment
            It is only for Testing
        */ {
        System.out.println("Muruga");
        System.out.println("Amma");
        printMessage("Hallo World");
        printMessage("I am fine");

        //    Product product = new Product("Keyboard");

        //    System.out.println(product.getName());
    }

    private static void printMessage(String message) {
        System.out.println(message);
    }
}
