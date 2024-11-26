import java.util.ArrayList;
import java.util.List;

public class Study21 {

    public static void main(String[] args) {
        
        List<String> list = new ArrayList<>();
        // list.add(1);
        list.add("1");
        // list.add(true);
        list.add("일");
        list.add("One");

        System.out.println(list.get(2));

        list.remove(1);
        System.out.println(list.get(1));

    }
    
}
