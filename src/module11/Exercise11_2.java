package module11;

import java.util.List;
import java.util.stream.Collectors;

public class Exercise11_2 {
    public static void main(String[] args) {
        List<String> name = List.of(
                "Nataliia",
                "Petro",
                "Aleksey",
                "Lubov"
        );

        System.out.println(noPairedNamesToString(name));

    }


    public static String noPairedNamesToString(List <String> namesList) {

        return (String) namesList.stream()
                .sorted(((o1, o2) -> o2.compareTo(o1)))
                .map(o -> o.toUpperCase())
                .collect(Collectors.joining(", "));
    }
}