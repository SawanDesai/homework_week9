package calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a;
        System.out.println("Enter the first number :");
        a = scan.nextInt();
        int b;
        System.out.println("Enter Second number :");
        b = scan.nextInt();
        char c;
        System.out.println("Enter which operation you want to do:");
        c = scan.next().charAt(0);
        Calculator obj = new Calculator();
        // Main obj = new Main();
        obj.calculateResult(a, b, c);
        System.out.println("Would you like to do more calculation please enter 'Y 'or 'N':");
        char d = scan.next().charAt(0);
        while (d == 'y' || d == 'Y') {
            System.out.println("Enter the first number :");
            a = scan.nextInt();
            System.out.println("Enter Second number :");
            b = scan.nextInt();
            System.out.println("Enter which operation you want to do:");
            c = scan.next().charAt(0);
            Calculator obj1 = new Calculator();
            obj1.calculateResult(a, b, c);
            break;
        }
        scan.close();


    }




}
