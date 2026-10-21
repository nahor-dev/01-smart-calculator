
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter the first number: ");
        int firstNum = input.nextInt();


        input.nextLine();


        System.out.println("enter operator (+, -, *, / ): ");
        String operator = input.nextLine();

        System.out.println("enter the second number: ");
        int secondNum = input.nextInt();


        int result = 0;
        switch (operator) {
            case "+":
                 result = firstNum + secondNum;
                break;

            case "-":
                result = firstNum - secondNum;
                break;

            case "*":
                result = firstNum * secondNum;
                break;


            case "/":
                if (secondNum == 0){
                    System.out.println("division by zero is impossible");
                }else {

                result = firstNum / secondNum;


                }
                break;

            default:
                System.out.println("unknown operator");
        }


        System.out.println(result);











    }
}