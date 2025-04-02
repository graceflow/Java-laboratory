import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double num1, num2 = 0;
        char sign;

        try (Scanner sc = new Scanner(System.in)) {
            while(true) {
                System.out.print("첫번째 수 입력: ");
                num1 = sc.nextDouble();
                System.out.print("두번째 수 입력: ");
                num2 = sc.nextDouble();
                System.out.print("연산부호 입력: ");
                sign = sc.next().charAt(0);

                switch (sign) {
                    case '+':
                        System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
                        break;

                    case '-':
                        System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
                        break;

                    case '*':
                        System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
                        break;

                    case '/':
                        if(num2 != 0) {
                            System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
                            break;
                        }else {
                            System.out.println("0으로는 나눌 수 없습니다.");
                            break;
                        }
                    
                    default:
                        System.out.println("연산 부호는 +, -, *, / 만 입력이 가능합니다!");
                        break;
                }
            }
        }
    }
}
