import java.util.Scanner;

class Calc {
    public static void main(String a[]){
        Scanner input = new Scanner(System.in);
        Maths math = new Maths();

        System.out.print("Enter a number: ");
        int number1 = input.nextInt();

        System.out.print("Enter your secound number: ");
        int number2 = input.nextInt();

        System.out.print("Give the operation: ");
        String operator = input.next();

        float result = 0;

        switch(operator){
            case "+" -> result = math.add(number1, number2);
            case "-" -> result = math.substract(number1, number2);
            case "*" -> result = math.multiply(number1, number2);
            case "/" -> result = math.divide(number1,number2); 
            default -> System.out.println("Invalid operator");
        }

        System.out.print("result: " + number1 + " " + operator + " " + number2 + " = " + result);
        input.close();


    }
}

class Maths {
    public int add(int number1, int number2){
        return number1 + number2;
    }
    public int substract(int number1, int number2){
        return number1 - number2;
    }
    public float multiply(int number1, int number2){
        return (float) number1 * number2;
    }
    public float divide(int number1, int number2){
        return (float) number1 / number2; // type casting... if you do operation with int and int it will be int ex -> int/int = int
    }
    public boolean isEven(int number){
        return number % 2 == 0;
    }
}