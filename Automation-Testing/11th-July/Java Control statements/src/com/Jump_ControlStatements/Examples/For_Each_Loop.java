package com.Jump_ControlStatements.Examples;

public class For_Each_Loop {

    public static void main(String[] args) {

        String[] cities = {"Delhi", "Noida", "Meerut", "Agra", "Lucknow"};

        System.out.println("For Each Loop");

        for (String city : cities) {
            System.out.println(city);
        }
    }
}