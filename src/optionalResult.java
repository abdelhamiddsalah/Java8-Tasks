import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;

public class optionalResult {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        Optional<Integer> result= list.stream().max(Comparator.naturalOrder());
        System.out.println(result);
    }
}
