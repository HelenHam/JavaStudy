public class Study06 {

    public static void main(String[] args) {
    /*             
        for(int 단 = 1 ; 단 <= 9 ; 단++){
            for(int i = 1 ; i <= 9 ; i++){
                System.out.println(단+ " * " + i + " = " + (단 * i));}
        }
    }
    for(int dan=9 ; dan>=1 ; dan--){
        for(int i = 1 ; i <= 9; i++){
            System.out.println(dan + " * " + i + " = " + (dan*i));}
        }*/

        int[] score = {70, 45, 29};
        
        for(int i=0 ; i<score.length ; i++){
            if(score[i]>=65){
                System.out.println((i+1)+"번 학생은 합격입니다.");
            }
            else{
                System.out.println((i+1)+"번 학생은 불합격입니다.");
            }
        }
    }
        
    
}
