public class Unterklasse extends Oberklasse {

    public void methodeA(Unterklasse obj) {
        System.out.println("Methode A der Unterklasse");
    }

    public void methodeA(Oberklasse obj) {
        System.out.println("Methode A der Unterklasse");
    }
}
