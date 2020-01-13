import java.util.Scanner;

public class All {
    public static void main(String[] args) {
        int num1,num2,sum,sub,multiply,divide,remainder;
        Scanner sc = new Scanner(System.in);
        System.out.println("ADDITION:-");
        System.out.println("Enter first number");
        num1 = sc.nextInt();
        System.out.println("Enter second number");
        num2 = sc.nextInt();
        sum = num1 + num2;
        System.out.println(sum);

        System.out.println("SUBTRACTION:-");
        System.out.println("Enter first number");
        num1 = sc.nextInt();
        System.out.println("Enter second number");
        num2 = sc.nextInt();
        sub = num1 - num2;
        System.out.println(sub);

        System.out.println("MULTIPLY:-");
        System.out.println("Enter first number");
        num1 = sc.nextInt();
        System.out.println("Enter second number");
        num2 = sc.nextInt();
        multiply = num1 * num2;
        System.out.println(multiply);

        System.out.println("DIVIDE:-");
        System.out.println("Enter first number");
        num1 = sc.nextInt();
        System.out.println("Enter second number");
        num2 = sc.nextInt();
        divide = num1/num2;
        System.out.println(divide);

        System.out.println("REMAINDER:-");
        System.out.println("Enter first number");
        num1 = sc.nextInt();
        System.out.println("Enter second number");
        num2 = sc.nextInt();
        remainder = num1%num2;
        System.out.println(remainder);
    }
}
