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

//        Scanner nums=new Scanner(System.in);
//        System.out.println("please add numbers seperated by \',\'");
//        String num=nums.nextLine();
//         num=num.replaceAll("[^\\d]","");
//
//        //boolean num2=num.matches("[\\d+]");
//
//        char[] ArraChar = num.toCharArray();
//        int[] IntValues = new int[ArraChar.length];
//
//        for (int i = 0; i <ArraChar.length ; i++) {
//              IntValues[i] = Character.getNumericValue(ArraChar[i]);
//             //   System.out.println();
//        }
//
//        System.out.println("=========Multiply===========");
//        System.out.println(multiply(IntValues));
//        System.out.println("=========Addition===========");
//        System.out.println(add(IntValues));
        System.out.println("======== Multiply ==========");
        System.out.println(Calculator.multiply(1,2,3,4,5));
        System.out.println();
        System.out.println("======== Addition ==========");
        System.out.println(Calculator.add(5,4,3,2,1));
    }
}