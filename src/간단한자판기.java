import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class 간단한자판기 {

    public static void main(String[] args) {
        // Scanner 객체 생성
        Scanner 입력 = new Scanner(System.in);

        // 상품과 가격을 저장할 Map
        Map<String, Integer> 상품목록 = new HashMap<>();
        상품목록.put("콜라", 2300);
        상품목록.put("사이다", 2200);
        상품목록.put("환타", 2000);
        상품목록.put("물", 1000);
        상품목록.put("커피", 2500);

        // 프로그램 시작 메시지
        System.out.println("안녕하세요! 자판기 프로그램입니다.");
        System.out.println("음료를 선택하거나 'EXIT'를 입력해 종료할 수 있습니다.");

        // 반복문 시작
        while (true) {
            System.out.println("음료를 선택해 주세요 (EXIT 입력 시 종료):");
            String 선택된음료 = 입력.nextLine().trim(); // 공백 제거

            // 종료 조건
            if (선택된음료.equalsIgnoreCase("EXIT")) {
                System.out.println("프로그램을 종료합니다. 이용해 주셔서 감사합니다.");
                break;
            }

            // 삼중 if문
            if (상품목록.containsKey(선택된음료)) { // 음료가 존재하는 경우
                int 가격 = 상품목록.get(선택된음료);
                System.out.println("선택하신 음료: " + 선택된음료);
                System.out.println("가격: " + 가격 + "원");

                System.out.println("결제 방법을 입력해 주세요 (현금/카드):");
                String 결제방법 = 입력.nextLine().trim();

                if (결제방법.equals("현금")) {
                    System.out.println("현금을 선택하셨습니다. 금액을 입력해 주세요:");
                    int 투입금액 = 입력.nextInt();
                    입력.nextLine(); // 남은 줄바꿈 문자 제거

                    if (투입금액 >= 가격) {
                        int 잔액 = 투입금액 - 가격;
                        System.out.println("결제가 완료되었습니다. 잔액: " + 잔액 + "원");
                    } else {
                        System.out.println("잔액이 부족합니다.");
                    }
                } else if (결제방법.equals("카드")) {
                    System.out.println("카드를 선택하셨습니다. 결제가 완료되었습니다.");
                } else {
                    System.out.println("올바른 결제 방법이 아닙니다.");
                }
            } else { // 음료가 존재하지 않는 경우
                System.out.println("해당 음료는 없습니다. 다시 선택해 주세요.");
            }
        }

        // Scanner 닫기
        입력.close();
    }
}
