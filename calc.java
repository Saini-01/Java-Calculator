import java.util.*;
public class calc {
    public static void main(String[] args){
        int num1 = 0;
        int num2 = 0;
        char operator;
        double answer = 0.0;

        Scanner scanObject = new Scanner(System.in);

        System.out.println("Enter the first number");
        num1 = scanObject.nextInt();
        System.out.println("Enter the second number");
        num2 = scanObject.nextInt();
        System.out.println("Operation? ");
        operator = scanObject.next().charAt(0);

        switch (operator) {
            case '+': answer = num1+num2;
            break;
            case '-': answer = num1-num2;
            break;
            case '*': answer = num1*num2;
            break;
            case '/': answer = num1/num2;
        }

        System.out.println(num1+""+operator+""+num2+"="+answer);
    }
}
