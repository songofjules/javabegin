//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static int a = 4;
    public static int b = 7;
    public static int output = 0;

    public static void main(String[] args) {
        System.out.printf("Summing a + b\n");
        output = a+b;
        System.out.printf("output = " + output);

        if(a > b){
            System.out.printf("\nSubtracting a-b\n");
            output = a - b;
        }else if(a < b){
            System.out.printf("\nSumming a + b\n");
            output = a + b;
        }else{
            System.out.printf("\nMultiply a*b\n");
            output = a*b;
        }
        System.out.printf("Output is " + output);
    }
}