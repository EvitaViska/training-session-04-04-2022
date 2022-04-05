package com.company;

import jdk.swing.interop.SwingInterOpUtils;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in); //this allows to not write this code in every new method if we write this below public class main
    //Creating an instance of a class gives us access to the methods in that class

    public static void main(String[] args) {
      Main main = new Main();
    //  main.task1();  //if you want to run different tasks than you should put // these in front of the task
    //  main.task3();
    //  main.task4();
    //  main.task5();
    //main.task6();
    main.task7();
    //  main.switchStatements();

    }

    //with static methods you don`t need to create an instant of it before calling the method
        void task1(){

        System.out.println("Task 1 - 2");
        System.out.println("Please input a number: ");
        int num1 = scanner.nextInt();
            //read value from user

            if (num1 % 2 == 0){
            System.out.println(num1 + " is an even number.");
            } else if (num1 % 2 == 1){
            System.out.println(num1 + " is an odd number.");
        }
    }

    void task3(){

        System.out.println("Task 3");
        System.out.println("Please input a number: ");
        int number1 = scanner.nextInt();

        if (number1 > 0){
            System.out.println(number1 + " is grater than 0.");
        }else if(number1 < 0 ){
            System.out.println(number1 + " is less than 0.");
        }else {
            System.out.println(number1 + " is equal to 0.");
        }
    }

    void task4(){

        System.out.println("Task 4");

        System.out.println("Welcome to the rollercoster! Please input height (cm): ");
        int height = scanner.nextInt();

        System.out.println("Please input weight (kg): ");
        float weight = scanner.nextFloat();

        if (height > 150 && weight < 180){
                System.out.println("Fasten your seatbelt!");
            } else {
                System.out.println("I`m sorry you can`t go!");
            }
    }

    void task5(){

        System.out.println("Task 5");
        System.out.println("Please input the temperature (in celsius): ");
        float tempInCelsius = scanner.nextFloat();

        float tempInFahrenheit = 1.8f * tempInCelsius +32f; //'f' letter is needed!

        System.out.println("Degrees Fahrenheit: " + (1.8f * tempInCelsius + 32));

        System.out.println(tempInCelsius + " is " + tempInFahrenheit);
    }

    void task6(){

        System.out.println("Task 6");
        System.out.println("Please input your income: ");
        double income = scanner.nextDouble();

        if (income < 85528){
            System.out.println("The amount of personal income tax: " + (income * 0.18 - 556.02));
        } else if (income >= 85528){
            System.out.println("The amount of personal income tax: " + (14839.02 + 0.32 * (income - 85528)));
        }
    }

    void task7(){
        System.out.println("Task 7");

        System.out.println("Please input the loan amount: ");
        double loanAmount = scanner.nextDouble();

        System.out.println("Please input the number of installments: ");
        int numberOfInstallments = scanner.nextInt();

        if (loanAmount > 10000 || loanAmount < 100){
            loanAmount = 5000;
        }

        if (numberOfInstallments > 48 || numberOfInstallments < 6){
            numberOfInstallments = 36;
        }

        double interest;

        if (numberOfInstallments >= 6 && numberOfInstallments <= 12){
            interest = 0.025;
        } else if (numberOfInstallments <= 24){
            interest = 0.05;
        } else {
            interest = 0.10;
        }

        System.out.println("The amount of monthly installment: " + ((loanAmount * (1+interest)) / numberOfInstallments));

    }

    void switchStatements(){
    /**
    Switch statement syntax:
        switch ( expression / variable ) {
        case 1:
            statement 1;
            break;
        case 2:
            statement 2;
            break;
        case 3:
            statement 3;
            break;
        default:
            default statement;
            break; //wasn`t this optional after default?
        }

     */

    // A simple calculator
        //Print Welcome message
        System.out.println("Welcome to the calculator!");

        //Read the two operands from the user
        Scanner scanner = new Scanner(System.in); //optional because i already have this in my class

        System.out.println("Input the first operand");
        double val1 = scanner.nextDouble();

        System.out.println("Input the second operand");
        double val2 = scanner.nextDouble();

        //Print a menu that prompts the user to input an operation for the two operands
        System.out.println("""
            Operations are:
            'ADD' or '+' for addition
            'SUBTRACT' or '-' for subtraction
            'MULTIPLY' or '*' for multiplication
            'DIVIDE' or '/' for division
            
            Select one of the operations!
        """);

        //Read operation input from user
        String operation = scanner.next();

        /**to make your string UPPERCASE
        operation.toUpperCase*/

        //Declare variable to store final result


        //Check and perform the operation then print the result
        switch (operation) {
            case "ADD", "+":
                System.out.println("The sum is " + (val1 + val2));
                break;
            case "SUBTRACT", "-":
                System.out.println("The difference is " + (val1 - val2));
                break;
            case "MULTIPLY", "*":
                System.out.println("The product is " + (val1 * val2));
                break;
            case "DIVIDE", "/":
                System.out.println("The division is " + (val1 / val2));
                break;
            default:
                System.out.println(operation + " is not valid");
                break;
        }

        //Print error message if operation not valid - default

    }

}
