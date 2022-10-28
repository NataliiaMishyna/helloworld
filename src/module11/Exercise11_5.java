package module11;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class Exercise11_5 {
    public static void main(String[] args) {
        Stream <String> first = Stream.of("1", "2", "3");
        Stream <String> second = Stream.of("a", "b", "c", "d");
        zipIterator(first, second)
                .peek(System.out::println)
                .collect(Collectors.toList());
    }

    public static <T> Stream <T> zipIterator(Stream <T> first, Stream<T> second) {
        Iterator<T> iteratorFirst = first.iterator();
        Iterator<T> iteratorSecond = second.iterator();
        List<T> result = new ArrayList<>();
        while (iteratorFirst.hasNext() && iteratorSecond.hasNext()) {
            result.add(iteratorFirst.next());
            result.add(iteratorSecond.next());
        }
        return result.stream();
    }
}
