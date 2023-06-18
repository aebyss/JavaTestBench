import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Bestellung {
    public String gast;
    public List<String> getraenke;

    public static Set<String> getAllDrinks(List<Bestellung> bestellungen) {
        Set<String> alleGetraenke = new HashSet<>();

        for(Bestellung bestellung : bestellungen) {
            alleGetraenke.addAll(bestellung.getraenke);
        }
        return alleGetraenke;
    }
}
