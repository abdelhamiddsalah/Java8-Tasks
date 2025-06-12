import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

      list.add(1);
      list.add(2);
      list.add(3);
      list.add(4);
      list.add(5);
      list.add(5);

      System.out.println(list);

        System.out.println("**********************************************************************");
      list.forEach(System.out::println);
        System.out.println("**********************************************************************");
      list.stream().filter(x -> x%2 == 0).forEach(System.out::println);
        System.out.println("**********************************************************************");
       long count= list.stream().count();
       System.out.println(count);
      System.out.println("**********************************************************************");
       list.stream().map(x ->(x%2==0)? x*2: x).forEach(System.out::println);
        System.out.println("**********************************************************************");
      boolean result=  list.stream().anyMatch(x -> x<0);
      System.out.println(result);
        System.out.println("**********************************************************************");
        boolean result2= list.stream().allMatch(x -> x>0);
        System.out.println(result2);
        System.out.println("**********************************************************************");
        boolean result3= list.stream().noneMatch(x -> x>0);
        System.out.println(result3);
        System.out.println("**********************************************************************");
        List<Integer> numbers = list.stream().map(x -> x+1).collect(Collectors.toList());
        System.out.println(numbers);
        System.out.println("**********************************************************************");
        list.stream().limit(3).forEach(System.out::println);
        System.out.println("**********************************************************************");
        list.stream().skip(3).forEach(System.out::println);
        System.out.println("**********************************************************************");
        list.stream().distinct().forEach(System.out::println);
        System.out.println("**********************************************************************");
       int sum= list.stream().reduce(0, (a,b) -> a+b);
       System.out.println(sum);
        System.out.println("**********************************************************************");
        list.stream().sorted((a,b)->b-a).forEach(System.out::println);
    }





}
