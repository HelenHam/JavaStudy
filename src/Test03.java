import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> products = new HashMap<>();
        products.put("Coke", 2300);
        products.put("Soda", 2200);
        products.put("Fanta", 2000);
        products.put("Orange", 1500);
        products.put("Water", 1000);

        System.out.println("안녕하세요.");

        while (true) {
            System.out.println("음료를 선택하거나 'EXIT'를 입력해 종료해 주세요:");
            String pName=scanner.nextLine();

            if (pName.equals("EXIT")) {
                System.out.println("안녕히 가세요.");
                break;
            }
            else {
                if (products.containsKey(pName)) {
                    int 가격 = products.get(pName);
                    System.out.println("결제수단: ");
                    String 결제수단 = scanner.nextLine();

                    if (결제수단.equals("Cash")) {
                        System.out.print("금액을 투입하세요: ");
                        int 투입금액 = scanner.nextInt();
                       
                        if (투입금액 >= 가격) {
                            int 잔액 = 투입금액 - 가격;
                            System.out.println("결제가 완료되었습니다.");
                            System.out.println("잔액: " + 잔액 + "원");
                            scanner.nextLine();
                        } else {
                            System.out.println("잔액이 부족합니다.");
                        }
                    } else if (결제수단.equals("Card")) {
                        int 잔여금액 = scanner.nextInt();
                       
                        if (잔여금액 >= 가격) {
                            System.out.println("결제가 완료되었습니다.");
                        } else {
                            System.out.println("잔액이 부족합니다.");}
                    } else {
                        System.out.println("올바른 결제수단이 아닙니다.");
                    }
                } else {
                    System.out.println("없는 상품입니다.");
                }
            }
        }

        scanner.close();
    }
}
