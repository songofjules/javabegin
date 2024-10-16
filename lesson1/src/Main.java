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
        System.out.printf("select 1 if you want to sum and 2 if you want to multiply: ");
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
        }
        System.out.printf("output = " + output);
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
}