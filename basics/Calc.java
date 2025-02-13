import java.util.Scanner;

class Calc {
    public static void main(String a[]){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number1 = input.nextInt();

        System.out.print("Enter your secound number: ");
        int number2 = input.nextInt();

        System.out.print("Give the operation: ");
        String operator = input.next();

        float result;

        switch(operator){
            case "+" -> result = number1 + number2;
            case "-" -> result = number1 - number2;
            case "*" -> result = number1 * number2;
            case "/" -> result = (float) number1 / number2; // type casting... if you do operation with int and int it will be int ex -> int/int = int
            default -> result = 0;
        }

        System.out.print("result: " + number1 + " " + operator + " " + number2 + " = " + result);
        input.close();

    }
}