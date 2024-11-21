public class Study04 {

    public static void main(String[] args) {
        
        int a = 5;
        int b = 3;

        if(a<b){
            System.out.println("a가 b보다 작음");
        }
        else if(a==b){
            System.out.println("a와 b가 같음");
        }
        else{
            System.out.println("a가 b보다 큼");
        }

        if(a==b){
            System.out.println("참");
        }
        if(a!=b){
            System.out.println("참");
        }
        if(a<b){
            System.out.println("참");
        }
        if(a<=b){
            System.out.println("참");
        }
        if(a>b){
            System.out.println("참");
        }
        if(a>=b){
            System.out.println("참");
        }

        int c = 3;
        int d = 4;
        
        if(c==d){
            System.out.println("c와 d는 같은 숫자");
        }else{
            System.out.println("c와 d는 다른 말");
        }

        System.out.println(a==b);


    }
    
}
