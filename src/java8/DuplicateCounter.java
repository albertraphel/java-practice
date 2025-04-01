package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateCounter {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("abs", "abs", "pqr", "123", "pqr");
        Map<String, Long> countMap = items.parallelStream()
                .collect(Collectors.groupingBy(e->e,Collectors.counting()));

        List<String> uniqueItems = new ArrayList<>( countMap.keySet());

        System.out.println("Unique items: "+ uniqueItems);

        System.out.println("Duplicates: ");

        countMap.forEach((item, count) -> {
            if(count >1){
                System.out.println(item + " " + count);
            }
        });


    }
}
