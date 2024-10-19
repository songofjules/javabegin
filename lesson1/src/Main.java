//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int output = 0;
        int selection = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Sum\n" +
                "2. Multiply\n" +
                "3. Difference\n" +
                "4. Arrays\n" +
                "Do your selection: ");
        selection = scanner.nextInt();
        if(selection == 1){
            System.out.printf("First number to sum: ");
            a = scanner.nextInt();
            System.out.printf("Second number to sum: ");
            b = scanner.nextInt();
            output = sum(a, b);
        }else if(selection == 2){
            System.out.printf("First number to multiply: ");
            a = scanner.nextInt();
            System.out.printf("Multiplier: ");
            b = scanner.nextInt();
            output= multiply(a, b);
        }else if(selection == 3){
            System.out.printf("First number to differentiate: ");
            a = scanner.nextInt();
            System.out.printf("2nd number to differentiate: ");
            b = scanner.nextInt();
            output= differentiate(a, b);
        }else if(selection == 4){
            int[] array = new int[4];
            System.out.println("Provide your age: ");
            array[0] = scanner.nextInt();
            System.out.println("Provide your brother's age: ");
            array[1] = scanner.nextInt();
            System.out.println("Provide your mother's age: ");
            array[2] = scanner.nextInt();
            System.out.println("Provide your father's age: ");
            array[3] = scanner.nextInt();
            System.out.println("Ages in your family are:");
            for(int i=0; i<4; i++){
                System.out.println(array[i]);
            }
        }
       if (selection == 1 || selection == 2 || selection == 3){
           System.out.printf("output = " + output);
       }
    }

    public static int sum(int number1, int number2){
        System.out.printf("Summing a + b\n");
        return number1 + number2;
    }
    public static int multiply(int number1, int number2){
        int output = 0;
        System.out.printf("Multiplying a and b\n");
        for(int i=0; i<number2; i++){
            output = output + number1;
        }
        return output;
    }
    public static int differentiate(int number1, int number2){
        System.out.printf("Differentiating a and b\n");
        return number1 - number2;
    }

}