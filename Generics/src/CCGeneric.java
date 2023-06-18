import java.util.ArrayList;
import java.util.List;

public class CCGeneric <T> extends BBGeneric<T> {
    public static void main(String[] args) {
        BBGeneric<String> o1 = new CCGeneric<String>();
        BBGeneric<List<Integer>> o2 = new BBGeneric<List<Integer>>();
        AAGeneric o3 = new CCGeneric<Integer[]>();
        BBGeneric<? super Integer> o4 = new CCGeneric<>();
    }
}
