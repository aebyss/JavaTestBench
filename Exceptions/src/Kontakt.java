public class Kontakt {
    private String vorname;
    private String nachname;

    private int telnr;

    public Kontakt(String vorname, String nachname, int telnr) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.telnr = telnr;
    }

    public void setNachname(String name) throws InvalidNameException {
        if(nachname.matches(".*\\d+.*")) {
            throw new InvalidNameException("Der Nachname kann nicht numerisch sein");
        }
        this.nachname = name;
    }


}
