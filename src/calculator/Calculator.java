package calculator;
public class Calculator {
    public void addition(int a, int b) {
        System.out.println("Addition of two number :" + (a + b));
    }

    public void subtraction(int a, int b) {
        if (a >= b)
            System.out.println("Subtraction of two number is :" + (a - b));
        else System.out.println("Subtraction of two number is :" + (b - a));
    }

    public void multiplication(int a, int b) {
        System.out.println("Multiplication of two number is :" + (a * b));
    }

    public void division(int a, int b) {
        System.out.println("Division of two number is :" + (a / b));
    }

    public void calculateResult(int a, int b, char c) {
        switch (c) {
            case '+':
                addition(a, b);
                break;
            case '-':
                subtraction(a, b);
                break;
            case '*':
                multiplication(a, b);
                break;
            case '/':
                division(a, b);
                break;
        }


    }
}
