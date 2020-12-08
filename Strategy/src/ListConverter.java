import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class ListConverter {

    public static void main(String[] args) {

        final List<String> mainList = Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i");
        final AtomicInteger idx = new AtomicInteger(0);

        // Here's the solution to all three underneath
        final int size = 3;

        final Collection<List<String>> rows;
        rows = mainList.stream()
                .collect(Collectors.groupingBy(
                        it -> idx.getAndIncrement() / size
                ))
                .values();

        final String result = rows.stream()
                .map(row -> String.join(",", row))
                .collect(Collectors.joining("\n"));

        System.out.println(result);
    }
}
