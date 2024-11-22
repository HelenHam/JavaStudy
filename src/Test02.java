public class Test02 {

    public static void main(String[] args) {

        String O = "O";
        String X = "X";

        /*
        String[] Al = new String[10];

        for( int i = 0 ; i < Al.length ; i++){
            if(i % 2 == 0){
                Al[i] = "O";
            }else{
                Al[i] = "X";
            }
            System.out.print(Al[i]);
        }
*/

String[][] Al2 = new String[5][3];

for (int i = 0; i < Al2.length ; i++) { // 행을 위한 for문

    for(int j = 0 ; j < Al2[i].length ; j++){ // 열을 위한 for문
        if (j == 1) {
            Al2[i][j] = (i%2 == 0) ? X : O;
        }else{
            Al2[i][j] = (i%2 == 0) ? O : X;
        }

        System.out.print(Al2[i][j]);
    }
    System.out.println();
        }




    }}
