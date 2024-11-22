public class Study10 {

    public static void main(String[] args) {
        /*
        String[] dan1 = new String[9];
        int[] dan1R = new int[9];

        for(int i = 1 ; i <= dan1.length ; i++){
            // System.out.println(1 + " * " + i + " = " + (1*i));
            dan1[i-1] = (1+" * "+i+" = "+(1*i));
            dan1R[i-1]=(1*i);
            System.out.println(dan1[i-1]);
            System.out.println(dan1R[i-1]);
        };
        */

        int[] for1 = new int[5];

        for(int i = 1 ; i <= for1.length ; i++){
            for1[i-1] = (i*6);
            System.out.println(for1[i-1]);
        }
    }
    
}
