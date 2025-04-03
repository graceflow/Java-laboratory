import java.util.Scanner;

public class Quiz05 {
    public static void main(String[] args) {
        // Scanner 선언
        Scanner sc = new Scanner(System.in);

        // 변수 선언
        int money = 0;
        int menu = 0;
        int money1 = 0;

        while(true) {
            // 기본form
            System.out.println("-------------------------------------");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔금 | 4. 종료");
            System.out.println("-------------------------------------");

            // 메뉴 입력
            System.out.print("메뉴를 입력하세요: ");
            menu = sc.nextInt();

            switch(menu) {
                // 1. 예금
                case 1:
                    System.out.print("예금액: ");
                    money1 = sc.nextInt();
                    money = money + money1;
                    System.out.println();
                    break;

                // 2. 출금
                case 2:
                    System.out.print("출금액: ");
                    money1 = sc.nextInt();
                    if(money < money1) {
                        System.out.println("잔액이 부족합니다.");
                        System.out.println();
                        break;
                    }else {
                        money = money - money1;
                        System.out.println();
                        break;
                    }

                // 3. 잔금
                case 3:
                    System.out.println("잔고: " + money);
                    System.out.println();
                    break;

                // 4. 종료
                case 4:
                    System.out.println("프로그램을 종료합니다.");
                    sc.close();
                    System.exit(0);

                // 메뉴가 없을 때 ( 잘못 입력 )
                default:
                    System.out.println("잘못 입력하셨습니다.");
                    System.out.println();
                    break;
            }
        }
    }
}
