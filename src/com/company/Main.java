package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.print("Enter Format as ex: 212 F to C ");
        Scanner reader = new Scanner(System.in);
        Double temperature = reader.nextDouble();
        String initUnit = reader.next();
        reader.next();
        String endUnit = reader.next();
        TemperatureConverter convertTemp = new TemperatureConverter(initUnit, endUnit);
        System.out.print(convertTemp.convert(temperature, endUnit, initUnit) + " ");
        System.out.println(endUnit);



//        if (input_format == 1) {
//            System.out.println("\nCelsius -> Fahrenheit\n");
//            celsius_to_fahrenheit();
//        } else if (input_format == 2) {
//            System.out.println("\nFahrenheit -> Celsius\n");
//            fahrenheit_to_celsius();
//        } else if (input_format == 3) {
//            System.out.println("\nKelvin -> Fahrenheit\n");
//            kelvin_to_fahrenheit();
//        } else if (input_format == 4) {
//            System.out.println("\nFahrenheit -> Kelvin\n");
//            fahrenheit_to_kelvin();
//        } else if (input_format == 5) {
//            System.out.println("\nKelvin -> Celsius\n");
//            kelvin_to_celsius();
//        } else if (input_format == 6) {
//            System.out.println("\nCelsius -> Kelvin\n");
//            celsius_to_kelvin();
//        } else {
//            System.out.println("\nNO INPUT PROVIDED BY THE USER!\n");
//        }

    }

}

