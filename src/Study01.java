public class Study01 {

    public Study01(){}

    public static void main(String[] ar) {
        Study01 study = new Study01();
        int a = study.returnOne();
        Study01 study1 = new Study01();
        String b = study1.returnString();
        System.out.println(a+" "+b);


    }

    public int returnOne() {
        return 1;
    }

    public String returnString(){
        return "할 수 있을까...";
    }
}