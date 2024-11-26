import java.util.ArrayList;
import java.util.List;

public class Study20 {

    public static void main(String[] args) {
        
        List list = new ArrayList<>();
        list.add(1);
        list.add("1");
        list.add(true);

        // System.out.println(list.get(0) instanceof Integer);
        System.out.println(list.size());

        list.remove(0);
        System.out.println(list.size());
        System.out.println(list.get(0) instanceof String);
    }
    
}
