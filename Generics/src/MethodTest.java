import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MethodTest {

    public static <T extends Number> T name(T a, T b) {
        return Math.random() > 0.5 ? a : b;

    }



    public static void main(String[] args) {
        String inputFile = "F:\\SchoolWorkspace\\TestBench\\Generics\\src\\testFile";
        String outputFile = "F:\\SchoolWorkspace\\TestBench\\Generics\\src\\testFilez";
        try(Stream<String> w_stream = Files.lines(Paths.get(inputFile))) {
            List<String> wordlisit = w_stream.flatMap(string -> Stream.of(string.split(" ")))
                    //ziele
                    .filter(s -> s.length() > 6) //länge
                    .map(String::toLowerCase)
                    .distinct()
                    .sorted()
                    .collect(Collectors.toList());

            Files.write(Paths.get(outputFile), wordlisit, Charset.defaultCharset());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
