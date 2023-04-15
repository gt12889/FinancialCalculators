package org.yearup;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int calculatorChoice;
        Scanner sc = new Scanner(System.in);
        System.out.println("Which calculator would you like to use?");
        System.out.printf("%s , %s, %s\n", "1) Mortgage Calculator", "2) Future value Calculator", "3) Present Value calculator");
        calculatorChoice = sc.nextInt();

        do {
            if (calculatorChoice == 1) {
                CalculateMortgage();
            } else if(calculatorChoice == 2){
                CalculateFutureValue();
            }
         else if(calculatorChoice == 3){
            CalculateFutureValue();
        }
            else {
                System.out.print("Invalid entry, try again.\n");
                System.out.printf("%s , %s, %s\n", "1) Mortgage Calculator", "2) Future Value Calculator", "3) Present Value calculator");
                calculatorChoice = sc.nextInt();
            }
        }while (calculatorChoice < 1 || calculatorChoice > 4) ;







    }

    public static void CalculateMortgage()

    {
        Scanner sc = new Scanner(System.in);
        double principal;
        double interestRate;
        int length;
        double result;
        double mir;
        double step2;
        double step3;
        double apr;
        double totalInterest;

        System.out.println("What is the principal?");
        principal = sc.nextInt();
        System.out.println("What is the interest rate?");
        interestRate = sc.nextFloat();
        System.out.println("What is the loan length?");
        length = sc.nextInt();

        mir = (interestRate/100)/12;
        step2 = Math.pow(1+mir,-12*length);
        step3 = 1-step2;
        result = (mir/step3) * principal;
        totalInterest = result*12*length-principal;
        System.out.printf("Your monthly payment is $%.2f, and total interest is $%.2f",result,totalInterest);
    }
    public static void CalculateFutureValue()
    {
        double deposit;
        double rate;
        double years;
        double result;
        double convert;

        Scanner sc = new Scanner(System.in);
        System.out.println("What is the deposit?");
        deposit = sc.nextInt();
        System.out.println("What is the interest rate?");
        rate = sc.nextFloat();
        System.out.println("What is the number of years?");
        years = sc.nextInt();
        convert = rate/100;
        result = deposit * Math.pow((1 + rate/100 ),years);
        System.out.printf("\"Your future value is is $%.2f", result);

    }
    public static void CalculatePresentValue()

    {
        Scanner sc = new Scanner(System.in);
        double payout;
        double rate;
        double years;


        System.out.println("What is the monthly payout?");
        payout = sc.nextInt();
        System.out.println("What is the expected interest rate?");
        rate = sc.nextFloat();
        System.out.println("What is the loan length?");
        years = sc.nextFloat();

        System.out.print("Your monthly payment is $");
    }
}