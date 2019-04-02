package jonss.github.com;


import java.util.Arrays;
import java.util.List;

public class Lambda {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 4, 5, 6);

        numbers.forEach(System.out::println);
        System.out.println("------------------------------------");

        numbers.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
    }

}
