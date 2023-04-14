package org.yearup;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int calculatorChoice:
        Scanner sc = new Scanner(System.in);
        System.out.println("Which calculator would you like to use?");
        System.out.printf("%s , %s, %s", "1) Mortgage Calculator", "2) Future value Calculator", "3) Present Value calculator");
        calculatorChoice = sc.nextInt();




    }
}