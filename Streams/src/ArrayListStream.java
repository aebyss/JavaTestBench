import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class ArrayListStream {


    public static void main(String[] args) {

        byte by = 0b01111111;
        System.out.println(by);

        List<String> students = List.of("Peter", "Paul", "Marie");
        Predicate<String> studentTest = student -> student.startsWith("M");
        boolean b = students.stream().anyMatch(studentTest);
        System.out.println(b);
    }

    public static void soutWithEm(String s) {
        System.out.println(s + "!");
    }
}
