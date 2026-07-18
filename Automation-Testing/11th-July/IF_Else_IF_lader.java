package com.DecisionMakingStatements.Examples;

public class IF_Else_IF_lader {

    public static void main(String[] args) {

        String city = "Meerut12";

        if (city.equals("Delhi")) {
            System.out.println("Welcome to Delhi");
        }
        else if (city.equals("Noida")) {
            System.out.println("Welcome to Noida");
        }
        else if (city.equals("Meerut12")) {
            System.out.println("Welcome to Meerut");
        }
        else {
            System.out.println("City not found");
        }

    }
}