import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        List<Hund> hundeListe = new ArrayList<>();
        System.out.println("Unser Tierheim hat viele Hunde");

        //anonyme klasse kann auch mit lambda ersetzt werden
        ThreadMaker.lassInHintegrundLaufen(() -> {
            for (int i = 0; i < 1000; i++) {
                Hund hund = new Hund("Doggo" + i);
                hundeListe.add(hund);
            }
        });

        System.out.println("Das sind unsere Hunde: ");
        for (Hund hund : hundeListe) {
            System.out.println(hund.getName());
        }
    }
}