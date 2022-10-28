package module11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise11_3 {
    public static void main(String[] args) {
        String[] mas = {
                "1, 2, 0",
                "4, 5"
        };

        List<String> res = Arrays.stream(mas)
                .map(nameLine -> Arrays.asList(nameLine.split(", ")))
                .flatMap(l -> l.stream())
                .sorted()
                .collect(Collectors.toList());
        System.out.println(res);
    }
}
