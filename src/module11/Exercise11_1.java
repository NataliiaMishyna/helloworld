package module11;

import java.util.List;
import java.util.stream.Collectors;

public class Exercise11_1 {
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

        return namesList.stream()
                .filter(o -> (namesList.indexOf(o)+1) % 2 != 0)
                .collect(Collectors.joining(", "));
    }
}