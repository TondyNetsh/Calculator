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
        try {
            Scanner sc = new Scanner(System.in);
            int size, val;

            System.out.println("How many numbers are you working with");
            size = sc.nextInt();
            int[] numArray = new int[size];

            System.out.println("Enter " + size + " numbers to add and multiply");
            for (int i = 0; i < numArray.length;i++){
                numArray[i] = sc.nextInt();
            }

            System.out.println("======== Multiply ==========");
            System.out.print("Product : " + Calculator.multiply(numArray));
            System.out.println();
            System.out.println("======== Addition ==========");
            System.out.print("Sum : " + Calculator.add(numArray));
        }
        catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }
    }
}

