public class Study14 {

    public static void main(String[] args) {

        A a = new A();
        System.out.println(a);
        

    }
    
    static class A{
        public A(){}
        public A(int a){}
        public A(int a, int b){} // 변수명과 전달받는 자료형이 달라야 함
        public String toString(){
            return "A 클래스 객체 생성 완료";
        }
    }
}
