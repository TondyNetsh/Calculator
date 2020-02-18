import java.util.*;

public class Calculator {

    public static int add(int... numbers){
        int sum = 0;
        for (int i = 0; i < numbers.length; i++){
            sum = sum + numbers[i];
        }
        return sum;
    }

    public static int multiply(int... numbers){
        int sum = 1;
        for (int i = 0; i < numbers.length; i++){
            sum *= numbers[i];
        }
        return sum;
    }

    public static void main(String[] args) {

        System.out.println("======== Multiply ==========");
        System.out.println(Calculator.multiply(1,2,3,4,5));
        System.out.println();
        System.out.println("======== Addition ==========");
        System.out.println(Calculator.add(5,4,3,2,1));
    }
}
