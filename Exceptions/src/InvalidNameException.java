public class InvalidNameException extends Exception {
    private String name;

    public InvalidNameException(String x) {
        this.name = x;
    }

    public String getInvalidName() {
        return name;
    }
}
