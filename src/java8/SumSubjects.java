package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SumSubjects {
    public static void main(String[] args) {
        List<String> subjects = Arrays.asList("Maths_100", "Hindi_20", "Maths_20");

        Map<String, Long> subjectSum = subjects.parallelStream()
                .map(s -> s.split("_"))
                .collect(Collectors.groupingBy(
                        arr -> arr[0],
                        Collectors.summingLong(arr -> Long.parseLong(arr[1]))

                ));
//print
        subjectSum.forEach((item, mark) ->
                System.out.println(item + " " + mark)
        );

    }
}
