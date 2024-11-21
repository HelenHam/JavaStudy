public class Test01 {

    public static void main(String[] args) {
        /* 
        int a = 10;
        boolean b = false;
        System.out.println((a + b));
        // int와 boolean은 연산이 안 되기 때문에 자료형을 통일해줘야 하지는 않을까......
        */

        String c = "자바"; // c는 문자열 "자바"고
        String d = new String("자바"); // d는 String에서 새로 참조한 객체...
        if(c==d){
            System.out.println("참");
        }
        else {
            System.out.println("거짓");
        } //거짓

        for(int 단 = 2; 단 <= 9 ; 단=단+2){
            System.out.println(단+"단");
            for(int i=1; i <=9; i++){
                System.out.print(단 + " * " + i + " = " + (단*i) + "\t");
            }
            System.out.println();
        }

    }
    
}
