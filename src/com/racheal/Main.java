//package com.racheal;
//
//import java.awt.*;
//import java.lang.reflect.Array;
//import java.text.NumberFormat;
//import java.util.Arrays;
//import java.util.Date;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//
//
//        //primitive types
////        byte myAge = 30;
////        long viewsCount = 3_123_456_789L;
////        float price = 10.99F;
////
////        System.out.println(myAge);
////        System.out.println(viewsCount);
//
//        //reference types
////        Date now = new Date();
////        System.out.println(now);
////
////        //memory management
////        byte x = 1;
////        byte y = x;
////        x = 2;
////        System.out.println(y);
////        System.out.println(x );
////
////        Point point1 = new Point(1, 2);
////        Point point2 = point1;
////        point1.x = 2;
////        System.out.println(point1);
////        System.out.println(point2);
////
////        //Strings
////        String message = "Hello World";
////
////        System.out.println(message.replace("o", "a"));
////        System.out.println(message);
//
//        //Arrays
////        int[] numbers = new int[5];
////        numbers[0] = 1;
////        numbers[1] = 2;
//
//////
////        int[][] numbers = { {1, 2, 4}, {2, 4, 5}};
////        System.out.println(numbers[1][0]);
////
////
////        System.out.println(Arrays.deepToString(numbers));
//
//        //constants
////
////        final double PI = 3.419;
////
////        System.out.println(PI);
//
////        //casting
////        double result  = (double)10 / (double) 3;
////        System.out.println(result);
//
//        //postfix increment
////        int x = 1;
////        int y = x++;
////        System.out.println(x);
////        System.out.println(y);
////
////        int x = 1;
////        int y = ++x;
////        x += 2;
////        System.out.println(x);
////        System.out.println(y);
//
//        //implicit casting
////        short x = 1;
////        int y = x + 2;
////        System.out.println(y);
//
//        //explicit casting
////        double x = 1.1;
////        int y = (int) x + 2;
////        System.out.println(y);
//
//    //Maths
////        int result = (int)Math.round(Math.random() * 100);
////        System.out.println(result);
//
//        //Number Format
////        NumberFormat currency = NumberFormat.getCurrencyInstance();
////        String result = currency.format(12345678.678);
////        System.out.println(result);
//
////        NumberFormat percentage = NumberFormat.getPercentInstance();
////        String result = percentage.format(0.2);
////        System.out.println(result);
//
////        String result =  NumberFormat.getNumberInstance().format(234234445387667L);
////        System.out.println(result);
//
//
////    Mortgage project
//
//
//        Scanner scanner = new Scanner(System.in);
//
//        int principal = 0;
//        while (true) {
//            System.out.print("Principal (GHC1000 - GHC1,000,000): ");
//            principal = scanner.nextInt();
//
//            if (principal >= 10000 && principal <= 1_000_000)
//                break;
//            System.out.println("Enter a valid principal number between 1000 and 1,000,000");
//            }
//
//
//        System.out.print("Annual Interest Rate: ");
//        float annualInterest = scanner.nextFloat();
//
//        System.out.print("Period year: ");
//        byte years = scanner.nextByte();
//
//
//        extracted(principal, annualInterest, years);
//
//
////Comparison
//
////        int x = 1;
////        int y = 1;
////        System.out.println(x >= y);
//
////    int income = 120_000;
////    boolean hasHighIncome = (income > 170_000);
////        System.out.println(hasHighIncome);
//
////        String role = "user";
////        switch (role){
////            case "admin":
////                System.out.println("you are an admin");
////                break;
////            case "user":
////                System.out.println("you are a user");
////                break;
////            default:
////                System.out.println("you are a guest");
////        }
//
////        Scanner scanner = new Scanner(System.in);
////        System.out.print("Number:  ");
////        int number = scanner.nextInt();
////
////        if(number % 5 == 0 && number % 3 == 0)
////            System.out.println("FizzBuz");
////
////        else if(number % 3 == 0)
////            System.out.println("Buzz");
////
////        else if(number % 5 == 0)
////            System.out.println("Fizz");
////        else
////            System.out.println(number);
//
////for loop
//
////        for (int i = 5; i > 0; i--)
////            System.out.println("hi  "+  i);
////      Scanner scanner = new Scanner(System.in);
////       String input = "";
////        while(!input.equals("quit")){
////            System.out.print("Input: ");
////            input = scanner.next().toLowerCase();
////            if(input.equals("quit"))
////                break;
////            System.out.println(input);
////
////
////        }
//
//
////        String[] fruits = {"apple", "Mango", "Orange"};
////        for (String fruit : fruits)
////            System.out.println(fruit);
////
//
//
//
////    String message = greetUser("Racheal");
////        System.out.println(message);
//
//
//    }
//
//    private static void extracted(int principal, float annualInterest, byte years) {
//        double mortgage = calculateMortgage(principal, annualInterest, years);
//        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
//        System.out.println("Mortgage: " + mortgageFormatted);
//    }
//
////    public  static  String greetUser(String name){
////        return "Hello "+ name;
////    }
//
//    public  static  double calculateMortgage(
//            int principal,
//            float annualInterest,
//            byte years){
//        final byte MONTHS_IN_YEAR = 12;
//        final byte PERCENT = 100;
//        int numberOfPayments = years * MONTHS_IN_YEAR;
//        short monthlyInterest =(short) (annualInterest/MONTHS_IN_YEAR);
//
//        double mortgage = principal * (monthlyInterest*Math.pow(1+monthlyInterest, numberOfPayments))
//                /(Math.pow(1+monthlyInterest, numberOfPayments));
//
//        return mortgage;
//    }
//
//
//}
